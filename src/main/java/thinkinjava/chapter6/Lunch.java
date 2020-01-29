package main.java.thinkinjava.chapter6;

public class Lunch {

    void testPrivate() {
        // error, cant do this! Private Constructor
        // Soup1 soup1 = new Soup1();
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}
