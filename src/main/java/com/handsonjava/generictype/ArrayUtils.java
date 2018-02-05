package com.handsonjava.generictype;

import java.lang.reflect.Array;

public class ArrayUtils<T> {
    private T[] t;

    //    public T[] getArray(int size){
//        return new T[size];
//    }
    public static <T> T[] newArray(Class<T[]> type, int size) {
        return type.cast(Array.newInstance(type.getComponentType(), size));
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem)>0)  // compiler error
                ++count;
        return count;
    }

    public static void main(String[] args){
        Integer[] inputs ={1,2,3,4,5,6,7};
        System.out.println(countGreaterThan(inputs,2));
    }
}
