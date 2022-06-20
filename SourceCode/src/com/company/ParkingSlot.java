package com.company;

public class ParkingSlot {
    private static int tempId = 0;
    private int id;
    private final ParkingSlotSpecifications specifications=new ParkingSlotSpecifications();
    public ParkingSlotSpecifications getSpecifications(){
        return specifications;
    }
    ParkingSlot()
    {
        tempId++;
        id=tempId;
    }

    public int getId() {
        return id;
    }



}