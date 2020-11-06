package com.wildchap.filewriter;

import java.io.FileWriter;

/**
 * @program: java_io
 * @description: 字符流写文件
 * @author: zy wang
 * @create: 2020-11-06 17:06
 */
public class TestFileWriter {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("D:\\实习资料\\代码\\java_io\\day-02\\2.txt");
        for (int i = 0; i < 10; i++) {
            fw.write("我爱你中国\n");
            fw.flush();
        }
        fw.close();
    }
}
