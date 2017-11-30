package com.handsonjava.dateandcalendar;

import com.sun.deploy.util.SyncAccess;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateInterviewQuestion {
    static void getCurrentTime(){
        Date date  = new Date();
                System.out.println(date);
    }

    static void changeTimeZone(){
//        TimeZone timeZone =TimeZone.getDefault();
//        System.out.println(timeZone.toString());
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Date date = new Date();
        System.out.println(date);
        DateFormat dateFormat =new SimpleDateFormat();
        dateFormat.setTimeZone(timeZone);
        dateFormat.format(date);
        System.out.println(date);
    }
    @SuppressWarnings("Deprecated")
    static void convertStringToDate() throws ParseException {
        String dateInput= "27-11-2017";
        DateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(dateFormat.parse(dateInput));
        System.out.println(dateFormat.parse(dateInput).getDate());
        System.out.println(dateFormat.parse(dateInput).getDay());
        System.out.println(dateFormat.parse(dateInput).getMonth());
    }

    static void convertDateToString(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-dd");
        System.out.println(dateFormat.format(new Date()));
    }

    static void addNDaysToDate(){
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,10);
        System.out.println(calendar.getTime());
        System.out.println(calendar.getCalendarType());
    }

    static void subtractNDayToDate(){
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -10);
        System.out.println(calendar.getTime());
    }

    static void addNDaysToMonth(){
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        System.out.println(date);
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,5);
        System.out.println(calendar.getTime());
    }

    static void compareDates() throws ParseException {
        String inputDate ="2017-11-28";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateInput = dateFormat.parse(inputDate);
        // 2018 -1900 =118
        Date dateIn = new Date(118,0,30);
        if(dateInput.compareTo(dateIn) <0){
            System.out.println(dateInput + " is before "+ dateIn);
        } else if(dateInput.compareTo(dateIn) > 0){
            System.out.println(dateInput + " is after "+ dateIn);
        } else{
            System.out.println(dateInput + " is equal to "+ dateIn);
        }
    }

    public static void main(String[] args) throws ParseException {
        addNDaysToDate();
    }
}
