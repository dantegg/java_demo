package main.java.protectedDemo2;

import org.junit.jupiter.api.Test;
import main.java.protectedDemo.Cookie;

public class Demo {

    @Test
    public void demoTest() {
        Cookie cookie = new Cookie();
        // cookie.bite()  不在同一个包下不能使用protected方法
    }
}
