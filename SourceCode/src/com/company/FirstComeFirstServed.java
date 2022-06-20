package com.company;

public class FirstComeFirstServed implements ParkIn{
    public boolean parkInSearch(Vehicle vehicle){
        GarageData garageData = new GarageData();
        int maxNum = garageData.getMaxNumOfSlot();
        for(int i=0; i < maxNum; i++){
            if(vehicle.getSpecifications().getWidth() <= garageData.structArray[i].parkingSlot.getSpecifications().getWidth()
                    && vehicle.getSpecifications().getDepth() <= garageData.structArray[i].parkingSlot.getSpecifications().getDepth())
            {
                if(!garageData.structArray[i].getIsFull())
                {
                    garageData.structArray[i].setIsFull(true);
                    garageData.structArray[i].vehicle = vehicle;
                    Time time = new Time();
                    time.markArrivalTime(garageData.structArray[i].vehicle);

                    System.out.println("Parked Successfully!");
                    return true;
                }
            }
        }
        System.out.println("Not parked!");
        return false;
    }
}