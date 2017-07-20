package com.handsonjava.collectionpool.mappool;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by adityag on 5/8/2017.
 */
public class MapExperiment {

    public static Map<String,String> userData(){
        Map<String, String> uData = new HashMap<String, String>();
        uData.put("fName","Aditya");
        uData.put("lName","Gaurav");
        return uData;
    }

    public static void iterateOverMap(Map<String,String> map){
//        Using keySet
        Set<String> set = map.keySet();
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
        }
        // uisng keySet() foreach
        System.out.print("<------------>");
        for(String roll: map.keySet()){
            System.out.println(roll);
            System.out.println(map.get(roll));
        }
    }


    public static void main(String[] args){
        iterateOverMap(userData());
    }

}
