package com.handsonjava.conversionpromotion;

public class PrimitveType {

    public static void setNum(short s){

    }
    public static void main(String[] args){
        short a =(short) 32769 ;
        int i = (int)214748364822l;
        long l = 214748364822l;
        System.out.println(a);
        short b =(short)(a*5);
        //throws error possible lossy conversion from int to short
        //setNum(5);
        setNum((short)5);
    }
}
