package countdownlatchtest;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    static CountDownLatch c = new CountDownLatch(2);

    public static void main(String... args) throws InterruptedException{
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是线程1，我在解析第一个sheet。。");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我是线程1，第一个sheet解析完成。");
                c.countDown();
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是线程2，我在解析第二个sheet。。");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我是线程2，第二个sheet解析完成。");
                c.countDown();
            }
        });
        t2.start();
        c.await();
        System.out.println("文档解析完成！");
    }
}
