package concurrent;

import java.util.concurrent.TimeUnit;

public class ThreadInterrupt {
    public static void main(String... args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                TimeUnit.MINUTES.sleep(1);
                System.out.println("success");
            } catch (InterruptedException e) {
                System.out.println("oh, I am be interrupted!!!");
            }
        });

        thread.start();

        TimeUnit.MILLISECONDS.sleep(2);

        thread.interrupt();
    }
}
