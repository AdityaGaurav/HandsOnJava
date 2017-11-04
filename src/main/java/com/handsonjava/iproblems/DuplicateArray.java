package com.handsonjava.iproblems;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArray {
    public static boolean findDuplicateElement(int[] array) {
//        Arrays.sort(array);
        int c;
        boolean result = false;
        exitLoop:
        for (int i = 0; i < array.length; i++) {
            c = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == c) {
                    result = true;
                    break exitLoop;
                }
            }
        }
        return result;
    }

    public static boolean isArrayContainDuplicateArray(int[] ints){
        boolean isDuplicate= false;
        Set<Integer> uniqueElement = new HashSet<>();
        for(int number : ints){
            if(!uniqueElement.contains(number)){
                uniqueElement.add(number);
//                isDuplicate = false;
            } else {
                isDuplicate =true;
                break;
            }
        }
        return isDuplicate;
    }

    public static boolean findDuplicatesInArrayr(int[] input) {
        Arrays.sort(input);
        for (int i = 0; i < input.length - 1; ++i) {
            if (input[i] == input[i + 1]) return true;
        }
        return false;
    }

    public static boolean findDistanceBetweenDuplicates(int[] array, int k) {
        int c;
        exitLoop:
        for (int i = 0; i < array.length; i++) {
            c = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == c) {
                    int d = j - i;
                    if (d <= k) {
                        return true;
                    }
//                    break exitLoop;
                }
            }
        }
        return false;
    }

    public static boolean findDuplicatesInArray(int[] input) {
        Set<Integer> set = new HashSet<>(input.length);
        for (int x : input) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = {1,0,1,1};
        System.out.println(isArrayContainDuplicateArray(input));
    }
}
