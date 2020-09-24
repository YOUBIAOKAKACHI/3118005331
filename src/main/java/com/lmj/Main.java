package com.lmj;


import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FilesReader r1 = new FilesReader();
        FilesReader r2 = new FilesReader();

        Calculate calculate = new Calculate();

        String s1= r1.fileRead(args[0]) ;
        String s2= r2.fileRead(args[1]) ;


        List<String> stringList = calculate.divide(s1);
        List<String> stringList2 = calculate.divide(s2);


        Calculate calculate1 = new Calculate(stringList, stringList2);


        FilesWriter writer1 = new FilesWriter();
        String outputing= ""+ calculate1.sim();

        try {
            writer1.output(args[2],outputing);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
