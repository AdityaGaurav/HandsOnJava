package com.handsonjava.iproblems.idatastruture;

public class StackUsingArray {
    private int size;
    private int[] stackArray;
    private int top;

    StackUsingArray(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size should be greater than 0");
        }
        this.size = size;
        stackArray = new int[this.size];
        top =-1;
    }

    public void push(int element){
       if(top == stackArray.length-1){
           throw new IllegalArgumentException("");
       }
       stackArray[++top] = element;
    }

    public int pop(){
        if(top == -1){

        }
//        int element = stackArray[top];
//        top--;
        return stackArray[top--];
    }

    public int top(){
        if(top == -1){

        }
        return stackArray[top];
    }

    public boolean isEmpty(){
        return true;
    }

    public boolean isFull(){
        return false;
    }

    public void deleteStack(){
        top = -1;
    }


}
