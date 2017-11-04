package com.handsonjava.objects;

public class CarTest {
    public static void main(String[] args) {

        CarPriceChange c = new CarPriceChange();
        System.out.println(c.calculateOnRoadPrice(10000));
        c.setPriceAfterTaxChange(10000);
        System.out.println(c.getPriceAfterTaxChange());

        CarPriceChange c1 = new CarPriceChange();
        System.out.println(c1.getPriceAfterTaxChange());
    }
}
