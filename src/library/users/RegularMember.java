package library.users;

import library.Member;
import library.LibraryItem;

public class RegularMember extends LibraryUser implements Member {
    public RegularMember(int userId, String userName) {
        super(userId, userName);
    }

    @Override
    public void viewAccountDetails() {
        System.out.println("Viewing account for: " + userName);
    }

    @Override
    public void payFine(double amount) {
        System.out.println("Paid fine: $" + amount);
    }

    @Override
    public void borrowItem(LibraryItem item) {
        System.out.println(userName + " borrowed " + item.getDetails());
    }

    @Override
    public void returnItem(LibraryItem item) {
        System.out.println(userName + " returned " + item.getDetails());
    }
}
