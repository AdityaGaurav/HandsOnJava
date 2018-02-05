package com.practicejava.pattern;

public class Pattern1 {
    /*
                *
               ***
              *****
     */
    public static void printPattern(int row){
        if(row < 0){
            throw new IllegalArgumentException("input should be grater than 0");
        }
        for(int  i =0 ; i < row ; i++){
            for(int j =0 ; j < row -i -1 ; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i +1 ; k ++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printPattern(6);
    }
}
