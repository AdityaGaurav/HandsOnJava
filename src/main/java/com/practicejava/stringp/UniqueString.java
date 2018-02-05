package com.practicejava.stringp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class UniqueString {
    public static String removeDuplicate(String input){
        Objects.requireNonNull(input);
        Set<Character> characters =new LinkedHashSet<>();
        for(int i =0 ;i <input.length(); i++){
            if(!characters.contains(input.charAt(i))){
                characters.add(input.charAt(i));
            }
        }
        return characters.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("aaaditycvvv mmmmm"));
    }

}
