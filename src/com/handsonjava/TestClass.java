package com.handsonjava;

import com.handsonjava.aboutclass.FinalClass;

/**
 * Created by adityag on 7/18/2017.
 */
public class TestClass {
    public static void main(String[] args){
        // Can not instantiate FinalClass. It has a constructor with package-private access
        //FinalClass finalClass = new FinalClass();
        FinalClass.setTitle("Aditya");

    }
}
