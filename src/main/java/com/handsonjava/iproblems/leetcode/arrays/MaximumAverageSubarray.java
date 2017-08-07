package com.handsonjava.iproblems.leetcode.arrays;

import java.util.Map;
import java.util.TreeMap;

public class MaximumAverageSubarray {
    public static double findMaximumAverageSubarray(int[] input, int k) {
        TreeMap<Double, Integer> resultMap = new TreeMap<>();
        int length = input.length;
        double add = addSubArray(input, k);
        double average = add / k;
        resultMap.put(average, k);
        for (int i = k; i < length; i++) {
            add += input[i];
            System.out.println(add / (i + 1));
            resultMap.put(add / (i + 1), i);
        }
        return resultMap.lastKey();
    }

    public static int addSubArray(int[] input, int endIndex) {
        int add = 0;
        for (int i = 0; i < endIndex; i++) {
            add += input[i];
        }
        return add;
    }
    public static double findMaxAverage(int[] nums, int k) {
        double max_val = Integer.MIN_VALUE;
        double min_val = Integer.MAX_VALUE;
        for (int n: nums) {
            max_val = Math.max(max_val, n);
            min_val = Math.min(min_val, n);
        }
        double prev_mid = max_val, error = Integer.MAX_VALUE;
        while (error > 0.00001) {
            double mid = (max_val + min_val) * 0.5;
            if (check(nums, mid, k))
                min_val = mid;
            else
                max_val = mid;
            error = Math.abs(prev_mid - mid);
            prev_mid = mid;
        }
        return min_val;
    }
    public static boolean check(int[] nums, double mid, int k) {
        double sum = 0, prev = 0, min_sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i] - mid;
        if (sum >= 0)
            return true;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - mid;
            prev += nums[i - k] - mid;
            min_sum = Math.min(prev, min_sum);
            if (sum >= min_sum)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] inputArray = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(inputArray, 4));
    }
}
