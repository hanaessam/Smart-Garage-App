package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {

    public void markArrivalTime(Vehicle vehicle){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        vehicle.setArrivalTime(formattedDate);
        System.out.println("Arrival Time: " + formattedDate);

    }
    public void markDepartureTime(Vehicle vehicle){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        vehicle.setDepartureTime(formattedDate);
        System.out.println("Departure Time: " + formattedDate);

    }
}
