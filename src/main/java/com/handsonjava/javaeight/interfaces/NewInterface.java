package com.handsonjava.javaeight.interfaces;

 public interface NewInterface {
     int count =8;
//    void walk();
    default void newMethod(int count){
        System.out.println("I am a default method of NewInterface");
    }
    static  void staticMethodBody(int[] num){
        System.out.println(num.length);
    }

    default  void argMethod(NewInterface4 newInterface4){
    }
     public String toString();
}
