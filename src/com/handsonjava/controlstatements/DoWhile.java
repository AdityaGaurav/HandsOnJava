package com.handsonjava.controlstatements;

/**
 * Created by adityag on 2/4/17.
 */
public class DoWhile {

    public static void createDoWhile(){
        int x=0;
        do{

            System.out.println(x);
            x++;
        }while(x < 10);
    }
public static void main(String[] args){
    createDoWhile();
}

}
