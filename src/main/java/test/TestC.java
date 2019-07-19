package test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    @Test
    public void testDistinct() throws Exception {
        List<Long> ids = new ArrayList<>();
        ids.addAll(Arrays.asList(2L,3L,1L,4L, 5L,1L, 2L, 3L, 4L));
        List<Long> v = ids.stream().distinct().collect(Collectors.toList());
        v.forEach(x-> System.out.println(x));
    }
}
