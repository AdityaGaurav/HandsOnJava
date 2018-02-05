package com.practicejava.dateandtime;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date  = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        Calendar calendar = Calendar.getInstance();
        calendar.set(1989,3,9);
        System.out.println(Calendar.NOVEMBER);
    }
}
