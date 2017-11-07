package com.handsonjava.iproblems.interview1;

public class Palindrome {
    public static boolean findNumberPalindrome(int number) {
        if(number == reverseNumber(number)){
            return true;
        }
       return false;
    }

    public static int reverseNumber(int number) {
        if (number == 0) {
            return 0;
        }
        int num = 0;
        while (number != 0) {
//            num = num + number % 10;
            num = num*10 + number%10;
//            num = num * 10;
            number = number / 10;
        }
        return num;
    }

    public static boolean isStringPalindrome(String input){
        if(input == null || input.length() ==0){
            throw new RuntimeException("Not a valid string");
        }
        boolean flag =true;
        for(int i=0 ; i<= (input.length()-1)/2 ; i++){
            if(input.charAt(i) != input.charAt(input.length()-1-i)){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(isStringPalindrome("madam"));
    }
}
