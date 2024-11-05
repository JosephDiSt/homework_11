package library.users;

public abstract class LibraryUser {
    protected int userId;
    protected String userName;

    public LibraryUser(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public abstract void viewAccountDetails();
    public abstract void payFine(double amount);
}
