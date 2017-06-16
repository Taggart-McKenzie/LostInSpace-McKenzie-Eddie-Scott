/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.control.LocationControl;
import java.util.Scanner;

/**
 *
 * @author mckenzietaggart
 */
public class LiftOffView extends View {
    
    private String lift;
    
    
    @Override
    public boolean doAction(String liftOffOption) {

         this.lift = "How much fuel do you need to travel to the next destination?";
         String fuel = this.getInput();
         double fuelAmount = Double.parseDouble(fuel);
         
        this.lift = "How many miles away is your next destination?";
        String farAway = this.getInput();
        double miles = Double.parseDouble(farAway);
        
        System.out.println("LIFT_OFF value = 10");
        
        this.lift = "Calculate the solution to the problem:"
                     + "\n(fuelAmount * miles)/LIFT_OFF = liftOff";
        String solution = this.getInput();
        double liftOff = Double.parseDouble(solution);
        
        double result = LocationControl.calcLiftOff(fuelAmount, miles);
        
        if (liftOff == result){
            System.out.println("Sucessful lift off!");
        }
        else{
            System.out.println("Invalid, unsuccessful lift off. Try again.");
        }
        return true;
    }
   
}
