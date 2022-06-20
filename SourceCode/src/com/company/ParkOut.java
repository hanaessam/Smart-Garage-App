package com.company;

public class ParkOut {

    public boolean parkOut(int vehicleId){
        GarageData garageData = new GarageData();
        Calculations calculations=new Calculations();
        int maxNum = garageData.getMaxNumOfSlot();
        for(int i=0; i < maxNum; i++){
            if(GarageData.structArray[i].getIsFull() && vehicleId == GarageData.structArray[i].vehicle.getId()){
                GarageData.structArray[i].setIsFull(false);
                Time time = new Time();
                time.markDepartureTime(GarageData.structArray[i].vehicle);
                System.out.println("Parked Out Successfully!");
                double fees=calculations.calculateParkingFees(GarageData.structArray[i].vehicle);
                InformationFromUser info=new InformationFromUser();
                info.displayParkingFees(fees);
                calculations.modifyTotalIncome(fees);
                return true;
            }
        }
        System.out.println("Vehicle not found!");
        return false;
    }
}
