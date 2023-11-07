package com.pluralsight;

public class Hovercraft extends Vehicles {
    private int hoverAltitude;

    public Hovercraft(String tractionMechanic, String color, String cargoType, String engineType, int speed, int fuelLevel, int fuelCapacity, int numberOfPassengers, int cargoCapacity, double damagePercentage, double playerHealthAddition, int hoverAltitude) {
        super(tractionMechanic, color, cargoType, engineType, speed, fuelLevel, fuelCapacity, numberOfPassengers, cargoCapacity, damagePercentage, playerHealthAddition);
        this.hoverAltitude = hoverAltitude;
    }

    public int getHoverAltitude() {
        return hoverAltitude;
    }

    public void setHoverAltitude(int hoverAltitude) {
        this.hoverAltitude = hoverAltitude;
    }


}
