/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.control.TravelControl;


/**
 *
 * @author sshipp57
 */
public class GatherFuelView extends View {

    public GatherFuelView(){
        super("\nPlease put in a number (1 - 10)");
}
    
    
    @Override
    public boolean doAction(String gatherFuelView) {
        double userInput = Double.parseDouble(gatherFuelView);
        
        displayMessage = "What is the surface hardness?";
        String hardness = getInput();
        double surfaceHardness = Double.parseDouble(hardness);
        
        double result = TravelControl.calcGatherFuel(userInput, surfaceHardness);
        
        if (result < 0){
            System.out.println("You gathered no fuel");
            return false;
        } else {
            System.out.println("You gathered " + result + " fuel");
        }
        return true;
    }
    
}
