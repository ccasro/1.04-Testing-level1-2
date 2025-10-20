package org.ccasro.level1.exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Library {
    private List<Book> bookList;
    private final Comparator<Book> TITLE_COMPARATOR = Comparator.comparing(b-> b.getTitle().toLowerCase());

    public Library(){
        this.bookList = new ArrayList<>();
    }

    public boolean addBook(Book book){
        if (book == null) { throw new IllegalArgumentException("Book cannot be null");}

        if (containsTitle(book.getTitle())) return false;
        bookList.add(book);
        sortList();
        return true;
    }

    private boolean containsTitle(String title) {
        return bookList.stream().anyMatch(b->b.getTitle().equalsIgnoreCase(title));
    }

    private void sortList(){
        bookList.sort(TITLE_COMPARATOR);
    }

    public List<Book> getAllBooks(){
        return List.copyOf(bookList);
    }

    public String getTitleByPos(int position){
        if(position < 0 || position >= bookList.size()) {
            return null;
        }
        return bookList.get(position).getTitle();
    }

    public int getSize(){
        return bookList.size();
    }

    public boolean addBookAtPosition(Book book, int position){
        if (book == null) throw new IllegalArgumentException("Book cannot be null");
        if(position < 0 || position >= bookList.size()) throw new IndexOutOfBoundsException(("Invalid position"));
        if (containsTitle(book.getTitle())) return false;
        bookList.add(position,book);
        sortList();
        return true;
    }

    public boolean removeBookByTitle(String title){
        Optional<Book> found = bookList.stream().filter(b->b.getTitle().equalsIgnoreCase(title)).findFirst();

        if (found.isPresent()) {
            bookList.remove(found.get());
            sortList();
            return true;
        }
        return false;
    }
}
