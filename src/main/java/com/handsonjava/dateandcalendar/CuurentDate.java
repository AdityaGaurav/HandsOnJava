package com.handsonjava.dateandcalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CuurentDate {
    public static void main(String[] args) throws Exception {
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        Calendar cal = Calendar.getInstance();
//        System.out.println(dateFormat.format(cal));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        System.out.println(dtf.format(localDate));
        String datew ="2017/12/23";
        System.out.println(dtf.format(localDate).equals(datew));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date1 = sdf.parse(dtf.format(localDate));
        Date date2 = sdf.parse(datew);

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));

        if (date1.compareTo(date2) > 0) {

        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date1 is before Date2");
        } else if (date1.compareTo(date2) == 0) {
            System.out.println("Date1 is equal to Date2");
        } else {
            System.out.println("How to get here?");
        }

    }
    }

