package com.wildchap.file.fileoutputstream;

import java.io.FileOutputStream;

/**
 * @program: java_io
 * @description: 测试FileOutputStream
 * @author: zy wang
 * @create: 2020-11-06 15:34
 */
public class TestFileOutputStream {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("D:\\实习资料\\代码\\java_io\\day-01\\1.txt");
        //写入一个ascii=97的
        fos.write(97);
        //写入一个'b'
        fos.write('b');
        //批量写入一个byte数组
        String str = "\nhellow world";
        fos.write(str.getBytes());  //string里的getBytes方法将其转换成byte数组
        fos.close();
    }
}
