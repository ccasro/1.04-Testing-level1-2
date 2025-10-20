package org.ccasro.level1.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    public Library(){
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book){
        bookList.add(book);
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

    public boolean addBookAtPosition(Book book, int position){
        if(position < 0 || position >= bookList.size()) {
            return false;
        }
        bookList.add(position,book);
        return true;
    }

    public boolean removeBookByTitle(String title){
        return bookList.removeIf(b->b.getTitle().equalsIgnoreCase(title));
    }
}
