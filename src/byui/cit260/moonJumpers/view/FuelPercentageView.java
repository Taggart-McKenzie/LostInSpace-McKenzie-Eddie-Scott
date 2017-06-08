/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.control.TravelControl;
import java.util.Scanner;

/**
 *
 * @author Eddie Pincay
 */
public class FuelPercentageView {
    private String fuelPercentage;
    
    public FuelPercentageView() {
        this.fuelPercentage = "\nWhat is your Fuel            ";
    }
    
    void displayFuelPercentageView() {

        boolean done = false;
        do {

            String fuelPercentageOption = this.getFuelPercentageOption();
            if (fuelPercentageOption.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(fuelPercentageOption);
        } while (!done);

    }

    private String getFuelPercentageOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.fuelPercentage);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\nInvaild value: value can not be blank");
                continue;
            }

            break;
        }
        return value;
    }

    private boolean doAction(String fuelPercentageOption) {
        double userInput = Double.parseDouble(fuelPercentageOption);

        this.fuelPercentage = "Surface Hardness : ";
        String secondInput = this.getFuelPercentageOption();
        double surfaceHardness = Double.parseDouble(secondInput);

        double result = TravelControl.calcGatherFuel(userInput, surfaceHardness);

        if (result <= 0) {
            System.out.println("\n You are Okay");
            return false;
        } else {
            System.out.println("\n You need Fuel");
        }

        return true;
    }
    
}
