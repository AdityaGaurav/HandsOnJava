package com.handsonjava.oops.inheritance;

/**
 * Created by adityag on 7/10/2017.
 */
public class P {

    String myName;
    static int rollNo = 4;
    private int pri = 3;

    public P() throws Exception {
        System.out.println(this.getClass());
        System.out.println("P constructor");
    }

    public P(String name){
        System.out.println(this.getClass());
        System.out.println("Parameterized constructor");
    }

    String draw() {
        return "Draw Using P";
    }

    P returnMe(){
        return this;
    }

    String draw(String s) {
        return s + " P";
    }

    static String printDetails() {
        return "Its a static method";
    }

    public void printExtra() {
        System.out.println("I belong to P");
    }
}
