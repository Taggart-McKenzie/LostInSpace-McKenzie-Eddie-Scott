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
public class FuelPercentageView extends View {

    public FuelPercentageView() {
        super( "\nWhat is your Fuel            ");
    }
    
    
    @Override
    public boolean doAction(String fuelPercentageOption) {
        double userInput = Double.parseDouble(fuelPercentageOption);

        this.displayMessage = "Surface Hardness : ";
        String secondInput = this.getInput();
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
