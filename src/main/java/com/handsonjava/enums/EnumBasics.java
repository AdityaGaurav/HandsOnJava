package com.handsonjava.enums;

public enum EnumBasics {

    FIREFOX("Firefox", "56.0", "Windows") {
        String b;
        @Override
        public String getDetails() {
            return "Fire";
        }
    },
    SAFARI("Safari", "41.0", "Mac") {
        public String getDetails() {
            return "Fire";
        }
    },
    INTERNET_EXPLORER("Internet Explorer", "11", "Windows") {
        public String getDetails() {
            return "Fire";
        }
    },
    CHROME("Chrome", "62", "Windows") {
        public String getDetails() {
            return "Fire";
        }
    },
    PRAC() {
         class EnumClass {

        }
        abstract class Ex {

        }

        public String getDetails() {
            return "Fire";
        }
    };

    private String browserName, browserVersion, machine;

    EnumBasics(String browserName, String browserVersion, String machine) {
        this.browserName = browserName;
        this.browserVersion = browserVersion;
        this.machine = machine;
    }

    EnumBasics() {

    }
public static void callStatic(){

}
    public String getBrowserDetails() {
        return this.browserName + " " + this.browserVersion + " " + this.machine;
    }

    public abstract String getDetails();

    public static void main(String[] args) {

    }
}
