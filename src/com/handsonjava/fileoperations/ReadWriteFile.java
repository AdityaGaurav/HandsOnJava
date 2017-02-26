package com.handsonjava.fileoperations;

import java.io.*;

/**
 * Created by adityag on 2/26/17.
 */
public class ReadWriteFile {

    public static void writeOntoFile(String filePath, String massageToPrint) {
        BufferedWriter bufferedWriter =null;
        try {
            File file = new File(filePath);
            if (!file.isFile()) {
                file.createNewFile();
            }
             bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(massageToPrint);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void readFromFile(String filePath) {
        String line = null;
        BufferedReader bufferedReader = null;
        try {

            File file = new File(filePath);
            if (file.isFile()) {
                 bufferedReader = new BufferedReader(new FileReader(file));

                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        String details ="My name is Aditya." +
                "I am a Software Engineer" +
                "Currently working with \"Pramati\"";
        String filePath ="/Users/adityag/Projects1/Mydetails.txt";

        writeOntoFile(filePath,details );
        System.out.println("===========File Details========");
        readFromFile(filePath);



    }
}
