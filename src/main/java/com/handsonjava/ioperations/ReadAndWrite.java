package com.handsonjava.ioperations;

import java.io.*;

public class ReadAndWrite {
    private String fileNameWithPathRead;
    private String fileNameWithPathWrite;

    public ReadAndWrite(String fileNameWithPathRead, String fileNameWithPathWrite) {
        if (isValidPath(fileNameWithPathRead)) {
            throw new IllegalArgumentException(fileNameWithPathRead + " Not a valid Path");
        }
        if (isValidPath(fileNameWithPathWrite)) {
            throw new IllegalArgumentException(fileNameWithPathWrite + " Not a valid Path");
        }
        this.fileNameWithPathRead = fileNameWithPathRead;
        this.fileNameWithPathWrite = fileNameWithPathWrite;
    }

    public boolean isValidPath(String fileNameWithPath) {
        return fileNameWithPath == null || fileNameWithPath.trim().length() == 0;
    }

    public boolean isDirectoryPresent(String fileNameWithPath) {
        File file = null;
        boolean flag = false;
        if (!isValidPath(fileNameWithPath)) {
            file = new File(fileNameWithPath);
        }
        try {
            flag = file.isFile();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public void readAndWriteFile() throws FileNotFoundException {
        String line = "";
        if (!isDirectoryPresent(this.fileNameWithPathRead)) {
            throw new FileNotFoundException("Not a valid file");
        }
        if (!isDirectoryPresent(this.fileNameWithPathWrite)) {
            throw new FileNotFoundException("Not a valid file");
        }
        try (FileReader fileReader = new FileReader(fileNameWithPathRead);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(fileNameWithPathWrite,true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
