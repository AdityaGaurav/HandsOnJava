package com.handsonjava.ioperations;

import java.io.*;

/**
 * Created by adityag on 6/24/2017.
 */
public class ByteStreams {
    final private static String path = System.getProperty("user.dir"); //.getAbsolutePath();
    final private static String SEPERATOR = File.separator;// System.getProperty("file.seperator");//File.separator;

    public static void performReadAndWrite() throws IOException {
        System.out.println(path + " Absolute path");
        System.out.println(SEPERATOR + " : SEPERATOR");
        String filePath = path + SEPERATOR + "src" + SEPERATOR + "com" + SEPERATOR + "handsonjava" + SEPERATOR +
                "fileoperations" + SEPERATOR + "read.txt";
        String filePathToWrite = path + SEPERATOR + "src" + SEPERATOR + "com" + SEPERATOR + "handsonjava" + SEPERATOR +
                "fileoperations" + SEPERATOR + "write.txt";
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(new File(filePath));
            out = new FileOutputStream(new File(filePathToWrite));
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
//        } catch (FileNotFoundException e) {
//            System.err.println(e);
//        } catch (IOException e){
//            System.err.println(e);
//        }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    public static void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                System.out.println(fileEntry.getName());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        final File folder = new File("/home/you/Desktop");
        performReadAndWrite();
    }
}
