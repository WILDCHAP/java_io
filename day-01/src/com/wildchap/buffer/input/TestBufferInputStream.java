package com.wildchap.buffer.input;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * @program: java_io
 * @description: 缓冲流-输入
 * @author: zy wang
 * @create: 2020-11-06 15:49
 */
public class TestBufferInputStream {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("D:\\实习资料\\代码\\java_io\\day-01\\1.txt");
        //利用文件输入流实例化一个缓冲输入流
        //!!!!!!!
        //它内部维护着一个8k(8192)的缓冲区
        //!!!!!!!
        BufferedInputStream bis = new BufferedInputStream(fis);
        int data = 0;
        while ((data = bis.read()) != -1){
            System.out.print((char) data);
        }

        //只需要关缓冲流即可
        bis.close();
    }
}
