package com.wildchap.printwrite;

import java.io.PrintWriter;

/**
 * @program: java_io
 * @description: 打印流-打印数据到文件
 * @author: zy wang
 * @create: 2020-11-06 17:36
 */
public class TestPrintWrite {
    public static void main(String[] args) throws Exception{
        PrintWriter printWriter = new PrintWriter("D:\\实习资料\\代码\\java_io\\day-03\\1.txt");

        printWriter.println(97);
        printWriter.println(true);
        printWriter.println('b');

        printWriter.close();
    }
}
