package com.handsonjava.arraypool;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by adityag on 5/7/2017.
 */
public class Conversion2dTo1D {

    public static int[] doConversion1DTo2D(int[][] a) {
        int length = 0;
        for (int i = 0; i < a.length; i++) {
            length += a[i].length;
        }
//        newMat = new int[a.length * a[0].length];
//        System.out.println(newMat);
        int id = 0;
        int[] newMat = new int[length];
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                newMat[id] = a[i][j];
                ++id;
            }
        }
//        System.out.print("[");
//        for (int roll : newMat) {
//            System.out.print(roll + " ");
//        }
//        System.out.println("]");
        return newMat;
    }

    public static int[][] reshapeMatrix(int[][] a, int r, int c) {
        int length = 0;
        for (int i = 0; i < a.length; i++) {
            length += a[i].length;
        }
        if (length == r * c) {
            int count = 1;
            int[] reshapedMat = doConversion1DTo2D(a);
            int[][] output = new int[r][c];
            int id = 0;
            for (int i = 0; i < r; ++i) {
                for (int j = 0; j < c; ++j) {
                    output[i][j] = reshapedMat[id];
                    ++id;
                }
            }
            return output;
        } else {
            System.out.println("Cant be reshaped");
        }
        return a;
    }
//     Using division and modulus
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                res[count / c][count % c] = nums[i][j];
                count++;
            }
        }
        return res;
    }

//    Without using extra Space
    public int[][] matrixReshape1(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        int rows = 0, cols = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                res[rows][cols] = nums[i][j];
                cols++;
                if (cols == c) {
                    rows++;
                    cols = 0;
                }
            }
        }
        return res;
    }

//    Using queue
    public int[][] matrixReshape2(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        int count = 0;
        Queue< Integer > queue = new LinkedList< >();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                queue.add(nums[i][j]);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = queue.remove();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                       {4, 5, 6},
                {4,5}
        };
        int[][] out = reshapeMatrix(mat, 1,8);
        for (int[] roll : out) {
            for (int rolling : roll) {
                System.out.print(rolling+" ");
            }
            System.out.println();
        }
//            System.out.println();
//        }
//        System.out.println("================");
//        doConversion1DTo2D(mat);
    }
}
