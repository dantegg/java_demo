package ThreadLocalLearn;

public class Level {
    public static void checkLevel() {
        User user = UserContext.getCurrentUser();
        if (user.level > 100) {
            System.out.println(user.name + " is vip");
        } else {
            System.out.println(user.name + " is normal");
        }
    }
}
