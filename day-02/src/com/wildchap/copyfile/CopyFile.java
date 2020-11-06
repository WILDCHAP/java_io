package com.wildchap.copyfile;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @program: java_io
 * @description: 利用FileReader和FileWrite复制文件
 * @author: zy wang
 * @create: 2020-11-06 17:09
 */
public class CopyFile {
    public static void main(String[] args) throws Exception{
        //字符流-读取
        FileReader fileReader = new FileReader("D:\\实习资料\\代码\\java_io\\day-02\\1.txt");
        //字符流-写入
        FileWriter fileWriter = new FileWriter("D:\\实习资料\\代码\\java_io\\day-02\\2.txt");
        int data = 0;
        while ((data = fileReader.read()) != -1){
            fileWriter.write(data);
            fileWriter.flush();
        }
        fileWriter.close();
        fileReader.close();
    }
}
