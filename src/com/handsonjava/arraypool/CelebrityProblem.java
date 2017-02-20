package com.handsonjava.arraypool;

/**
 * Created by adityag on 2/13/17.
 */
public class CelebrityProblem {

    public static void findCelebrity(int[][] input){

        for(int j =0; j < input[0].length; j++){
            int count = 0;
            for(int i = 0; i<input.length;i++){
                if(1 == input[i][j]){
                    ++count;
                }
            }

            if(count>0){
                System.out.println("Well known persion is:"+ j);
            }
        }
    }

    public static void main(String[] args){
        int[][] ints = {
                {0,0,1,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,1,0,0},
                {0,0,1,0,0}
        };
        //findCelebrity(ints);
        int[]A = {1,2,3,4,5,6,7,8,9};
        new CelebrityProblem().print(A);
    }

    public void print(int[]A){
        int count =1;
        for (int i=0; i < A.length; i++){
            for(int j = i; j <A.length; j++){
                i++;
                for(int k=j; k < A.length; k++){
                    i++;
                    System.out.println(count++);
                }
            }
        }
    }
}

