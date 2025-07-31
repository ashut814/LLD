package designProblems.library_managment_system;

public class Book {
    private final String id;
    private final String title;
    private final String author;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }
}