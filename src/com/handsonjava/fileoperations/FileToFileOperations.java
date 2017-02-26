package com.handsonjava.fileoperations;


import java.io.*;

/**
 * Created by adityag on 2/26/17.
 */
public class FileToFileOperations {

    public void readFromAFile() {


    }


    public static void writeIntoFile(String filePath) {

        File file = new File(filePath);
        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
            String consoleData = bufferedReader.readLine();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(consoleData);

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

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(filePathToWrite)));
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
//        writeIntoFile(file);
        writeToFile(file, file2);
    }
}
