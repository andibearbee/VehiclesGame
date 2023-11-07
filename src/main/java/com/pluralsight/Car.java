package com.pluralsight;

public class Car extends Vehicles {
    private String make;
    private String model;
    private String carType;

    public Car(String tractionMechanic, String color, String cargoType, String engineType, int speed, int fuelLevel, int fuelCapacity, int numberOfPassengers, int cargoCapacity, double damagePercentage, double playerHealthAddition, String make, String model, String carType) {
        super(tractionMechanic, color, cargoType, engineType, speed, fuelLevel, fuelCapacity, numberOfPassengers, cargoCapacity, damagePercentage, playerHealthAddition);
        this.make = make;
        this.model = model;
        this.carType = carType;
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

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
