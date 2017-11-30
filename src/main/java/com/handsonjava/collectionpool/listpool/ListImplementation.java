package com.handsonjava.collectionpool.listpool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListImplementation {
    public static void createList(){
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("a");
        stringList.add("c");
        stringList.add("v");

        for(String str: stringList){
            System.out.println(str);
        }
        System.out.println("========================");
        Iterator<String> itr = stringList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
//            itr.remove();
        }
        System.out.println("========================");
        for(int i =0; i<stringList.size() ; i++){
            System.out.println(stringList.get(i));
        }
    }
    public static void randomList(){
        List list = new ArrayList();
        list.add("1");
        list.add(1);
        for(int i =0; i<list.size() ; i++){
            System.out.println(list.get(i));
        }
    }

    public static void createLinkedList(){
        List<String> stringList = new LinkedList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("a");
        stringList.add("c");
        stringList.add("v");
        stringList.add(null);
        stringList.add(null);
        stringList.remove(4);

        for(String str: stringList){
            System.out.println(str);
        }
        System.out.println("========================");
        Iterator<String> itr = stringList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
//            itr.remove();
        }
        System.out.println("========================");
        for(int i =0; i<stringList.size() ; i++){
            System.out.println(stringList.get(i));
        }
    }

    public static void main(String[] args){
        randomList();
    }

}
interface A{
int hashCode();
}

interface B extends A,C{

}

interface C

{

}
