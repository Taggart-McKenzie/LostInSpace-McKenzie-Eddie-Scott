/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.control.LocationControl;
import byui.cit260.moonJumpers.exceptions.LocationControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mckenzietaggart
 */
public class LiftOffView extends View {

    public LiftOffView() {
        super("How much fuel do you need to travel to the next destination?");
    }

    @Override
    public boolean doAction(String liftOffOption) {
        double fuelAmount = Double.parseDouble(liftOffOption);

        displayMessage = "How many miles away is your next destination?";
        String farAway = getInput();
        double miles = Double.parseDouble(farAway);

        System.out.println("LIFT_OFF value = 10");

        displayMessage = "Calculate the solution to the problem:"
                + "\n(fuelAmount * miles)/LIFT_OFF = liftOff";
        String solution = getInput();
        double liftOff = Double.parseDouble(solution);

        double result = 0;
        try {
            result = LocationControl.calcLiftOff(fuelAmount, miles);
        } catch (LocationControlException ex) {
            System.out.println("Invaild Number");
            return false;
        }

        if (liftOff == result) {
            System.out.println("Sucessful lift off!");
        } else {
            System.out.println("Invalid, unsuccessful lift off. Try again.");
        }
        return true;
    }

}
