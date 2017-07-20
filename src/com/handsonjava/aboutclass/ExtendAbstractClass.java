package com.handsonjava.aboutclass;

/**
 * Created by adityag on 7/18/2017.
 */
public class ExtendAbstractClass extends AbstractClass {
    public void abstractMethod() {
        System.out.println("Implementation of abstract method of Abstract class");
    }

    void sayHello() {
        System.out.println("I am sayHello method of ExtendAbstractClass class");
    }
//    static void printMessage() {
//        System.out.println("I am a ExtendAbstractClass class");
//    }

    public static void main(String[] args) {
        AbstractClass abs = new ExtendAbstractClass();
        abs.abstractMethod();
        abs.sayHello();
        printMessage();
    }
}
