package com.handsonjava.lambdas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaVenktaeshWay {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);

//        for(int a: list){
//            System.out.println(a);
//        }
//
//        list.forEach(a-> System.out.println(a));
//        list.forEach(System.out::println);
//
//        list.stream()
//                .map(String::valueOf)
//                .forEach(System.out::println);

        //Given the values double the even numbers and total
        int result=0;
        for(int i: list){
            if(i % 2== 0){
                result += i *2 ;
            } else {
                result += i;
            }
        }
        System.out.println(result);

        System.out.println(list.stream()
                .filter(e -> e% 2==0)
                .map(e -> e *2)
                .reduce(0,Integer::sum));

        System.out.println(list.stream()
                .filter(e -> e% 2==0)
                .mapToInt(e -> e *2)
                .sum());

    }
}
