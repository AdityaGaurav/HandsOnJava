package com.handsonjava.arraypool;

/**
 * Created by adityag on 2/13/17.
 */
public class CountZerosMatrix {

    public static int countZeros(int[][] inputs){

        int count=0;

        for(int i=0; i<inputs.length; i++){
            for(int j =0; j<inputs[i].length; j++){
                if(0 == inputs[i][j]){
                    ++count;
                }
            }
        }

        return count;


    }

    public static void main(String[] args){
    int[][] inputs = {{1, 0, 3},
                      {4,5,6},
                      {0,0,0},
                      {0,0,0,0,0,0,0}};
        System.out.println(countZeros(inputs));
}
}
