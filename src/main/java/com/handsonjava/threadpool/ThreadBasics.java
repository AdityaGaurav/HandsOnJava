package com.handsonjava.threadpool;

import java.lang.reflect.Method;

public class ThreadBasics extends Thread {

    public void run(){
        int i =0 ;
         while(i < 10){
             System.out.println(i);
             ++i;
         }
    }
    void m3(Method m){

    }
    public static native void m2();
    public static void main(String[] args){

        ThreadBasics threadBasics = new ThreadBasics();
        threadBasics.start();
    }
}
