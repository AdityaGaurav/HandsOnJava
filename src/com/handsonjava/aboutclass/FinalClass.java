package com.handsonjava.aboutclass;

/**
 * Created by adityag on 7/10/2017.
 */
public final class FinalClass {
    final String title;

    FinalClass(String s) {
        title = s;
        System.out.println("");
    }

    public String getTitle() {
        return this.title;
    }

    public  static void setTitle(String s){

    }

}
