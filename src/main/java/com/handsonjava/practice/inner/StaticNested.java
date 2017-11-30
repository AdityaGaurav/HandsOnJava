package com.handsonjava.practice.inner;

public class StaticNested {
    public static void main(String[] args) {
        System.out.println(Example.count);
        Example.m1();
    }
    static class Example {
        Example(){
        }
        private static int count = 5;
        static int count2 = 5;
        private int i = 4;
        int i2 =9;
        private static void m1() {
        }
         static Example m2(){
            return new Example();
        }
        class Ec{
              int i=3;
              void m2(){
             System.out.println("EC");
             }
        }
    }
}
