package com.pluralsight;

public class Vehicles {
    private String engineType;


    private String tractionMechanic; //this is the wheels, fan, rocket
    private String color;
    private int speed;
    private int fuelLevel;
    private int fuelCapacity;
    private int numberOfPassengers; //equivalent to carrierCapacity
    private int cargoCapacity;
    private String cargoType;

    //vehicle durability stats
    private double damagePercentage;
    private double playerHealthAddition;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getTractionMechanic() {
        return tractionMechanic;
    }

    public void setTractionMechanic(String tractionMechanic) {
        this.tractionMechanic = tractionMechanic;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    //this will be used when swapping/upgrading the trailers. The moped, car, and hovercraft cargo capacity will not change
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public double getDamagePercentage() {
        return damagePercentage;
    }

    public void setDamagePercentage(double damagePercentage) {
        this.damagePercentage = damagePercentage;
    }

    public double getPlayerHealthAddition() {
        return playerHealthAddition;
    }

    public void setPlayerHealthAddition(double playerHealthAddition) {
        this.playerHealthAddition = playerHealthAddition;
    }

    public void refuel() {

    }

    public void accelerate() {

    }

    public void brake() {

    }



}
