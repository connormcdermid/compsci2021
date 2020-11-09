package com.mcdermid;

public class Car {
    private int mileage;
    private int oilTracker;

    public Car(int mileage, int oil) {
        this.mileage = mileage;
        this.oilTracker = oil;
    }

    public boolean timeForOilChange() {
        if (mileage >= oilTracker) {
            mileage = 0;
            return true;
        } else {
            return false;
        }
    }

    public void addMiles(int miles) {
        mileage += miles;
    }


}
