package com.handsonjava.dateandcalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class SimpleDate {
    static void getCurrentDateAndTimeUsingDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd_HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }

    static void getCurrentDateAndTimeUsingCalendar(){
        DateFormat dateFormat = new SimpleDateFormat("yyyymmdd_HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        System.out.println(dateFormat.format(calendar.getTime()));
    }

    static void getCurrentDateAndTimeUsingLocalDateTime(){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-mm-dd_HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(dateFormat.format(localDateTime));
    }

    static void getCurrentDateAndTimeUsingLocalDate(){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        LocalDate localDate = LocalDate.now();
        System.out.println(LocalDate.now()
                .format(DateTimeFormatter
                        .ofPattern("yyyy-MM-dd")));
    }


    public static void main(String[] args){
        getCurrentDateAndTimeUsingDate();
    }
}
