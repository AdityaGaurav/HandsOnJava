package com.handsonjava.collectionpool.mappool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by adityag on 4/30/2017.
 */
public class HashMapPractice {
    private static Map readData(){
        Map<String, String> userData = new HashMap<String, String>();
        userData.put("Aditya","Mtech:Computer Scince, Btech:Coumputer Science");
        userData.put("Anand","Btech:Coumputer Science");
        userData.put("Dipika","MBA:Computer Scince, BSC:Coumputer Science");
        userData.put("Gyan","BSC:Coumputer Science");
        return userData;
    }


    public static void getCourse(){
        Map<String, String> userData = readData();
        ArrayList<String> user= new ArrayList<String>();
        for(String roll : userData.keySet()){
            user.add(roll);
        }

        for(String roll: user){
            System.out.println(roll);
        }
      System.out.println(user.size());



    }

    public static void main(String[] args){
        getCourse();
    }
}
