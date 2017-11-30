package com.handsonjava.dateandcalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateOperations {

    static void getDate(){
        LocalDate localDate =LocalDate.of(2017,11,27);
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.isLeapYear());
    }

    static void getDateCurrent(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.isLeapYear());
    }

    static void parseDate(){
        String inputDate ="27-01-2017";
        //DateFormat dateFormat =new SimpleDateFormat("dd-MM-yyyy");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate  localDate =LocalDate.parse(inputDate,dateFormat);

        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.isLeapYear());
    }
    public static void main(String[] args) {
        parseDate();
    }
}
