package com.wildchap.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @program: java_io
 * @description: 字符流读文件
 * @author: zy wang
 * @create: 2020-11-06 16:56
 */
public class TestFileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\实习资料\\代码\\java_io\\day-02\\1.txt");
        int count = 0;
        //方法1：一个一个字符读
//        while ((count = fr.read()) != -1){
//            System.out.print((char) count);
//        }
        //方法2：每次读取1024个字符
        char[] chars = new char[1024];
        while ((count = fr.read(chars)) != -1){
            System.out.println(new String(chars, 0, count));
        }
        fr.close();
    }
}
