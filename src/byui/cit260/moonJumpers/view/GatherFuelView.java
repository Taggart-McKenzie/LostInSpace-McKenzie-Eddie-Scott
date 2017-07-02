/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.control.TravelControl;
import byui.cit260.moonJumpers.exceptions.TravelControlException;


/**
 *
 * @author sshipp57
 */
public class GatherFuelView extends View {

    private double surfaceHardness;
    private double userInput;
    

    public GatherFuelView(){
        super("\nPlease put in a number (1 - 10)");
}
    
    
    @Override
    public boolean doAction(String gatherFuelView) {
        try {
        double userInput = Double.parseDouble(gatherFuelView);
        } catch (NumberFormatException nf) {
            System.out.println("\nYou must enter a valid number. Try again or enter Q to quit.");
        }
        displayMessage = "What is the surface hardness?";
        String hardness = getInput();
        
        try {
            double surfaceHardness = Double.parseDouble(hardness);
        } catch (NumberFormatException nf) {
            System.out.println("\nYou must enter a valid number. Try again or enter Q to quit.");
        }
        
        double result = 0;
        try {
            result = TravelControl.calcGatherFuel(userInput, surfaceHardness);
        } catch (TravelControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        if (result < 0){
            System.out.println("You gathered no fuel");
            return false;
        } else {
            System.out.println("You gathered " + result + " fuel");
        }
        return true;
    }
    
}
