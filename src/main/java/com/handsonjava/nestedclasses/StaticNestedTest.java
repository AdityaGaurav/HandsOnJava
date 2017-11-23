package com.handsonjava.nestedclasses;

public class StaticNestedTest {
    public static void main(String[] args){
        StaticNested.StaticNested2 staticNested2 =new StaticNested.StaticNested2(6);
        staticNested2.m3();
        StaticNested.StaticNested2.m7();
    }
}
