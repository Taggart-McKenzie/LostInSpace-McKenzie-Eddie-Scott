/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.control;

import byui.cit260.moonJumpers.exceptions.AlienControlException;
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
    public void testCalcRunningAway() throws AlienControlException {
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

    /**
     * Test of calcFigthingAlien method, of class AlienControl.
     */
    @Test
    public void testCalcFightingAlien() throws AlienControlException {
        System.out.println("calcFightingAlien");
        
        /*****************************
         *  Test case #1
         */
        System.out.println("\tTest case #1");
        
        //input values for test case #1
        double alienAttack = 3.0;
        double playerLife = 30.0;
        
        double expResult = 27.0;

        //created instance of AlienControl class
        AlienControl instance = new AlienControl();
        
        double result = instance.calcFightingAlien(alienAttack, playerLife);
        assertEquals(expResult, result, 0.0001);
        
        // Test case 2
        System.out.println("\tTest case #2");
        
        alienAttack = -2.0;
        playerLife = 10.0;
        
        expResult = -1;
        result = instance.calcFightingAlien(alienAttack, playerLife);
        assertEquals(expResult, result, 0.0);
        
        // Test case 3
        System.out.println("\tTest case #3");
        
        alienAttack = 4.0;
        playerLife = -2.0;
        
        expResult = -1;
        result = instance.calcFightingAlien(alienAttack, playerLife);
        assertEquals(expResult, result, 0.0);
        
        // Test case 4
        System.out.println("\tTest case #4");
        
        alienAttack = 10.0;
        playerLife = 20.0;
        
        expResult = -1;
        result = instance.calcFightingAlien(alienAttack, playerLife);
        assertEquals(expResult, result, 0.0);
        
        // Test case 5
        System.out.println("\tTest case #5");
        
        alienAttack = 5.0;
        playerLife = 4.0;
        
        expResult = 0;
        result = instance.calcFightingAlien(alienAttack, playerLife);
        assertEquals(expResult, result, 0.0);
        
        // Test case 6
        System.out.println("\tTest case #6");
        
        alienAttack = 0.0;
        playerLife = 12.0;
        
        expResult = 12;
        result = instance.calcFightingAlien(alienAttack, playerLife);
        assertEquals(expResult, result, 0.0);
        
        // Test case 7
        System.out.println("\tTest case #7");
        
        alienAttack = 4.0;
        playerLife = 22.0;
        
        expResult = 18;
        result = instance.calcFightingAlien(alienAttack, playerLife);
        assertEquals(expResult, result, 0.0);
    }
    
}
