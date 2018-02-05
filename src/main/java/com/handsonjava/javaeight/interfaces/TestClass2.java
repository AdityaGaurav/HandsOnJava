package com.handsonjava.javaeight.interfaces;

public class TestClass2 implements NewInterface,NewInterface2 {
    @Override
    public void newMethod(int count) {
        int[] ints = {1,2};
          NewInterface.super.newMethod(4);
          NewInterface.staticMethodBody(ints);
          NewInterface2.staticMethodBody(ints);
    }
}
