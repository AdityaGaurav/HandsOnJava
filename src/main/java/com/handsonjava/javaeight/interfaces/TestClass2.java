package com.handsonjava.javaeight.interfaces;

public class TestClass2 implements NewInterface,NewInterface2 {
    @Override
    public void newMethod(int count) {
          NewInterface.super.newMethod(4);
    }
}
