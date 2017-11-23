package com.handsonjava.iproblems.interview1;

public class NumberPalinDrome {
    public static boolean isPalindrome(int num){
        int reverseNum = 0 ;
        if(num > 0 ){
            reverseNum =  doReverse(num);
        }
        if(reverseNum == num){
            return true;
        }
        return false;
    }
    public static int doReverse(int n){
        int sum = 0;
        while(n > 0){
            sum = sum *10 + n %10;
            n  = n /10;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(1221));
    }

}
