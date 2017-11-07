package com.handsonjava.conversionpromotion;

public class StringToPrimitive {
    public static void main(String[] args){
        String intNum = "1234";
        String floatNUM = "123.009";
        String chara = "A";
        String bools = "False1";

        int integer = Integer.parseInt(intNum);
        float f = Float.parseFloat(floatNUM);
        char c = chara.charAt(0);
        boolean b = Boolean.parseBoolean(bools);
        System.out.println(integer);
        System.out.println(f);
        System.out.println(c);
        if(!b) {
            System.out.println(b);
        }
    }
}
