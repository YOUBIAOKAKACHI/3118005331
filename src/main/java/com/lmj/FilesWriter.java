package com.lmj;

import java.io.*;
import java.text.DecimalFormat;

public class FilesWriter {
    public String output(String fileName, String content) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {


        writer.write("相似度为：" + String.format("%.2f", Double.parseDouble(content)));
        writer.flush();
        }
        return null;
    }
}
