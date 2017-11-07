package com.handsonjava.aboutclass;

public class SuperKey {
    String firstName;
    String lastName;
    static int numberOfEmployyees;
    int numberOfOffices = 9;

    static {
        numberOfEmployyees = 10;
    }
    SuperKey(){

    }

    SuperKey(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printName() {
        System.out.println(this.firstName + " " + this.lastName);
    }
    public static void printMe(){
        System.out.println("I super class");
    }
}
