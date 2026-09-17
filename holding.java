package com.portfolio.app.model;

public class holding {

    private String holdingId;
    private Asset asset;
    private int quantity;

    // Constructor
    public holding(String holdingId, Asset asset, int quantity) {
        this.holdingId = holdingId;
        this.asset = asset;
        this.quantity = quantity;
    }

    // Getters
    public String getHoldingId() {
        return holdingId;
    }

    public Asset getAsset() {
        return asset;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setHoldingId(String holdingId) {
        this.holdingId = holdingId;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Calculate total value
    public double calculateValue() {
        return asset.calculateCurrentValue() * quantity;
    }

    // Display holding details
    public void display() {
        System.out.println("Holding ID: " + holdingId);
        System.out.println("Asset ID: " + asset.getAssetId());
        System.out.println("Asset Name: " + asset.getAssetName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Current Value: " + asset.calculateCurrentValue());
        System.out.println("Total Value: " + calculateValue());
    }
}