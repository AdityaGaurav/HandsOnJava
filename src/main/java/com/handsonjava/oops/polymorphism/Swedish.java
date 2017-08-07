package com.handsonjava.oops.polymorphism;

/**
 * Created by adityag on 7/17/2017.
 */
public class Swedish extends Human {
    Swedish() {
    }

    public Swedish(String in) {
        super.Name = in;
    }

    public void talk() {
        System.out.println("Hej jag heter " + Name);
    }
}
