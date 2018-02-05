package com.handsonjava.conversionpromotion;

public class Boxing {
    public static void main(String[] args) {
        int i =2;
        Integer i2 = i;
        int i5 = i2;
        System.out.println(i5);
        System.out.println(i2 +" "+ i2.getClass());
        System.out.println(String.valueOf(i));
        String s = i2.toString();
        Integer i4 = Integer.parseInt(s);
        System.out.println(i4);

        System.out.println("----Boolean----");
        boolean b = false;
        Boolean b1 = b;
        System.out.println(b1);
        String boo = b1.toString();
        System.out.println(boo);
        boolean b3 = Boolean.parseBoolean(boo);
        System.out.println(b3);
        String boos = String.valueOf(b);
        System.out.println(boos);
    }
}
