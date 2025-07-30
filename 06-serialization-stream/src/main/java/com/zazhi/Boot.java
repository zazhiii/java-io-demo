package com.zazhi;

import java.io.*;

/**
 * @author lixh
 * @since 2025/7/30 21:43
 */
public class Boot {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 序列化和反序列化
        Student student = new Student("张三", 20);
        String filePath = "06-serialization-stream/src/main/java/com/zazhi/student.ser";

        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(student);
        oos.flush();
        oos.close();

        // 反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        Student s = (Student) ois.readObject();
        System.out.println(s.toString());
        ois.close(); // 关闭流，释放资源

    }

    record Student(String name, int age) implements Serializable {
        @Serial
        private static final long serialVersionUID = 1L; // 序列化版本号
    }
}


