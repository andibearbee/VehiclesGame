package com.pluralsight;

public class SwampBoat extends Vehicles {
    private String coverageType, fishingFeature;

    public SwampBoat(String tractionMechanic, String color, String cargoType, String engineType, int speed, int fuelLevel, int fuelCapacity, int numberOfPassengers, int cargoCapacity, double damagePercentage, double playerHealthAddition, String coverageType, String fishingFeature) {
        super(tractionMechanic, color, cargoType, engineType, speed, fuelLevel, fuelCapacity, numberOfPassengers, cargoCapacity, damagePercentage, playerHealthAddition);
        this.coverageType = coverageType;
        this.fishingFeature = fishingFeature;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }

    public String getFishingFeature() {
        return fishingFeature;
    }

    public void setFishingFeature(String fishingFeature) {
        this.fishingFeature = fishingFeature;
    }
}
