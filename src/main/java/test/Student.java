package main.java.test;

public class Student extends People {

    @Override
    public void run() {
        System.out.println("student run");
    }

    public static void main(String... args) {
        People s = new Student();
        s.jump();
    }
}
