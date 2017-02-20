package com.handsonjava.keeppracticing;

/**
 * Created by adityag on 2/6/17.
 */
public class ParentObject {

    int firstNumber;
    int secondNumber;
    int result;
    ParentObject pObject;

    public void creatFinalObject(int a, int b){
          this.firstNumber=a;
          this.secondNumber = b;
          this.result =a+b;


        System.out.println("creatFinalObject result: "+ result);

    }

    public void runObjectFactory(){

        int x =0 ;

        while(x<4){
            int b =x;
            pObject = new ParentObject();
            System.out.println(pObject);
            ++x;
        }

        System.out.println(pObject);

    }



    public static void main(String[] args){

         ParentObject p =new ParentObject();
//         p.creatFinalObject(5,4);
//
//
//        ParentObject p1 = new ParentObject();
//        p1.creatFinalObject(6,7);
//        System.out.println("Value of firstNumber stroed in p1: "+p1.firstNumber);
//        System.out.println("Value of firstNumber stroed in p: "+p.firstNumber);
//        p=p1;
//        System.out.println("Now, reference variable 'p' is pointing out to object that is pointing by p1. " +
//                "Value of firstNumber stroed in p: "+p.firstNumber);
//
//        final ParentObject p2 =new ParentObject();
//        p2.creatFinalObject(1,2);

        p.runObjectFactory();

    }

}
