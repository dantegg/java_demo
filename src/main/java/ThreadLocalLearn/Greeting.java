package main.java.ThreadLocalLearn;

public class Greeting {
    public void hello() {
        User user = UserContext.getCurrentUser();
        System.out.println("Hello, " + user.name);
    }
}
