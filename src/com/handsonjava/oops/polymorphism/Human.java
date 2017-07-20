package com.handsonjava.oops.polymorphism;

/**
 * Created by adityag on 7/17/2017.
 */
public class Human {
    String Name;

    Human() {
    }

    public Human(String name) {
        this.Name = name;
    }

    public void talk() {
        System.out.println("Teh bot: " + Name);
    }
}
