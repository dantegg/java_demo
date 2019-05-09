package test;

public class ExtendsC<ctx extends BasicC> {


    public void test(ctx c) {
        System.out.println("test result is " + c.getBaseString());
    }

}
