package com.handsonjava.controlstatements;

/**
 * Created by adityag on 2/4/17.
 */
public class ForLoop {

    /*
    * for loops are (typically) used to execute the controlled statement a given number of times.
    * Syntax:
    * for (initialization; condition; update) {  statements }
    *     1.The initialization is performed first, and only once.
    *     2.The condition is tested and, if true, the statements are executed and the update is performed
    *     3.Then control returns to the condition.
    */

    public static void createForLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 0, j = 1; i < 10 && j < 10; i++, j++) {

            int c = i +j ;
            i=j;
            j=c;
            System.out.println(c);
        }
    }

    public static void main(String[] args){
        createForLoop();
    }

}
