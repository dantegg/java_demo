package test.generic;

public class BoundDemo {

    public static void main(String... args) {
        Animal a = new Animal();
        Duck<Animal> da = new Duck<>();
        Duck<Human> dh = new Duck<>();
        //Duck<Toy> toyDuck = new Duck<Toy>();
    }
}
