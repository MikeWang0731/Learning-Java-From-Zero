package com.company.main;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {
	    // 创建File对象
        File file1 = new File("src/i-mooc.txt");
        System.out.println("是否是目录？" + file1.isDirectory());
        System.out.println("是否是文件？" + file1.isFile());

        // 创建目录
        File file2 = new File("src/myFile");
        // 首先判断这个路径是否存在，如果不存在，创建路径
        if (!file2.exists()) {
            file2.mkdir();  // 创建目录
        }

        // 创建新文件
        File file3 = new File("src/myFile/newTest.txt");
        if (!file3.exists()) {
            file3.createNewFile();
        } else {
            // 获取绝对路径，相对路径: file3.getPath()
            System.out.println("文件在" + file3.getAbsolutePath());
        }
    }
}
