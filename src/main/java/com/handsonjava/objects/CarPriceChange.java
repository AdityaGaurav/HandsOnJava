package com.handsonjava.objects;

public class CarPriceChange {
    private static Car car = new Car(4,2,2,"ford","automatic",50000);
    // Remove static keyword then verify the behavior in CarTest Class.
    //private static Car car = new Car(4,2,2,"ford","automatic",50000);

    public int calculateOnRoadPrice(int roadTax){
        return car.getPrice()+ roadTax;
    }

    public void setPriceAfterTaxChange(int taxRate){
        car.setPrice(taxRate);
    }

    public int getPriceAfterTaxChange(){
        return car.getPrice();
    }
}
