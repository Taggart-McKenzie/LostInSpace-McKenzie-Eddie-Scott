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
        System.out.println("\t Test case #1");
        
        //input values for test case #1
        double finalvelocity = 8.0;
        double initialvelocity = 5.0;
        double time = 5.0;
        
        double expResult = 0.6;

        //created instance of AlienControl class
        AlienControl instance = new AlienControl();
        
        double result = AlienControl.calcRunningAway(finalvelocity, initialvelocity, time);
        assertEquals(expResult, result, 0.0001);
        
        
    }
    
}
