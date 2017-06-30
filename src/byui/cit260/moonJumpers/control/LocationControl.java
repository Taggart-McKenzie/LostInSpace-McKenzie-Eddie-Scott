/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.control;

import byui.cit260.moonJumpers.exceptions.LocationControlException;

/**
 *
 * @author sshipp57
 */
public class LocationControl {
    public static final int LIFT_OFF = 10;
    public static double calcLiftOff (double fuelAmount, double miles) throws LocationControlException{
        
        if (fuelAmount <= 0) {
                throw new LocationControlException();
                        }
        if (miles < 1) {
                throw new LocationControlException();
                        }
        if (miles > 5) {
                throw new LocationControlException();
        }
        
        double liftOff = (fuelAmount * miles) / LIFT_OFF;
    
    return liftOff;
    }
}
