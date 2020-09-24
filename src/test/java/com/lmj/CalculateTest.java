package com.lmj;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void testAdd(){
        Calculate calculate = new Calculate();
        FilesReader filesReader = new FilesReader();
        String s1 = filesReader.fileRead("D:\\test\\orig.txt");
        String s2 = filesReader.fileRead("D:\\test\\orig_0.8_add.txt");

        List<String> stringList1 = calculate.divide(s1);
        List<String> stringList2 = calculate.divide(s2);
        Calculate calculate1 = new Calculate(stringList1, stringList2);
        double sim = calculate1.sim();
        System.out.println(sim);
    }

    @Test
    void testDel(){
        Calculate calculate = new Calculate();
        FilesReader filesReader = new FilesReader();
        String s1 = filesReader.fileRead("D:\\test\\orig.txt");
        String s2 = filesReader.fileRead("D:\\test\\orig_0.8_del.txt");

        List<String> stringList1 = calculate.divide(s1);
        List<String> stringList2 = calculate.divide(s2);
        Calculate calculate1 = new Calculate(stringList1, stringList2);
        double sim = calculate1.sim();
        System.out.println(sim);
    }
}