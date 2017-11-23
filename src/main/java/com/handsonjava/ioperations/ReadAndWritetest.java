package com.handsonjava.ioperations;

import java.io.FileNotFoundException;

public class ReadAndWritetest {
    public static void main(String[] args) throws FileNotFoundException {
        String read ="C:\\Users\\adityag\\Desktop\\ABC.txt";
        String write ="C:\\Users\\adityag\\Desktop\\BBC.txt";
        ReadAndWrite readAndWrite =new ReadAndWrite(read,write);
        readAndWrite.readAndWriteFile();
    }
}
