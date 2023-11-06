package com.pluralsight;

public class Moped extends Vehicles {
private String make;
private String model;
private boolean sideCar;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isSideCar() {
        return sideCar;
    }

    public void setSideCar(boolean sideCar) {
        this.sideCar = sideCar;
    }
}
