package com.handsonjava.javaeight.interfaces;

public class TestClass implements NewInterface, NewInterface2, NewInterface3 {
    @Override
    public void newMethod(int count) {
        System.out.println("I am a default method of TestClass");
    }

    public static void main(String[] args) {
        int varb = count;
        NewInterface newInterface = new TestClass();
        newInterface.newMethod(6);
    }
}
