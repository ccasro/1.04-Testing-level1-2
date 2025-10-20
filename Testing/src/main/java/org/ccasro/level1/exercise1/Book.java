package org.ccasro.level1.exercise1;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        if (title == null) throw new IllegalArgumentException("The title cannot be null.");
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
