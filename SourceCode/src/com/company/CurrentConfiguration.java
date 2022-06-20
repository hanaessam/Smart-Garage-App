package com.company;

public class CurrentConfiguration {
    private static int chosenConfiguration = 0;
    public ParkIn currentConfiguration(){
        if(chosenConfiguration==1){
            return new FirstComeFirstServed();
        }else{
            return new BestFit();
        }
    }
    public void setChosenConfiguration(int chosenConfiguration) {
        CurrentConfiguration.chosenConfiguration = chosenConfiguration;
    }
}
