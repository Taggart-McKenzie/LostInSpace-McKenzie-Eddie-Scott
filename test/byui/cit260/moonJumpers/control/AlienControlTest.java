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
 * @author Eddie Pincay
 */
public class AlienControlTest {
    
    public AlienControlTest() {
    }

    /**
     * Test of calcRunningAway method, of class AlienControl.
     */
    @Test
    public void testCalcRunningAway() {
        System.out.println("calcRunningAway");
        
        /*****************************
         *  Test case #1
         */
        System.out.println("\tTest case #1");
        
        //input values for test case #1
        double finalVelocity = 8.0;
        double initialVelocity = 5.0;
        double time = 5.0;
        
        double expResult = 0.6;

        //created instance of AlienControl class
        AlienControl instance = new AlienControl();
        
        double result = AlienControl.calcRunningAway(finalVelocity, initialVelocity, time);
        assertEquals(expResult, result, 0.0001);
        
         // Test 2
        
        System.out.println("\tTest case #2");
        
        
        finalVelocity = 8.0;
        initialVelocity = -1.0;
        time = 5.0;
        
        expResult = -1;
        result = instance.calcRunningAway(finalVelocity, initialVelocity, time);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
