package com.handsonjava.arraypool;

import java.util.Arrays;

public class RotateArray {
    static void rotate(int[] arr, int d, int n){
        int[] tmp = new int[d];
        int[] tmp2 = Arrays.copyOf(arr,2);
        for(int i=0; i< d; i++){
            tmp[i] = arr[i];
        }
        for(int i =0 ; i < arr.length-d; i++ ){
            arr[i] = arr[i+d];
        }
        for(int i= 0 ; i < d; i++ ){
            arr[arr.length-d+i] = tmp[i];
        }
        for(int i: arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,8,9,3,4,6,7};
        rotate(ints,4,7);
    }
}
