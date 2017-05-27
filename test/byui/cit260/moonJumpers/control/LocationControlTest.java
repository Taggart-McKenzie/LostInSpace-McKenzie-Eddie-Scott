/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sshipp57
 */
public class LocationControlTest {
    
    public LocationControlTest() {
    }

    /**
     * Test of calcLiftOff method, of class LocationControl.
     */
    @Test
    public void testCalcLiftOff() {
        System.out.println("calcLiftOff");
        
        System.out.println("\tTest case #1");
        
        double fuelAmount = 17.0;
        double miles = 4.0;
        
        double expResult = 6.8;
        
        LocationControl instance = new LocationControl();
        
        double result = LocationControl.calcLiftOff(fuelAmount, miles);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case #2");
        
        fuelAmount = -1.0;
        miles = 3.0;
        
        expResult = -1;
        
        
        result = LocationControl.calcLiftOff(fuelAmount, miles);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case #3");
        
        fuelAmount = 23.0;
        miles = -1;
        
        expResult = -1;
        
        
        result = LocationControl.calcLiftOff(fuelAmount, miles);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case #4");
        
        fuelAmount = -1;
        miles = 2.0;
        
        expResult = -1;
        
        
        result = LocationControl.calcLiftOff(fuelAmount, miles);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case #5");
        
        fuelAmount = 1.0;
        miles = 3.0;
        
        expResult = 0.3;
        
        
        result = LocationControl.calcLiftOff(fuelAmount, miles);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case #6");
        
        fuelAmount = 15.0;
        miles = 1.0;
        
        expResult = 1.5;
        
        
        result = LocationControl.calcLiftOff(fuelAmount, miles);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case #7");
        
        fuelAmount = 12.0;
        miles = 5.0;
        
        expResult = 6.0;
        
        
        result = LocationControl.calcLiftOff(fuelAmount, miles);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
