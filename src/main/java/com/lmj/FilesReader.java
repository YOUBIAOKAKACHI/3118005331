package com.lmj;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FilesReader {
    public String fileRead(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(fileName);
        try {
            // 使用BufferedReader类来读取文件
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
            while ((s = br.readLine()) != null) {
                // 一次读一行
                stringBuilder.append(System.lineSeparator() + s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
