package designProblems.library_managment_system;

public class Librarian extends User{
    public Librarian(String id, String name) {
        super(id, name);
    }

    @Override
    public void showUserType() {
        System.out.println("I am a Librarian");
    }
}
