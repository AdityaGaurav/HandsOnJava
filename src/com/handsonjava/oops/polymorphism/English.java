package com.handsonjava.oops.polymorphism;

/**
 * Created by adityag on 7/17/2017.
 */
public class English extends Human {
    English() {
    }

    public English(String in) {
        super.Name = in;
    }

    public void talk() {
        System.out.println("Hey my name is " + Name);
    }
}
