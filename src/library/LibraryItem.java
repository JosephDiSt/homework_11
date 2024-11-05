package library;

public abstract class LibraryItem {
    private String title;
    private String author;
    protected int yearPublished;

    public LibraryItem(String title) {
        this.title = title;
    }

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract String getDetails();

    public abstract double calculateFine(int overdueDays);

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
