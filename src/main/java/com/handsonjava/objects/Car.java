package com.handsonjava.objects;

public class Car {
    private int tire;
    private int doors;
    private int windows;
    private String brandName;
    private String engineType;
    private int price;

    public Car(int tire, int doors, int windows, String brandName, String engineType, int price) {
        this.tire = tire;
        this.doors = doors;
        this.windows = windows;
        this.brandName = brandName;
        this.engineType = engineType;
        this.price = price;
    }

    public int getTire() {
        return tire;
    }

    public void setTire(int tire) {
        this.tire = tire;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
