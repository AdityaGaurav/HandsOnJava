package com.handsonjava.controlstatements;

/**
 * Created by adityag on 2/4/17.
 */
public class DoWhile {

    public static void createDoWhile() {
        int x = 0;
        //exit control loop
        do {
            x++;
            System.out.println(x);
        } while (x < 10);
    }

    static void whileLoop() {
        int x = 0;
        //entry control loop
        while (x < 10) {
            System.out.println(x);
            x++;
        }
    }

    public static void main(String[] args) {
        //Infinite for loop
//        for(;;){
//            System.out.println("=============================");
//        }
        whileLoop();
        System.out.println("=============================");
        createDoWhile();
    }

}
