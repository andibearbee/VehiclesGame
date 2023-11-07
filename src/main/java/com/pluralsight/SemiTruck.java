package com.pluralsight;

public class SemiTruck extends Vehicles {
    private int brakingDistance;
    private String trailerType;
    private boolean sleeperCab;

    public SemiTruck(String tractionMechanic, String color, String cargoType, String engineType, int speed, int fuelLevel, int fuelCapacity, int numberOfPassengers, int cargoCapacity, double damagePercentage, double playerHealthAddition, int brakingDistance, String trailerType, boolean sleeperCab) {
        super(tractionMechanic, color, cargoType, engineType, speed, fuelLevel, fuelCapacity, numberOfPassengers, cargoCapacity, damagePercentage, playerHealthAddition);
        this.brakingDistance = brakingDistance;
        this.trailerType = trailerType;
        this.sleeperCab = sleeperCab;
    }

    public int getBrakingDistance() {
        return brakingDistance;
    }

    public void setBrakingDistance(int breakingDistance) {
        this.brakingDistance = breakingDistance;
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    public boolean isSleeperCab() {
        return sleeperCab;
    }

    public void setSleeperCab(boolean sleeperCab) {
        this.sleeperCab = sleeperCab;
    }
}
