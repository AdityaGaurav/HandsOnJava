package com.handsonjava.controlstatements;

/**
 * Created by adityag on 2/4/17.
 */
public class WhileLoop {
    /*
    * while loops test whether a condition is true before executing the controlled statement.
    *
    * First, the condition is tested; if it is false, nothing more is done, and the loop is finished without
    * ever executing the statements. If the condition is true, then the statements are executed, then the entire
    * loop (starting with the test) is executed again.
    *
    * Normally, the statements controlled by the loop must affect the condition. In the above example, the value of
    * x is tested, and the controlled statements change the value of x. If the controlled statements never make the
    * condition false, then the loop never exits, and the program "hangs" (stops responding). This is a kind of error
    * commonly, if inaccurately, called an infinite loop.

*/

    public static void createWhileLoop() {
       int x=0;

        while (x < 10) {

            System.out.println(x);
            x++;
        }
        System.out.println("=======================");
        int z = 0;
        while (z < 10) {

            z++;
            System.out.println(z);


        }

        System.out.println("=======================");
        int j = 0;
        while (j < 10) {

            System.out.println(j);

            ++j;
        }

        System.out.println("=======================");
        int k = 0;
        while (k < 10) {

            ++k;
            System.out.println(k);


        }


    }

    public static void main(String[] args) {
        createWhileLoop();
    }
}

