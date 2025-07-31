package designProblems.library_managment_system;

public abstract class User {
    private final String Id;
    private final String name;
    public User(String Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public abstract void showUserType();

    public String getName() {
        return name;
    }
}
