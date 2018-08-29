package com.company.ParkingLot;

public class Bus extends Vehicle{

    public Bus() {
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }
    /*********only check whether size fit***********************************/
    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSize() == VehicleSize.Large;
    }

}
