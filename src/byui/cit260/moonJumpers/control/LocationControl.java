/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.control;

/**
 *
 * @author sshipp57
 */
public class LocationControl {
    public static final int LIFT_OFF = 10;
    public static double calcLiftOff (double fuelAmount, double miles){
        
        if (fuelAmount <= 0) {
                return -1;
                        }
        if (miles < 1) {
                return -1;
                        }
        if (miles > 5) {
                return -1;
        }
        
        double liftOff = (fuelAmount * miles) / LIFT_OFF;
    
    return liftOff;
    }
}
