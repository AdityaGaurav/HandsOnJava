package com.handsonjava.practice.inner;

public class Test {
    public static void main(String[] args){
        int b = StaticNested.Example.count2;
        StaticNested.Example e = StaticNested.Example.m2();
        e.new Ec().m2();
    }
}
