package com.handsonjava.iproblems.StringP;

public class StringPattern {
    public static boolean isPatternPresent(String input,String pattern){
        if(input == null || pattern ==null){
            return false;
        }
        if(input.length()< pattern.length()){
            return false;
        }
        int i= 0;
        while(i < input.length()){
            int j =0;
            while(j < pattern.length()){
                if(input.charAt(i) == pattern.charAt(j)){
                    i++;
                } else {
                    i++;
                    break;
                }
                j++;
            }
            if(j == pattern.length()){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPatternPresent("Thisismycheckistofindisinthisistoisi", ""));
    }
}
