package designProblems.library_managment_system;

import java.util.List;
import java.util.stream.Collectors;

public class SearchService {
    private final List<BookInventory> bookInventories;

    public SearchService(List<BookInventory> bookInventories) {
        this.bookInventories = bookInventories;
    }

    public List<Book> searchByTitle(String title) {
        return bookInventories.stream()
                .map(BookInventory::getBook)
                .filter(b -> b.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }
}
