package com.handsonjava.dateandcalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateOperations {
    static void getYearMonthDayFromDate() throws ParseException {
        String inputDate ="27-01-2017";
        DateFormat dateFormat =new SimpleDateFormat("dd-MM-yyyy");
        Date dateO = dateFormat.parse(inputDate);
        Calendar calendar =Calendar.getInstance();
        calendar.setTime(dateO);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        System.out.println(year +"-"+(month+1)+"-"+date);
    }
    static void getCurrentDateAndTimeUsingCalendar(){
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        Calendar calendar = Calendar.getInstance();
        System.out.println(dateFormat.format(calendar.getTime()));
    }

    static void getYearMonthDayFromLocalDate() throws ParseException {
        String inputDate ="27-01-2017";
        DateFormat dateFormat =new SimpleDateFormat("dd-MM-yyyy");
        Date dateO = dateFormat.parse(inputDate);
        LocalDate localDate = dateO.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year  = localDate.getYear();
        int month = localDate.getMonthValue();
        String monthName = localDate.getMonth().name();
        int day   = localDate.getDayOfMonth();
        System.out.println(year +"-"+month+"-"+day+"-"+monthName);

    }
    public static void main(String[] args) throws ParseException {
        getYearMonthDayFromDate();
    }
}
