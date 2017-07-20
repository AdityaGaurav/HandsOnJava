package com.handsonjava.stringpool;

/**
 * Created by adityag on 6/9/2017.
 */
public class CountVowelsInString {
    public static int getCountOfVowelPresentInString(String inputStr) {
        if (inputStr == null) {
            return 0;
        }
        if (inputStr.length() == 0) {
            return 0;
        }
        int length = inputStr.length(), count = 0;
        char[] breakString = inputStr.toCharArray();
        for(int i =0; i<= length-1; i++){
            if(breakString[i] == 'a' || breakString[i] == 'e'|| breakString[i] == 'i'|| breakString[i] == 'o'|| breakString[i] == 'u'){
                ++count;
//                continue;
               // return count;
            }
//            else{
//                return count;
//            }
        }
        return count;
    }

    public static int countVowelPresentInString(String input){
        if(input.length() == 0){
            return 0;
        }
        char[] convertString = input.toCharArray();
        int count = 0;
        for(char c:convertString){
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    ++count;
                    break;
            }
        }
        return count;
    }
    public static void main(String[] args){
       System.out.println(countVowelPresentInString("aditya aditya aditya"));
    }



}
