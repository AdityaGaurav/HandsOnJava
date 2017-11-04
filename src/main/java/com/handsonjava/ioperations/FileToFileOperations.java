package com.handsonjava.ioperations;


import java.io.*;

/**
 * Created by adityag on 2/26/17.
 */
public class FileToFileOperations {

    public void readFromAFile() {


    }


    public static void writeIntoFile(String filePath) {

//        File file = new File(filePath);
        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
            String consoleData = bufferedReader.readLine();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(filePath), true));
            bufferedWriter.write(consoleData);
//We  can use PrintWriter as well
//            PrintWriter out = new PrintWriter(new FileOutputStream(file));
//            out.write(consoleData);

            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String filePathToReadFrom, String filePathToWrite) {

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filePathToReadFrom)));
            String data = bufferedReader.readLine();

//            while passing true as an argument, it does not overwrite data. It appends at the end of existing line.
//            So if you remove true, it overwrites the existing line by the the new line.
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(filePathToWrite), true));
            bufferedWriter.write(data);
            System.out.println("=======Process Completed============");

            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String file = "/Users/adityag/Projects1/Mydetails1.txt";
        String file2 = "/Users/adityag/Projects/Mydetails.txt";
        writeIntoFile(file);
        writeToFile(file, file2);
    }
}
