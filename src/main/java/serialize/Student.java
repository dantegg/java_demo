package serialize;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;

    private int age;


    public static int QQ = 1234;

    private transient String address = "china";

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name + "\n"
                + "age: " + age + "\n"
                + "QQ: " + QQ + "\n"
                + "address: " + address;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
