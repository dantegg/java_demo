package main.java.protectedDemo;

import org.junit.jupiter.api.Test;

public class Demo extends Cookie{

    private Cookie cookie = new Cookie();
    @Test
    public void test() {

        System.out.println(cookie.getClass().getDeclaredMethods().length);
        bite();
    }
}
