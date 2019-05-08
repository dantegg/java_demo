package ThreadLocalLearn;

public class ProcessThread extends Thread {
    User user;

    public ProcessThread(User user) {
        this.user = user;
    }

    @Override
    public void run() {
        try (UserContext ctx = new UserContext(user)) {
            // step 1
            new Greeting().hello();
            // step 2
            Level.checkLevel();
        }
    }
}
