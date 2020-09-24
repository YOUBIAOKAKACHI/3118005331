package com.lmj;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FilesWriterTest {

    @Test
    void fileWrite() throws IOException {
        FilesWriter filesWriter = new FilesWriter();
        filesWriter.output("D:test.txt", "0.85");
    }

}