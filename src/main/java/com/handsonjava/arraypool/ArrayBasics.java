package com.handsonjava.arraypool;

public class ArrayBasics {
public static void addInArray(int[] inp){
    for(int i =0 ; i < inp.length ; i++){
        inp[i] = inp[i] +1;
    }
}
    public int[] getArray(int[] ints){
        return ints;
    }
    public static void main(String[] args) {
//        //Array declarations
//        //Array initializer block
//        int[] ints = {1,2,3,4,4};
//        char[] chars = new char[4];
//        short[] shorts;
//        shorts =new short[3];
//        CelebrityProblem[] celebrityProblems = new CelebrityProblem[3];
//        celebrityProblems[0] = new CelebrityProblem();
//        celebrityProblems[0].print(ints);
//
//        //Multidimensional Arrays
//        int[] inputs[] = new int[4][];
//        inputs[0] = new int[]{1,2,3,4,5};
//        inputs[1] = new int[2];
//        inputs[2] = new int[3];
//        inputs[3] = new int[4];
//        System.out.println(inputs[0].length);
        int[] input ={1,2,3,4};
        addInArray(input);
        addInArray(input);
        for (int i : input){
            System.out.println(i);
        }

    }
}
