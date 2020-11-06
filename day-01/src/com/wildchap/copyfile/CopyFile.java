package com.wildchap.copyfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @program: java_io
 * @description: 把一个文件复制到另一个文件
 * @author: zy wang
 * @create: 2020-11-06 15:38
 */
public class CopyFile {
    public static void main(String[] args) throws Exception{
        //输入流
        FileInputStream fis = new FileInputStream("D:\\实习资料\\代码\\java_io\\day-01\\1.txt");
        //输出流
        FileOutputStream fos = new FileOutputStream("D:\\实习资料\\代码\\java_io\\day-01\\2.txt");
        int count = 0;
//        //读一个写一个
//        while ((count = fis.read()) != -1){
//            fos.write((char)count);
//        }
        //三个三个一写
        byte[] b = new byte[3];
        while ((count = fis.read(b)) != -1){
            fos.write(b, 0, count);
        }

        fis.close();
        fos.close();
    }
}
