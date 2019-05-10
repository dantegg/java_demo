package test.generic;

public class NodeDemo {

    public static void main(String... args) {
        Node<Apple> apple = new Node<>(new Apple(), null);
       // Node<Fruit> fruit = apple;
        Node<? extends Fruit> fruit = apple;
    }
}