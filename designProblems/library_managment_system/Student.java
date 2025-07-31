package designProblems.library_managment_system;

public class Student extends User {
    public Student(String id, String name) {
        super(id, name);
    }

    @Override
    public void showUserType() {
        System.out.println("I am a Student");
    }
}
