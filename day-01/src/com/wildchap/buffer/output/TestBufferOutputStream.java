package com.wildchap.buffer.output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * @program: java_io
 * @description: 缓冲流-输出
 * @author: zy wang
 * @create: 2020-11-06 15:58
 */
public class TestBufferOutputStream {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("D:\\实习资料\\代码\\java_io\\day-01\\2.txt");
        //可以先写道缓冲区里，最后flush进硬盘
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(97);
        bos.write('b');
        String str = "hahaha";
        bos.write(str.getBytes(), 0, str.length());
        //将写入的数据进入硬盘
        bos.flush();
        bos.close();
    }
}
