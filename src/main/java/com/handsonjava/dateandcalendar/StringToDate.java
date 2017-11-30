package com.handsonjava.dateandcalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        String inputDate ="27-11-2018";
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = dateFormat.parse(inputDate);
        System.out.println(date);

        String inputDate1 ="27112017";
        DateFormat dateFormat2 = new SimpleDateFormat("ddMMyyyy");
        Date date2 = dateFormat2.parse(inputDate1);
        System.out.println(date2);
    }
}
