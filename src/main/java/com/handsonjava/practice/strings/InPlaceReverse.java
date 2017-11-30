package com.handsonjava.practice.strings;

import org.apache.commons.lang3.ObjectUtils;

public class InPlaceReverse {
    public static String performInPlace(String str) {
        if (str == null) {
            throw new NullPointerException("Input can not be null");
        }
        if (str.equals("")) {
            throw new IllegalArgumentException("Input can not be empty");
        }
        StringBuilder stringBuilder = new StringBuilder("");
        if (!str.contains(" ")) {
            for (int i = str.length() - 1; i >= 0; i--) {
                stringBuilder.append(str.charAt(i));
            }
            return stringBuilder.toString();
        } else {
            int index = str.indexOf(" ");
            StringBuilder stringBuilder2 = new StringBuilder("");
            int j = 0, i, count = 0;
            while (j < str.length()) {
                for (i = index-1; i >= count; i--) {
                    stringBuilder2.append(str.charAt(i));
                }
                j =  index;
                count = index+1;
                stringBuilder2.append(str.charAt(j));
                index = str.indexOf(" ", index+1);
                if(index == -1){
                    for(int k =str.length()-1; k>= count; k-- ){
                        stringBuilder2.append(str.charAt(k));
                    }
                    j = str.length();
                }
            }
            return stringBuilder2.toString();
        }
    }
public static void main(String[] args){
        System.out.println(performInPlace("Aditya Gaurav Tripathi K li"));
}

}
