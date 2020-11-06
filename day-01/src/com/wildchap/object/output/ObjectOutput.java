package com.wildchap.object.output;

import com.wildchap.object.pojo.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @program: java_io
 * @description: 对象流-输出（序列化，即将对象用序列化表示）
 * @author: zy wang
 * @create: 2020-11-06 16:21
 */
public class ObjectOutput {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("D:\\实习资料\\代码\\java_io\\day-01\\stu.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //利用writeObject方法序列化类
        oos.writeObject(new Student(1, "mao"));
        oos.close();
    }
}
