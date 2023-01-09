package com.shahin.rentacar.models;

public class CombinedVehicle {
    String vehicleName;
    String vehicleDescription;
    String vehicleRating;
    String seat;
    String gate;
    String bag;
    int vehicleImage;
    String pricePerDay;


    public CombinedVehicle(String vehicleName, String vehicleDescription, String vehicleRating, String seat, String gate, String bag, int vehicleImage, String pricePerDay) {
        this.vehicleName = vehicleName;
        this.vehicleDescription = vehicleDescription;
        this.vehicleRating = vehicleRating;
        this.seat = seat;
        this.gate = gate;
        this.bag = bag;
        this.vehicleImage = vehicleImage;
        this.pricePerDay = pricePerDay;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleDescription() {
        return vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

    public String getVehicleRating() {
        return vehicleRating;
    }

    public void setVehicleRating(String vehicleRating) {
        this.vehicleRating = vehicleRating;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getBag() {
        return bag;
    }

    public void setBag(String bag) {
        this.bag = bag;
    }

    public int getVehicleImage() {
        return vehicleImage;
    }

    public void setVehicleImage(int vehicleImage) {
        this.vehicleImage = vehicleImage;
    }

    public String getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(String pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
