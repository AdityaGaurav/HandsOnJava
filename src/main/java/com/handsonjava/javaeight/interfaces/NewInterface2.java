package com.handsonjava.javaeight.interfaces;

 interface NewInterface2 {
    default void newMethod(int count){
        System.out.println("I am a default method NewInterface2");
    }
    static void staticMethodBody(int[] num){
        System.out.println(num.length);
    }
}
