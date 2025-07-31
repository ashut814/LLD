package designProblems.library_managment_system;

public class BookInventory {
    private final Book book;
    private int totalCopies;
    private int availableCopies;
    public BookInventory(Book book, int totalCopies, int availableCopies) {
        this.book = book;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
    }

    public BookInventory(Book book, int totalCopies) {
        this.book = book;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    public boolean issueBook() {
        if (availableCopies > 0) {
            availableCopies--;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (availableCopies < totalCopies) {
            availableCopies++;
            return true;
        }
        return false;
    }

    public void addBook() {
        totalCopies++;
        availableCopies++;
    }

    public Book getBook() {
        return book;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }
}
