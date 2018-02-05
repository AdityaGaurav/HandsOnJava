package com.handsonjava.ioperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by adityag on 2/26/17.
 */
public class BufferedWriterConsole {

    public static void readFromConsoleWriteToFile() {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String data = bufferedReader.readLine();
            bufferedReader.lines().forEach(System.out::print);
            //System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        readFromConsoleWriteToFile();
    }
}
