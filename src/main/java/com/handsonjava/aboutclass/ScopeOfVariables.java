package com.handsonjava.aboutclass;

public class ScopeOfVariables {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        ScopeOfVariables scopeOfVariables =new ScopeOfVariables();
        scopeOfVariables.setName("Aditya");
        scopeOfVariables.setId(101);
        ScopeOfVariables scopeOfVariables1 = new ScopeOfVariables();
        System.out.println(scopeOfVariables1.getId());
    }
}
