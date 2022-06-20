package com.company;

import java.util.Scanner;

public class InformationFromUser {


    public void vehicleInformation(Vehicle vehicle){
        System.out.println("Enter your vehicle information");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vehicle id: ");
        vehicle.setId(sc.nextInt());
        System.out.println("Enter Model Name: ");
        vehicle.setModelName(sc.next());
        System.out.println("Enter Model Year: ");
        vehicle.setModelYear(sc.nextInt());
        System.out.println("Enter vehicle width: ");
        double width =sc.nextDouble();
        vehicle.getSpecifications().setWidth(width);
        System.out.println("Enter vehicle depth: ");
        double depth = sc.nextDouble();
        vehicle.getSpecifications().setDepth(depth);

        while (vehicle.getSpecifications().getDepth()<=0 || vehicle.getSpecifications().getWidth()<=0){
            System.out.println("Dimensions can't be less than or equal zero!");
            System.out.println("Please try again");
            System.out.println("Enter vehicle width: ");
            try{
                width=sc.nextDouble();
            }catch (NumberFormatException ex) {
                System.out.println("That's not a number!");
                System.out.println("Enter vehicle width: ");
                width=sc.nextDouble();
            }
            vehicle.getSpecifications().setWidth(width);

            System.out.println("Enter vehicle depth: ");
            try{
                depth=sc.nextDouble();
            }catch (NumberFormatException ex) {
                System.out.println("That's not a number!");
                System.out.println("Enter vehicle depth: ");
                depth=sc.nextDouble();
            }
            vehicle.getSpecifications().setDepth(depth);
        }

    }

    public void slotInformation(ParkingSlot slot){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter slot width: ");
        double width = sc.nextDouble();
        slot.getSpecifications().setWidth(width);
        System.out.println("Enter slot depth: ");
        double depth=sc.nextDouble();
        slot.getSpecifications().setDepth(depth);

        while (slot.getSpecifications().getDepth()<=0 || slot.getSpecifications().getWidth()<=0){
            System.out.println("Dimensions can't be less than or equal zero!");
            System.out.println("Please try again");
            System.out.println("Enter slot width: ");
            try{
                width=sc.nextDouble();
            }catch (NumberFormatException ex) {
                System.out.println("That's not a number!");
                System.out.println("Enter slot width: ");
                width=sc.nextDouble();
            }
            slot.getSpecifications().setWidth(width);

            System.out.println("Enter slot depth: ");
            try{
                depth=sc.nextDouble();
            }catch (NumberFormatException ex) {
                System.out.println("That's not a number!");
                System.out.println("Enter slot depth: ");
                depth=sc.nextDouble();
            }
            slot.getSpecifications().setDepth(depth);
        }

    }


    public void setConfiguration(int choice){
        CurrentConfiguration current = new CurrentConfiguration();
        current.setChosenConfiguration(choice);
    }

    public void displayAvailableSlots()
    {
        GarageData garageData = new GarageData();
        int maxNum = garageData.getMaxNumOfSlot();
        if(maxNum==0){
            System.out.println("There's no Available slots.");
        }else {
            System.out.println("Available slots: ");
            for (int i = 0; i < maxNum; i++) {
                if (!GarageData.structArray[i].getIsFull()) {
                    System.out.println("Slot number = " + GarageData.structArray[i].parkingSlot.getId());
                    System.out.println("Slot width = " + GarageData.structArray[i].parkingSlot.getSpecifications().getWidth());
                    System.out.println("Slot depth = " + GarageData.structArray[i].parkingSlot.getSpecifications().getDepth());
                }
            }
        }
    }
    public void displayTotalIncome(){
        Calculations calculations=new Calculations();
        System.out.println("Total income = "+calculations.getTotalIncome()+" LE");
    }
    public void displayNumberOfVehicles(){
        System.out.println("Number of vehicles: "+Vehicle.getCounter());
    }
    public void displayParkingFees(double fees){
        System.out.println("Vehicle Fees = "+fees+" LE");
    }

    public void setMaxNumOfSlot(int _maxNumOfSlots){
        GarageData garageData = new GarageData();
        Scanner sc=new Scanner(System.in);
        /*if(_maxNumOfSlots > 0) {
            try {
                garageData.setMaxNumOfSlot(_maxNumOfSlots);
            } catch (Exception e) {System.out.println(e.getMessage()+ e.getCause());}
        } else {System.out.println("Number of slots can't be less than or equal zero!");
            System.exit(1);
        }*/
        while(_maxNumOfSlots<=0){
            System.out.println("Number of slots can't be less than or equal zero!");
            System.out.println("Enter number of slots again: ");
            _maxNumOfSlots=sc.nextInt();
        }
        garageData.setMaxNumOfSlot(_maxNumOfSlots);
    }

    public void callParkIn(){
        ParkingSystem parkingSystem = new ParkingSystem();
        CurrentConfiguration current=new CurrentConfiguration();
        parkingSystem.setAlgorithm(current.currentConfiguration());
        parkingSystem.parkIn();
    }

    Vehicle vehicle= new Vehicle();
    public void setVehicleId(int vehicleId){
        vehicle.setId(vehicleId);
    }
    public int getVehicleId(){
        return vehicle.getId();
    }

    public void callParkOut(){
        ParkingSystem parkingSystem = new ParkingSystem();
        parkingSystem.parkOut();

    }


}

