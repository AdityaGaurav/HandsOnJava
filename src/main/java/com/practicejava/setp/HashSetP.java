package com.practicejava.setp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetP {
    public static void main(String[] args) {
        Set<String> strings =new HashSet<>();
        strings.add("adi");
        strings.add("adi");
        strings.add("di");
        strings.add("ihj");
        strings.add("adiya");

        //Iterate over HashSet using foreach
        System.out.println(strings.size());
        for(String s : strings){
            System.out.println(s);
        }

        //Using iterator
        Iterator<String> stringIterator = strings.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
    }
}
