package com.company;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        InformationFromUser information = new InformationFromUser();
        GarageData garageData = new GarageData();

        System.out.println("Enter the number of slots: ");
        information.setMaxNumOfSlot(sc.nextInt());

        for (int i = 0; i < garageData.getMaxNumOfSlot(); i++) {
            System.out.println("Slot number: "+ (1+i));
            information.slotInformation(garageData.structArray[i].parkingSlot);
        }

        System.out.println("Select your configuration (enter the number): 1) First come first served. " +
                "2) Best-fit Approach");

        int choice = sc.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.println("You must enter 1 or 2");
            choice = sc.nextInt();
        }
        information.setConfiguration(choice);


        information.displayAvailableSlots();
        while (true) {
            System.out.println("Choose what do you want to do: \n" +
                    "1) Park In a vehicle.  \n" +
                    "2) Park Out a vehicle. \n" +
                    "3) Display available slots. \n" +
                    "4) Display total income \n" +
                    "5) Display number of vehicles \n" +
                    "6) Exit \n");
            int chosenActions;
            chosenActions = sc.nextInt();
            switch (chosenActions) {
                case 1 -> information.callParkIn();
                case 2 -> information.callParkOut();
                case 3 -> information.displayAvailableSlots();
                case 4 -> information.displayTotalIncome();
                case 5 -> information.displayNumberOfVehicles();
                case 6 -> exit(0);
                default -> exit(0);
            }
        }
    }
}
