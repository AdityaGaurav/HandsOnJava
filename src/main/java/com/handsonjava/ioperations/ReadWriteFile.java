package com.handsonjava.ioperations;

import java.io.*;

/**
 * Created by adityag on 2/26/17.
 */
public class ReadWriteFile {
    private static String CURRENT_DIRECTORY_PATH = System.getProperty("user.dir");

    public static void writeOntoFile(String fileName, String massageToPrint) {
        String filePath = CURRENT_DIRECTORY_PATH + File.separator + fileName;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(filePath);
            if (!file.isFile()) {
                file.createNewFile();
            }
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write(massageToPrint + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readFile(String filePath) throws IOException {
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        final String path = filePath;
        File file = new File(path);
        if (file.isFile()) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (line != null) {
                    System.out.print(line);
                }
            }
        } else {
            throw new FileNotFoundException("Not a File");
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
//                ready() method can be used to serve the same purpose.
//                while (bufferedReader.ready()) {
//                    line = bufferedReader.readLine();
//                    System.out.println(line);
//                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader == null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String details = "My name is Aditya." +
                "I am a Software Engineer" +
                "Currently working with \"Pramati\"";
        String fileName = "Mydetails.txt";

        writeOntoFile(fileName, details);
        System.out.println("===========File Details========");
        readFromFile(fileName);
    }
}
