package com.company;

public class Struct {
    public ParkingSlot parkingSlot=new ParkingSlot();
    public Vehicle vehicle=new Vehicle();
    private boolean isFull;
    Struct(){
        isFull = false;
    }
    public boolean getIsFull() {
        return isFull;
    }

    public void setIsFull(boolean isfull) {
        isFull = isfull;
    }
}
