package test;

import org.junit.jupiter.api.Test;

public class TestC {


    @Test
    public void testC() throws Exception {
        ExtendsC2 c2 = new ExtendsC2();
        c2.setBaseString("hhh");
        ExtendsC ebc = new ExtendsC();
        ebc.test(c2);
        BasicC bc = new BasicC();
        bc.setBaseString("vvv");
        BasicC c3 = new ExtendsC2();
        System.out.println("====bc");
        ebc.test(bc);
    }
}
