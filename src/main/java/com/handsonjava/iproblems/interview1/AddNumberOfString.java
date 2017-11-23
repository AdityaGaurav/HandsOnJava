package com.handsonjava.iproblems.interview1;

public class AddNumberOfString {
    public static int addNumberFromString(String input){
        String sum ="0";
        int sumOfInts = 0;
        for(int i =0 ; i<input.length(); i++){
            if(Character.isDigit(input.charAt(i))){
                sum = sum + input.charAt(i);
            }else {
                sumOfInts +=  Integer.parseInt(sum);
                sum ="0";
            }
        }
        sumOfInts += Integer.parseInt(sum);
        return sumOfInts;
    }

    public static void main(String[] args){
        System.out.println(addNumberFromString("adi12g3b"));
    }
}
