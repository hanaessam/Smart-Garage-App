package com.company;


public class GarageData {
    private static int maxNumOfSlot;

    public static Struct[] structArray;

    public int getMaxNumOfSlot() {
        return maxNumOfSlot;
    }
    public void setMaxNumOfSlot(int _maxNumOfSlot) {
        maxNumOfSlot = _maxNumOfSlot;
        structArray = new Struct[maxNumOfSlot];
        for(int i=0;i<maxNumOfSlot;i++)
        {
            structArray[i]=new Struct();
        }
    }

}
