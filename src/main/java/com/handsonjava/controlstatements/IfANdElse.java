package com.handsonjava.controlstatements;

/**
 * Created by adityag on 2/4/17.
 */
public class IfANdElse {

    public static void implementIfElse(int number) {
        if (number == 0 || number < 0) {
            System.out.println("Illegal input");
        } else {
            if (number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }

        }
    }

    public static void printResult(int num){
        if(num > 0 ){
            System.out.println(num);
        }else {
            System.out.println(num);
            printResult(num -1);
        }

    }


    public static void returnEmpty(){
        boolean result = false;
        if(!result) {
            System.out.println("result: " + result);
        }
        if(!result){
            System.out.println("result: " + result);
        }
        if(true){
            System.out.println("Empty return");
            return;
        }

        System.out.println("Empty return");
    }


    public static void main(String[] args) {
//        returnEmpty();
//        implementIfElse(-1);
        printResult(2);
    }
}
