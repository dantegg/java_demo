package main.java.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ThreadDeamon extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
