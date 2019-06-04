package test;

public class People {

    public void run() {
        System.out.println("run");
    }

    public void jump() {
        run();
        System.out.println("jump");
    }
}
