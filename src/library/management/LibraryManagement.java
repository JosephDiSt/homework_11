package library.management;

import library.LibraryItem;
import library.users.RegularMember;

public class LibraryManagement {
    public static void manageBorrowing(RegularMember member, LibraryItem item) {
        member.borrowItem(item);
    }

    public static void manageReturning(RegularMember member, LibraryItem item) {
        member.returnItem(item);
    }

    public static void main(String[] args) {
        // Example of how the management system would work
        RegularMember member = new RegularMember(101, "Joe");
        LibraryItem book = new library.items.Book("How to Play Golf", "JoeBuckets");

        manageBorrowing(member, book);
        manageReturning(member, book);
    }
}
