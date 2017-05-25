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
        
        // Test 3
        
        System.out.println("\tTest case #3");
        
        
        finalVelocity = -1.0;
        initialVelocity = 5.0;
        time = 5.0;
        
        expResult = -1;
        result = instance.calcRunningAway(finalVelocity, initialVelocity, time);
        assertEquals(expResult, result, 0.0);
        
        
        // Test 4
        
        System.out.println("\tTest case #4");
        
        
        finalVelocity = 30;
        initialVelocity = 35;
        time = 5.0;
        
        expResult = -1;
        result = instance.calcRunningAway(finalVelocity, initialVelocity, time);
        assertEquals(expResult, result, 0.0);
       
        
        // Test 5
        
        System.out.println("\tTest case #5");
        
        
        finalVelocity = 8.0;
        initialVelocity = 0.0;
        time = 5.0;
        
        expResult = -1;
        result = instance.calcRunningAway(finalVelocity, initialVelocity, time);
        assertEquals(expResult, result, 0.0);
        
        
        // Test 6
        
        System.out.println("\tTest case #6");
        
        
        finalVelocity = 0.0;
        initialVelocity = 5.0;
        time = 5.0;
        
        expResult = -1;
        result = instance.calcRunningAway(finalVelocity, initialVelocity, time);
        assertEquals(expResult, result, 0.0);
       
        
        //Test 7
        
        System.out.println("\tTest case #7");
        
        
        finalVelocity = 30.0;
        initialVelocity = 35.0;
        time = 5.0;
        
        expResult = -1;
        result = instance.calcRunningAway(finalVelocity, initialVelocity, time);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
