package com.handsonjava.oops.polymorphism;

/**
 * Created by adityag on 7/17/2017.
 */
public class PolyTest {
    public static void main(String[] args) {
        Human[] humans = new Human[4];
        humans[0] = new Human("I ist BOT");
        humans[1] = new English("Jake");
        humans[2] = new Swedish("Bosse");
        humans[3] = new Spanish("Joseu");

        System.out.println("Welcoming from around the world" + "\n");
        for (int i = 0; i < humans.length; i++) {
            humans[i].talk();
        }

    }
}

