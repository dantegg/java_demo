package test.generic;

public class Banana extends Fruit {

    Banana() {}

    Banana(int price, int weight) {
        super(price, weight);
    }

    @Override
    public String toString() {
        return "Banana";
    }
}
