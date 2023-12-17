package com.fishing;

public class FishingGear {
    private String reelName;
    private String modelNumber;
    private int reelWeight;

    public FishingGear(String reelName, String modelNumber, int reelWeight) {
        this.reelName = reelName;
        this.modelNumber = modelNumber;
        this.reelWeight = reelWeight;
    }

    public String getReelName() {
        return reelName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public int getReelWeight() {
        return reelWeight;
    }
}
