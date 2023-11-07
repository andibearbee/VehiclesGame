package com.pluralsight;

public class Moped extends Vehicles {
private String make, model;
private boolean sideCar;

    public Moped(String tractionMechanic, String color, String cargoType, String engineType, int speed, int fuelLevel, int fuelCapacity, int numberOfPassengers, int cargoCapacity, double damagePercentage, double playerHealthAddition, String make, String model, boolean sideCar) {
        super(tractionMechanic, color, cargoType, engineType, speed, fuelLevel, fuelCapacity, numberOfPassengers, cargoCapacity, damagePercentage, playerHealthAddition);
        this.make = make;
        this.model = model;
        this.sideCar = sideCar;
    }

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
