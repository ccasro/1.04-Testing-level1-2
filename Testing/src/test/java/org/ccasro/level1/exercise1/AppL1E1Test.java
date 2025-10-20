package org.ccasro.level1.exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AppL1E1Test {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
        library.addBook(new Book("Neverending Story", "Michael Ende"));
        library.addBook(new Book("The Lord of the Rings", "J.R.R Tolkien"));
        library.addBook(new Book("Ulysses", "James Joyce"));
    }

    @Test
    void listIsNotNull() {
        Library lib = new Library();
        assertNotNull(lib.getAllBooks(), "The list cannot be null after creation");
    }

    @Test
    void listSizeIsAsExpected() {
        assertEquals(3, library.getSize());
    }

    @Test
    void listContainsBookInPosition() {
        List<Book> allBooks = library.getAllBooks();
        assertEquals("Neverending Story", allBooks.get(0).getTitle());
        assertEquals("The Lord of the Rings", allBooks.get(1).getTitle());
        assertEquals("Ulysses", allBooks.get(2).getTitle());
    }

    @Test
    void noDuplicateBookTitles() {
        int sizeBef = library.getSize();
        boolean addDuplicate = library.addBook(new Book("Neverending Story", "Michael Ende"));
        assertFalse(addDuplicate, "A book shouldn't be added with the same title");
        assertEquals(sizeBef, library.getSize(), "The size of the library should be the same as before");
    }

    @Test
    void canRetrieveBookBySpecificPos() {
        String title = library.getTitleByPos(2);
        assertEquals("Ulysses", title);
    }

    @Test
    void addingBookModifiesList() {
        int before = library.getSize();
        boolean added = library.addBook(new Book("Test", "Test"));
        assertTrue(added, "A new Book should be added");
        assertEquals(before + 1, library.getSize(), "The size of the list must increase");

        int before2 = library.getSize();
        boolean added2 = library.addBookAtPosition(new Book("Test2","Test2"),1);
        assertTrue(added2,"The book should be added");
        assertEquals(before2 + 1 ,library.getSize(),"The size of the list must increase");
    }

    @Test
    void removingBookDecreasesSize() {
        int before = library.getSize();
        boolean removed = library.removeBookByTitle("The Lord of the Rings");
        assertTrue(removed, "The book should be removed");
        assertEquals(before - 1, library.getSize(), "The size of the list must decrease");
    }

    @Test
    void listRemainsSortedAfterAddOrRemove() {
        library.addBook(new Book("test1", "Test1"));
        List<String> titlesAfterAdd = library.getAllBooks().stream().map(Book::getTitle).toList();

        List<String> sortedCopyAfterAdd = titlesAfterAdd.stream().sorted(String.CASE_INSENSITIVE_ORDER).toList();
        assertEquals(sortedCopyAfterAdd, titlesAfterAdd, "The list must remain sorted after add books");

        library.removeBookByTitle("test1");
        List<String> titlesAfterRemove = library.getAllBooks().stream().map(Book::getTitle).toList();

        List<String> sortedCopyAfterRemove = titlesAfterRemove.stream().sorted(String.CASE_INSENSITIVE_ORDER).toList();
        assertEquals(sortedCopyAfterRemove,titlesAfterRemove,"The list must remain sorted after remove books");
    }
}
