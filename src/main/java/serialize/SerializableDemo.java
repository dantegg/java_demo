package serialize;

import java.io.*;

public class SerializableDemo {

    public static void main(String... args) throws IOException, ClassNotFoundException {
        // 创建可序列化对象
        System.out.println("原来的对象：");
        Student stu = new Student("Ming", 16);
        System.out.println(stu);
        // 创建序列化输出流
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buff);
        out.writeObject(stu);
        Student.QQ  = 123333;
        stu.setAge(18);
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buff.toByteArray()));
        Student newStu = (Student) in.readObject();
        System.out.println("序列化后取出的对象：");
        System.out.println(newStu);
    }
}
