package com.handsonjava.aboutclass;

/**
 * Created by adityag on 7/18/2017.
 */
public abstract class AbstractClass {
    int i =0;
    static String nameOf = "";
    AbstractClass(){
        System.out.println("Constructor of abstract class");
    }
     private void abstractMethod(){
         System.out.println("I am a abstract class");
     }

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
