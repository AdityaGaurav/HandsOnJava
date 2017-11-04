package com.handsonjava.oops.inheritance;

/**
 * Created by adityag on 7/10/2017.
 */
public class C extends P {

    public C(){
        super("aditya");
    }

    public C(String name) throws Exception {
        super();
    }

    public String draw() {
        System.out.println("Hi...C");
        super.draw();
        return "Draw Using C";
    }

    public String pattern() {
        return "pattern C";
    }

    String draw(String s) {
        return s + " C";
    }

    public void printRollNumB() {
        printDetails();
        System.out.print(rollNo);
    }

    public static void staticCheck(){
//      super.draw();
    }

    public void printExtra(){
        System.out.println("I belong to C");
    }

}
