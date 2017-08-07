package com.handsonjava.iproblems.leetcode.arrays;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.*;

public class CommonElementInArrays {
    public static Set<Integer> findCommonElementInArrays(int[] input, int[] input2) {
        List<Integer> list1 = Arrays.asList(ArrayUtils.toObject(input));
        List<Integer> list2 = Arrays.asList(ArrayUtils.toObject(input2));
        List<Integer> result = new ArrayList<>();
        Set<Integer> unique = new HashSet<>();
        for (Integer i : list2) {
            if (list1.contains(i)) {
//                result.add(i);
                unique.add(i);
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 2};
        int[] ints = {2, 7, 8, 4, 2, 2};
        System.out.println(findCommonElementInArrays(input, ints));
    }
}
