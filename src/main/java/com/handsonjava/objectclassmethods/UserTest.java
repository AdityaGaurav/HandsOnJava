package com.handsonjava.objectclassmethods;

import java.util.HashSet;

public class UserTest {
    public static void main(String[] args){
        User user1 = new User(101, "Aditya","adi@gmail.com");
        User user2 = new User(102, "Aditya","adi@gmail.com");
        User user3 = new User(103, "Aditya","adi@gmail.com");
        User user4 = new User(101, "Aditya","adi@gmail.com");
        HashSet<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        System.out.println(users.size());
    }
}
