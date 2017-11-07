package com.handsonjava.iproblems.StringP;

public class StringContainsNumber {
    public static int findNumberInString(String stringWithNumber) {
        char[] ch = stringWithNumber.toCharArray();
        StringBuilder stringBuilder = new StringBuilder("0");
        int sum =0;
        for (char c : ch) {
            if (Character.isDigit(c)) {
                stringBuilder.append(c);
            } else{
                sum += Integer.parseInt(stringBuilder.toString());
                stringBuilder.setLength(0); // set length of buffer to 0
                stringBuilder.trimToSize();
                stringBuilder.append("0");// trim the underlying buffer
            }
        }
        sum += Integer.parseInt(stringBuilder.toString());
        return sum;
    }

    public static int sumOfNumbers(String input){
        int i=0;
        int sum =0;
        String temp="0";
        while(i<input.length()){
            if(input.charAt(i)>=48 && input.charAt(i)<= 57){
                temp += input.charAt(i);
            }else {
                sum += Integer.valueOf(temp);
                temp ="0";
            }
            i++;
        }
        sum += Integer.valueOf(temp);
        return sum;
    }

    public static int addNumer(String number){
        Integer intNumer = Integer.parseInt(number);
        int sum =0 ;
        while (intNumer > 0) {
            sum += intNumer % 10;
            intNumer = intNumer / 10;
        }
             return sum;
    }

    public static void main(String[] args){
        System.out.println(findNumberInString("12ad3v45"));
    }
}
