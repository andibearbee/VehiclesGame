package com.pluralsight;

public class Vehicles {

    //traction is the wheels, fan, rocket
    protected String tractionMechanic, color, cargoType, engineType;
    protected int speed, fuelLevel, fuelCapacity, numberOfPassengers, cargoCapacity;
    //numOfPass is equivalent to carrierCapacity


    //vehicle durability stats
    protected double damagePercentage, playerHealthAddition;

    public Vehicles(String tractionMechanic, String color, String cargoType, String engineType, int speed, int fuelLevel, int fuelCapacity, int numberOfPassengers, int cargoCapacity, double damagePercentage, double playerHealthAddition) {
        this.tractionMechanic = tractionMechanic;
        this.color = color;
        this.cargoType = cargoType;
        this.engineType = engineType;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
        this.fuelCapacity = fuelCapacity;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.damagePercentage = damagePercentage;
        this.playerHealthAddition = playerHealthAddition;
    }

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
