package com.pluralsight;

public class SemiTruck extends Vehicles {
    private int breakingDistance;
    private String trailerType;
    private boolean sleeperCab;

    public int getBreakingDistance() {
        return breakingDistance;
    }

    public void setBreakingDistance(int breakingDistance) {
        this.breakingDistance = breakingDistance;
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
