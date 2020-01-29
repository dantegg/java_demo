package main.java.test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    static class Food{}
    static class Fruit extends Food{}
    static class Apple extends Fruit{}
    static class RedApple extends Apple{}

    public static int LOOP = 1000;


    public static SharedObject shared = new SharedObject();


    public static void main(String args[]) throws InterruptedException {
//        Runnable r = new ThreadLearn("haha");
//        Runnable r2 = new ThreadLearn("zzz");
//        System.out.println("test start");
//        Thread testThread1 = new Thread(r);
//        Thread testThread2 = new Thread(r2);
//        testThread2.start();
//        testThread1.start();
//        testThread2.join(1);
//        System.out.println("test end");
//          HelloThread t1 = new HelloThread();
//          t1.start();
//          Thread.sleep(10000);
//          t1.running = false;
//        List<? extends Fruit> flist = new ArrayList<Apple>();
//        flist.add(new Apple());
//        flist.add(new Fruit());
//        flist.add(new Food());
//        flist.add(null);
//        Fruit fruit = flist.get(0);
//        Apple apple = (Apple) flist.get(0);
//
//        List<? super Fruit> flist2 = new ArrayList<Fruit>();
//        flist2.add(new Fruit());
//        flist2.add(new Apple());
//        flist2.add(new RedApple());
//
//        List<Apple> testList = new ArrayList<>();
//        testList.add(new Apple());
//        List<? extends Fruit> flist123 = testList;
//        System.out.println(flist123.get(0).getClass().toString() + " class");
//        System.out.println(Apple.class.getClass().toString() + " apple ");
//        ThreadDeamon deamon = new ThreadDeamon();
//        deamon.setDaemon(true);
//        deamon.start();
//        Thread.sleep(5000);
//        System.out.println("main end");
//          Counter counter = new Counter();
//          AddThread addThread = new AddThread(counter);
//          DesThread desThread = new DesThread(counter);
//
//          addThread.start();
//          desThread.start();
//
//          addThread.join();
//          desThread.join();
//          System.out.println(counter.getCount());
        Athread athread = new Athread();
        Bthread bthread = new Bthread();

        athread.start();
        bthread.start();

        athread.join();
        bthread.join();

        System.out.println("main end");
    }

}
