package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vehicle {
    private String modelName;
    private int modelYear;
    private int id;

    private static long counter=0;

    private String arrivalTime;
    private String departureTime;
    private final VehicleSpecifications specifications =new VehicleSpecifications();
    public VehicleSpecifications getSpecifications(){
        return specifications;
    }

    public long counterPlus(){
        counter++;
        return counter;
    }

    public static long getCounter() {
        return counter;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }



    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
