package com.handsonjava.stringpool;

/**
 * Created by adityag on 6/27/2017.
 */
//@Author(
//        name = "Aditya",
//        date = "3/27/2003"
//)
public class StringExperiment {

    private final char[] value1;

    public StringExperiment(){
        this.value1 = new char[]{};
        System.out.print(value1.length);
        for(char c: value1){
            System.out.print(c);
        }
    }

    public static void main(String[] args){
        new StringExperiment();
    }

}
