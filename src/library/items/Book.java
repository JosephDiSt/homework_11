package library.items;

import library.LibraryItem;

public class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author) {
        super(title, author);
    }

    public Book(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String getDetails() {
        return "Book: " + getTitle() + " by " + getAuthor();
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 0.5;
    }

    // Overloaded method for searching by title or genre
    public boolean search(String keyword) {
        return getTitle().contains(keyword) || genre.contains(keyword);
    }

    public boolean search(String title, String author) {
        return getTitle().equals(title) && getAuthor().equals(author);
    }
}
