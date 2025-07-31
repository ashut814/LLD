package designProblems.library_managment_system;

public class EmailNotificationService implements NotificationService {
    @Override
    public void notifyUser(User user, String message) {
        System.out.println("Sending email to " + user.getName() + " with message: " + message);
    }
}
