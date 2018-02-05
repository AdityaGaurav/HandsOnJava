package com.handsonjava.enums;

import org.omg.IOP.ENCODING_CDR_ENCAPS;

import java.util.logging.Logger;

import static com.handsonjava.enums.EnumBasics.FIREFOX;

public class EnumTest {
    // Invoke the factory method to get a new Logger or return the existing Logger
    //  of the fully-qualified class name.
    // Set to static as there is one logger per class.
    private static final Logger logger = Logger.getLogger(EnumTest.class.getName());

    public void setBrowserType(EnumBasics enumBasics) {
        try {
            if (enumBasics == null) {
                throw new IllegalArgumentException("Not a valid browser Name");
            }
        } catch (IllegalArgumentException e) {
            enumBasics = EnumBasics.FIREFOX;
        }
        switch (enumBasics) {
            case FIREFOX:
                break;
            case CHROME:
                break;
            case SAFARI:
                break;
            case INTERNET_EXPLORER:
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println(EnumBasics.FIREFOX.getDetails());
        EnumBasics c = EnumBasics.FIREFOX;
        System.out.println(c.equals(EnumBasics.FIREFOX));
//        EnumBasics.callStatic();
//        for (EnumBasics enumBasics : EnumBasics.values()) {
//            enumBasics.getBrowserDetails();
//            enumBasics.getDetails();
//        }
    }
}
