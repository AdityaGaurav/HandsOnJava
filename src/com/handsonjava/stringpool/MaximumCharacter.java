package com.handsonjava.stringpool;

import java.util.HashMap;

/**
 * Created by adityag on 2/6/17.
 */
public class MaximumCharacter {

    public static void maxCountCharacter(String inputString) {

        char[] tmpChar = inputString.toCharArray();
        StringBuilder tempString = new StringBuilder("");
        int count = 1;
        char c;

        for (int i = 0; i < tmpChar.length; i++) {
            c = tmpChar[i];
            count = 1;
            if (tempString.toString().contains(Character.toString(c))) {
                i++;
//                c = tmpChar[i];
                continue;
            }
            for (int j = i + 1; j < tmpChar.length; j++) {
                if (c == tmpChar[j]) {
                    ++count;
                }

            }
            System.out.println(c + " occured: " + count);
            tempString.append(c);
        }
    }

    public static  Character findMaxOChar(String text){

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        Character maxChar = ' ';

        long max = Integer.MIN_VALUE;

        for(int i=0;i<text.length();i++){
            Character current = text.charAt(i);

            if(map.containsKey(current)){
                map.put(current,map.get(current)+1);
            }
            else{
                map.put(current,1);
            }
            if(map.get(current)>max){
                maxChar = current;
                max = map.get(current);
            }
        }
        return maxChar;
    }


    public static void main(String[] args) {
        maxCountCharacter("adiaatttya gaurav");
        String text = "wfaveqr caaaaaaaaaaaafwefwgqrvwerwbhqfvwrfwvbetqfwef q fwgwfw erfq";
        System.out.println("The max character is : "+ findMaxOChar(text));

    }

}
