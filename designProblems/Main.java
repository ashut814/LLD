package designProblems;

import designProblems.library_managment_system.*;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new EmailNotificationService();
        LibraryService libraryService = new LibraryService(notificationService);

        Book book1 = new Book("1", "Book 1", "Author 1");
        Book book2 = new Book("2", "Book 2", "Author 2");
        libraryService.addBook(book1, 10);
        libraryService.addBook(book2, 5);

        User student = new Student("1", "Student 1");

        libraryService.issueBook("1", student);
        libraryService.issueBook("2", student);
        libraryService.issueBook("2", student);
        libraryService.issueBook("2", student);
        libraryService.issueBook("2", student);
        libraryService.issueBook("2", student);
        libraryService.issueBook("2", student);

        libraryService.returnBook("2", student);
    }
}
