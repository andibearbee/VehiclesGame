package com.pluralsight;

public class SwampBoat extends Vehicles {
    private String coverageType;
    private String fishingFeature;

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
