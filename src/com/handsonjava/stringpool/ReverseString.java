package com.handsonjava.stringpool;

/**
 * Created by adityag on 2/8/17.
 */
public class ReverseString {

    public void doReverseString(String inputString) {

        String pattern = "\\s";
        String[] str = inputString.split(pattern);
        for (int i = str.length-1; i >= 0; i--) {
            System.out.print(str[i]+" ");
        }

    }


    public void reverseString(String inputString){
        String reverse = "";
        char[] input = inputString.toCharArray();
        for(int i=input.length-1; i>=0; i--){

            reverse+=input[i];

        }

        System.out.println(reverse);

    }


    public void reverseStringMethod(String inputs){
        String reverse = "";
        for(int i=inputs.length()-1; i>=0 ; i--){
            reverse+=inputs.charAt(i);
        }

        System.out.println(reverse);
    }

    public static String reverseRecursively(String inputs){

        if(inputs.length() == 0)
            return "";
        return inputs.charAt(inputs.length() - 1) + reverseRecursively(inputs.substring(0,inputs.length()-1));

    }

    public static void main(String[] args){
//        new ReverseString().reverseRecursively("Aditya Gaurav Tripathi");
        System.out.println(reverseRecursively("Aditya Gaurav Tripathi"));
    }
}
