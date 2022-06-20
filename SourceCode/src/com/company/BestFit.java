package com.company;


public class BestFit implements ParkIn{

    public boolean parkInSearch(Vehicle vehicle){
        GarageData garageData = new GarageData();
        int maxNum = garageData.getMaxNumOfSlot();
        double bestSum = 1e9;
        int bestIndex = -1;
        for(int i=0; i < maxNum; i++){
            if(vehicle.getSpecifications().getWidth() <= garageData.structArray[i].parkingSlot.getSpecifications().getWidth()
                    && vehicle.getSpecifications().getDepth() <= garageData.structArray[i].parkingSlot.getSpecifications().getDepth())
            {
                if(!garageData.structArray[i].getIsFull())
                {
                    double sum = garageData.structArray[i].parkingSlot.getSpecifications().getDepth() + garageData.structArray[i].parkingSlot.getSpecifications().getWidth();
                    if(sum<bestSum)
                    {
                        bestSum = sum;
                        bestIndex = i;

                    }
                }
            }
        }
        if(bestIndex == -1){
            System.out.println("Not parked!");
            return false;
        }
        else {
        garageData.structArray[bestIndex].setIsFull(true);
        garageData.structArray[bestIndex].vehicle = vehicle;
        Time time = new Time();
        time.markArrivalTime(garageData.structArray[bestIndex].vehicle);

        System.out.println("Parked Successfully!");
        return true;
    }
    }
}
