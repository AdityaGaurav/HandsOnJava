package com.handsonjava.iproblems.StringP;

public class FindSubString {
    static int findSubStringCount(String inputString, String subString) {
        if (inputString == null || subString == null) {
            return -1;
        }
        if (inputString.length() < subString.length()) {
            return -1;
        }
        int i = 0;
        int count = 0;
        while (i < inputString.length()) {
            int j = 0;
            while(j < subString.length() && i <inputString.length()){
                if(inputString.charAt(i) == subString.charAt(j)){
                    i++;
                }else {
                    i++;
                    break;
                }
                j++;
            }
            if(j == subString.length()){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findSubStringCount("Thisismycheckistofindisinthisistoisi", "to"));
    }
}
