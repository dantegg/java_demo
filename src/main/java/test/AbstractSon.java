package main.java.test;

public class AbstractSon extends AbstractSource {

    private int hh = 10;

    @Override
    public void print() {
        System.out.println("hh = " + hh);
    }

    public static void main(String... args) {
        AbstractSon son = new AbstractSon();
        son.print();
    }
}
