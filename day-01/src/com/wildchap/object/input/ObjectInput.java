package com.wildchap.object.input;

import com.wildchap.object.pojo.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @program: java_io
 * @description: 对象流-输入（反序列化，将序列转换成对象）
 * @author: zy wang
 * @create: 2020-11-06 16:25
 */
public class ObjectInput {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("D:\\实习资料\\代码\\java_io\\day-01\\stu.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //利用readObject反序列化
        Student s = (Student) ois.readObject();
        System.out.println(s);
        ois.close();
    }
}
