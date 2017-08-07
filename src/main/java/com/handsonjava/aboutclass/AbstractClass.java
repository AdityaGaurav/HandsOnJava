package com.handsonjava.aboutclass;

/**
 * Created by adityag on 7/18/2017.
 */
public abstract class AbstractClass {
    AbstractClass(){
        System.out.println("Constructor of abstract class");
    }
    abstract void abstractMethod();

    static void printMessage() {
        System.out.println("I am a abstract class");
    }

    void sayHello(){
        System.out.println("I am sayHello method of abstract class");
    }
    public static void main(String[] args) {
        printMessage();
    }
}
