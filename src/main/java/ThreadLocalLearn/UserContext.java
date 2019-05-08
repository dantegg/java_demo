package ThreadLocalLearn;

public class UserContext implements AutoCloseable {
    static final ThreadLocal<User> context = new ThreadLocal<>();

    public static User getCurrentUser() {
        return context.get();
    }

    public UserContext(User user) {
        context.set(user);
    }

    @Override
    public void close() {
        context.remove();
    }
}
