package library.users;

import library.LibraryItem;
import library.Staff;

public class Librarian extends LibraryUser implements Staff {
    public Librarian(int userId, String userName) {
        super(userId, userName);
    }

    @Override
    public void viewAccountDetails() {
        System.out.println("Viewing librarian account for: " + userName);
    }

    @Override
    public void payFine(double amount) {
        System.out.println("Librarian cannot have fines.");
    }

    @Override
    public void addItem(LibraryItem item) {
        System.out.println("Added " + item.getDetails() + " to the library.");
    }

    @Override
    public void removeItem(LibraryItem item) {
        System.out.println("Removed " + item.getDetails() + " from the library.");
    }
}
