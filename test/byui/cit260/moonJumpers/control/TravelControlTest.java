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
 * @author mckenzietaggart
 */
public class TravelControlTest {
    /**
     * Test of calcGatherFuel method, of class TravelControl.
     */
    @Test
    public void testCalcGatherFuel() {
        
        System.out.println("calcGatherFuel");
        
        System.out.println("\tTest case #1");
        
        //input values for test case #1
        double userInput = 5;
        double surfaceHardness = 7;
        
        //create instance of InventoryControl class
        TravelControl instance = new TravelControl();
        
        RandomMock random = new RandomMock(
            15, // test case #1
            -7, // test case #3
            20, // test case #5
            0,  // test case #6  
            20 // test case #7
            ); 
        
        TravelControl.setRandom(random);  
        
        //call function to run test
        double expResult = 13;
        double result = instance.calcGatherFuel(userInput, surfaceHardness);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
    
    //test case #2
        System.out.println("\tTest case #2");
        
        userInput = 15;
        surfaceHardness = 2;       
        
        expResult = -1;
        result = instance.calcGatherFuel(userInput, surfaceHardness);
        assertEquals(expResult, result, 0.1);
     
    //test case #3
        System.out.println("\tTest case #3");
        
        userInput = 8;
        surfaceHardness = 10;
        
        expResult = 0;
        result = instance.calcGatherFuel(userInput, surfaceHardness);
        assertEquals(expResult, result, 0.1);
        
    //test case #4
        System.out.println("\tTest case #4");
        
        userInput = 2;
        surfaceHardness = -3;
        
        expResult = -1;
        result = instance.calcGatherFuel(userInput, surfaceHardness);
        assertEquals(expResult, result, 0.1);
        
    //test case #5
        System.out.println("\tTest case #5");
        
        userInput = 1;
        surfaceHardness = 5;
        
        expResult = 16;
        result = instance.calcGatherFuel(userInput, surfaceHardness);
        assertEquals(expResult, result, 0.1);
        
    //test case #6
        System.out.println("\tTest case #6");
        
        userInput = 10;
        surfaceHardness = 8;
        
        expResult = 2;
        result = instance.calcGatherFuel(userInput, surfaceHardness);
        assertEquals(expResult, result, 0.1);
        
    //test case #7
        System.out.println("\tTest case #7");
        
        userInput = 10;
        surfaceHardness = 10;
        
        expResult = 20;
        result = instance.calcGatherFuel(userInput, surfaceHardness);
        assertEquals(expResult, result, 0.1);   
    }
}
    

