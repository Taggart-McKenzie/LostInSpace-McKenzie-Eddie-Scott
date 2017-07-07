/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.control.TravelControl;
import byui.cit260.moonJumpers.exceptions.TravelControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eddie Pincay
 */
public class FuelPercentageView extends View {

    private double userInput;
    private double surfaceHardness;

    public FuelPercentageView() {
        super( "\nWhat is your Fuel?");
    }
    
    
    @Override
    public boolean doAction(String fuelPercentageOption) {
        try {
            //parse and convert number form text to a double
            double userInput = Double.parseDouble(fuelPercentageOption);            
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number. Try again or enter Q to quit.");
        }


        displayMessage = "Surface Hardness : ";
        String secondInput = getInput();
        try {
            double surfaceHardness = Double.parseDouble(secondInput);
        } catch (NumberFormatException nf){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number. Try again or enter Q to quit.");
        }
        
        double result = 0;
        try {
            result = TravelControl.calcGatherFuel(userInput, surfaceHardness);
        } catch (TravelControlException ex) {
            this.console.println(ex.getMessage());
        }

        if (result <= 0) {
            this.console.println("\n You are Okay");
            return false;
        } else {
            this.console.println("\n You need Fuel");
        }

        return true;
    }
    
}
