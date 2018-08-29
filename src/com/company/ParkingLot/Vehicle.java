package com.company.ParkingLot;

import java.util.ArrayList;

public abstract class Vehicle {
    protected int spotsNeeded;
    protected VehicleSize size;
    protected String licensePlate;

    protected ArrayList<ParkingSpot> parkingSpots;


    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public VehicleSize getSize() {
        return size;
    }


    public void parkInSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    public void clearSpots() {
        for (int i = 0; i < parkingSpots.size(); i++) {
            parkingSpots.get(i).removeVehicle();
        }
        parkingSpots.clear();
    }


    //this need to be implement in subclass
    public abstract boolean canFitInSpot(ParkingSpot spot);




}
