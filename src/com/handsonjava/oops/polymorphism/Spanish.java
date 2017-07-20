package com.handsonjava.oops.polymorphism;

/**
 * Created by adityag on 7/17/2017.
 */
public class Spanish extends Human {
    Spanish() {
    }

    public Spanish(String in) {
        super.Name = in;
    }

    public void talk() {
        System.out.println("Hola jouso " + Name);
    }
}
