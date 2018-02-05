package com.handsonjava.stringpool;

import java.net.MalformedURLException;
import java.net.URL;

public class StringHelperUtils {
    public static String commaSeparatedString(String... str) {
        if (str.length == 0) {
            throw new IllegalArgumentException("Input can not be zero");
        }
        if (str == null) {
            throw new NullPointerException("");
        }
        StringBuilder stringBuilder = new StringBuilder("");
        for (String st : str) {
            if (stringBuilder.length() == 0) {
                stringBuilder.append(st);
            } else {
                stringBuilder.append(",").append(st);
            }
        }
        return stringBuilder.toString();
    }

    public static void getDataFromUrls(String[] url) {

    }

    public static void main(String[] args) {
        System.out.println(commaSeparatedString("Aditya", "Gaurav"));
    }
}
