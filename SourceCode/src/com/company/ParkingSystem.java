package com.company;

import java.util.Scanner;

public class ParkingSystem {
    private ParkIn choice;

    public void setAlgorithm(ParkIn choice){
        this.choice=choice;
    }
    public void parkIn(){
        Vehicle vehicle = new Vehicle();
        InformationFromUser info = new InformationFromUser();
        info.vehicleInformation(vehicle);
        if(choice.parkInSearch(vehicle)){
            vehicle.counterPlus();
        }
    }

    public void parkOut(){
        ParkOut parkOut = new ParkOut();
        InformationFromUser information = new InformationFromUser();
        System.out.println("Enter the vehicle's ID: ");
        Scanner sc = new Scanner(System.in);
        int vehicleId = sc.nextInt();
        information.setVehicleId(vehicleId);
        parkOut.parkOut(information.getVehicleId());
    }

}