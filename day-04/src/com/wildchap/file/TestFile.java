package com.wildchap.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * 主要：
 * （1）分隔符
 * （2）文件操作
 * （3）文件夹操作
 * @program: java_io
 * @description: File类
 * @author: zy wang
 * @create: 2020-11-06 20:18
 */
public class TestFile {
    public static void main(String[] args) throws Exception{
        separator();
        fileop();
        directory();
    }
    /*
    (1)分隔符
     */
    public static void separator(){
        System.out.println("路径之间的分隔符: " + File.pathSeparator);
        System.out.println("单个路径名称之间的分隔符: " + File.separator);
    }
    /*
    （2）文件操作
     */
    public static void fileop() throws IOException, InterruptedException {
        //1.创建文件
        File file = new File("1.txt");   //只是创建对象
        if(!file.exists()) {
            boolean b = file.createNewFile();
            System.out.println("创建结果为：" + b);
        }

        //2.删除文件
        //2.1自动删除
        //System.out.println("删除结果为：" + file.delete());
        //2.2线程结束后删除
        //file.deleteOnExit();
        //Thread.sleep(5000);

        //3.获取文件信息
        System.out.println(file.getAbsolutePath()); //获取绝对路径
        System.out.println(file.getName());         //获取文件名
        System.out.println(file.getParent());       //获取父目录
        System.out.println(file.length());          //获取文件长度
        System.out.println(new Date(file.lastModified()));    //获取文件创建时间

        //4.判断
        System.out.println(file.canRead());     //是否可读
        System.out.println(file.isFile());      //是否是文件
        System.out.println(file.isHidden());    //是否隐藏
        System.out.println(file.isDirectory()); //是否文件夹
    }
    /*
    （3）文件夹操作
     */
    public static void directory(){
        //1.创建文件夹
        File dir = new File("dir");
        if(!dir.exists()){
            System.out.println("创建文件夹结果：" + dir.mkdir());
        }
        //2.删除文件夹
        //System.out.println("删除文件结果：" + dir.delete());
        //3.获取文件夹信息
        System.out.println(dir.getAbsolutePath());
        //4.判断
        System.out.println(dir.isDirectory());
        //5.遍历
        for(String s:dir.list()){
            System.out.println(s);
        }
        for(File f:dir.listFiles()){
            if(f.isDirectory()){
                f.delete();
            }
        }
    }
}
