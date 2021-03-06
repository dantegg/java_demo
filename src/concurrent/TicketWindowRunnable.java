package concurrent;

import java.util.concurrent.TimeUnit;

public class TicketWindowRunnable implements Runnable {
    private int index = 1;

    private final static int MAX = 500;

    private final static Object MUTEX = new Object();

    @Override
    public void run() {
        synchronized (MUTEX) {
            while (index <= MAX) {
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + " 的号码是： " + (index++));
                }
        }

    }

    public static void main(String... args) {
        final TicketWindowRunnable task = new TicketWindowRunnable();
        Thread windowThread1 = new Thread(task, "一号窗口1");
        Thread windowThread2 = new Thread(task, "二号窗口2");
        Thread windowThread3 = new Thread(task, "三号窗口3");
        Thread windowThread4 = new Thread(task, "四号窗口4");

        windowThread1.start();
        windowThread2.start();
        windowThread3.start();
        windowThread4.start();
//        TicketWindow ticketWindow1 = new TicketWindow("一号出号机");
//        TicketWindow ticketWindow2 = new TicketWindow("二号出号机");
//        TicketWindow ticketWindow3 = new TicketWindow("三号出号机");
//        TicketWindow ticketWindow4 = new TicketWindow("四号出号机");
//        ticketWindow1.start();
//        ticketWindow2.start();
//        ticketWindow3.start();
//        ticketWindow4.start();
    }
}
