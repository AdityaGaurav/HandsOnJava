package com.handsonjava.innerclasses;

public class India {
    Country country = new Country() {
        @Override
        public String localLanguage(String lang) {
            return lang;
        }

        @Override
        public void greetPeople(String message) {
            System.out.println(message);
        }
    };
    public static void main(String[] args){
        India india = new India();
        india.country.greetPeople("Namste");
    }
}
