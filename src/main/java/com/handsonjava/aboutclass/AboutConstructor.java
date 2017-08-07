package com.handsonjava.aboutclass;

/**
 * Created by adityag on 7/10/2017.
 */
public class AboutConstructor extends StaticMember {
    private static AboutConstructor aboutConstructor = null;

    private AboutConstructor()throws Exception {
        super();
    }
    public AboutConstructor(String s) throws Exception{

    }

    public static AboutConstructor getInstance() throws Exception{
        if (aboutConstructor == null) {
            aboutConstructor = new AboutConstructor();
        }
        return aboutConstructor;
    }
    public static void main(String [] args){
        FinalClass f =new FinalClass("Aditya");
        FinalClass f1 =new FinalClass("Gaurav");
        System.out.print(f.getTitle());
        System.out.print(f1.getTitle());
    }
}

