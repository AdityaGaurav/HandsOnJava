package com.handsonjava.controlstatements;

/**
 * Created by adityag on 2/5/17.
 */
public class WhleLoopPractice {

    public static void runLoop(){
        int x=1;
        while(x<10){
            x =x+1;
            if(x>3){
                System.out.println("big x");
            }
        }
    }

    public static void main(String[] args){
        int x=3;
        short y=(short)x;
//        boolean y =x;
        runLoop();
    }
}
