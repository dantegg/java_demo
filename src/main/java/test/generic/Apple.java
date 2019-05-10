package test.generic;

public class Apple extends Fruit {
    Apple() {}

    Apple(int price, int weight) {
        super(price, weight);
    }

    @Override
    public String toString() {
        return "Apple";
    }
}
