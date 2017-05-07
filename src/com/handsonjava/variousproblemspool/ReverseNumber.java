package com.handsonjava.variousproblemspool;

/**
 * Created by adityag on 3/30/2017.
 */
public class ReverseNumber {

    public static int doReverseNumber(int number) {
        int reveseSum=0;
        while (number != 0) {
            reveseSum=reveseSum*10;
            reveseSum=reveseSum+number%10;
            number=number/10;
        }
        return reveseSum;
    }


    public static void main(String[] args) {
        System.out.println(doReverseNumber(1234));
    }
}
