package MVCPractice;

public class UserView {
    public void printUserDetails(User user){
        System.out.println("User Details:");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
    }
}
