package library.items;

import library.LibraryItem;

public class Journal extends LibraryItem {
    private int issueNumber;

    public Journal(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public String getDetails() {
        return "Journal: " + getTitle() + ", Issue " + issueNumber;
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 0.3;
    }
}
