package com.lmj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilesReaderTest {

    @Test
    void fileReadTest(){
        FilesReader filesReader = new FilesReader();
        String s = filesReader.fileRead("G:\\IDEAcode\\study\\SEWork\\paper-check\\src\\main\\resources\\test\\orig.txt");
        System.out.println(s);
    }
}