package com.handsonjava.operators;

public class labelledBlock {
    public static void main(String[] args) {

        l1:
        {
            System.out.println("------------");
            if (true) {
                break l1;
            }
            System.out.println("l1 block");
        }
        l2:
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                if (j == 10) {
                    System.out.println(j);
                    break;
                }
                System.out.println(j);
            }
            System.out.println("outer loop");
        }
        for(int i =1; i <20 ; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        for(int i =1; i<100; i++){
            if( i %10 ==0){
                continue;
            }
            System.out.println(i);
            if( i > 65){
                break;
            }
        }

    }
}
