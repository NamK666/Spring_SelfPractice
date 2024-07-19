package MVCPractice;

public class MVCMain {
    public static void main(String[] args) {
        User model = new User("draco",20);
        UserView view = new UserView();
        UserController controller = new UserController(model,view);

        controller.updateView();

        controller.setUserName("Alice");
        controller.setUserAge(20);

        controller.updateView();
    }
}
