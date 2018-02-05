package com.practicejava.arraytest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayT {
    public static void main(String[] args) {
        List<String> fname = new ArrayList<>();
        fname.add("aditya");
        fname.add("a2");
        fname.add("a3");
        fname.add("a4");
        fname.add("a5");
        List<String> lname = new ArrayList<>();
        lname.add("Gaurav");
        lname.add("g2");
        lname.add("g3");
        lname.add("g4");
        lname.add("g5");
        List<String> ename = new ArrayList<>();
        ename.add("e1");
        ename.add("e2");
        ename.add("e3");
        ename.add("e4");
        ename.add("e5");
        Object[][] inp = new Object[fname.size()][];
        for (int i =0 ; i < inp.length; i++){
            List<Object> ob = new ArrayList<>();
            ob.addAll(Arrays.asList(fname.get(i),lname.get(i),ename.get(i)));
            inp[i] = ob.toArray();
        }

        for(Object[] obs : inp){
            for(Object o : obs){
                System.out.print(o.toString());
            }
            System.out.println();
        }
    }
}
