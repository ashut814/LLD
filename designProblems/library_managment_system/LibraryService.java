package designProblems.library_managment_system;

import java.util.HashMap;
import java.util.Map;

public class LibraryService {
    private final Map<String, BookInventory> inventoryMap = new HashMap<>(); // <bookId, BookInventory>
    private final NotificationService notificationService;

    public LibraryService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void addBook(Book book, int count) {
        inventoryMap.putIfAbsent(book.getId(), new BookInventory(book, count));
    }

    public void issueBook(String bookId, User user) {
        BookInventory inventory = inventoryMap.get(bookId);
        if (inventory != null && inventory.issueBook()) {
            notificationService.notifyUser(user, "Book issued: " + inventory.getBook().getTitle());
        } else {
            notificationService.notifyUser(user, "Book not available");
        }
    }


    public void returnBook(String bookId, User user) {
        BookInventory inventory = inventoryMap.get(bookId);
        if (inventory != null) {
            inventory.returnBook();
            notificationService.notifyUser(user, "Book returned: " + inventory.getBook().getTitle());
        }
    }

    public BookInventory getInventory(String bookId) {
        return inventoryMap.get(bookId);
    }



}
