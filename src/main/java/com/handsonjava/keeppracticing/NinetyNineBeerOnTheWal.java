package com.handsonjava.keeppracticing;

/**
 * Created by adityag on 2/5/17.
 */
public class NinetyNineBeerOnTheWal {

    private int totalCountOfBeer;

    public NinetyNineBeerOnTheWal(int numberOfBeer) {
        if (numberOfBeer <= 0) {
            System.out.println("Provide correct input");
            System.exit(0);
        } else {
            this.totalCountOfBeer = numberOfBeer;
        }
    }


    public int getBeerCount() {

        return this.totalCountOfBeer;
    }


    public void orederBeer() {

        int tmpBeerCount = this.getBeerCount();
        while (tmpBeerCount > 0) {
            if (tmpBeerCount != 1) {

                System.out.println(tmpBeerCount + " bottles of beer on the wall, " + tmpBeerCount +
                        " bottles of beer.");

                --tmpBeerCount;

                System.out.println("Take one down and pass it around, " + tmpBeerCount +
                        " bottles of beer on the wall.\n");
            } else {
                System.out.println(tmpBeerCount + " bottle of beer on the wall, " + tmpBeerCount +
                        " bottle of beer.");
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, " + this.getBeerCount() + " bottles of beer on the wall.");
                --tmpBeerCount;
            }
        }


    }

    public static void main(String[] args) {
        NinetyNineBeerOnTheWal beer = new NinetyNineBeerOnTheWal(5);
        beer.orederBeer();

    }
}
