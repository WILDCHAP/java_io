package com.wildchap.fileinputstream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @program: java_io
 * @description: 测试FileInputStream
 * @author: zy wang
 * @create: 2020-11-06 15:13
 */
public class TestFileInputStream {
    public static void main(String[] args) throws Exception{
        //采用文件路径构造函数
        File file = new File("D:\\实习资料\\代码\\java_io\\day-01\\1.txt");
        FileInputStream fis = new FileInputStream(file);
        int count = 0;
//        //方法1：一次读取一个字节，直到返回-1
//        System.out.println("方法1：一次读取一个字节，直到返回-1，read返回的是它的ascii码");
//        while ((count = fis.read()) != -1){
//            System.out.print((char)count);
//        }
//        System.out.println();
        //方法2：一次读取三个字节到指定的byte数组
//        System.out.println("方法2：一次读取三个字节到指定的byte数组");
//        byte [] bytes = new byte[3];
//        while ((count = fis.read(bytes)) != -1){
//            System.out.println(new String(bytes, 0, count));
//        }
        //方法3：直接读取文件长度
        System.out.println("方法3：直接读取文件长度");
        byte[] bytes = new byte[fis.available()];   //fis.available获取文件可读字节长度
        while ((count = fis.read(bytes)) != -1){
            System.out.println(new java.lang.String(bytes, 0, count));
        }

        fis.close();
    }
}
