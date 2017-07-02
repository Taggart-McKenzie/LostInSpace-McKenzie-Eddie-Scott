/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.control;

import byui.cit260.moonJumpers.exceptions.TravelControlException;
import java.util.Random;

/**
 *
 * @author mckenzietaggart
 */
public class TravelControl{

    private static Random random = new Random();
    
    protected static void setRandom(Random newRandom) {
        random = newRandom;
    }
    
    public static double calcGatherFuel(double userInput, double surfaceHardness) 
        throws TravelControlException{
        
        if (userInput < 1 || userInput > 10) { //must be between 1-10
            throw new TravelControlException("userInput cannot be less than 1 or "
                                           + "greater than 10.");
        }
        if (surfaceHardness < 0) { //cannot be a negative number
            throw new TravelControlException("surfaceHardness cannot be a negative number.");
        }
        
        //random numbers between 0-20
        int randomValue = random.nextInt(21); 
        double gatherFuel = (randomValue + userInput) - surfaceHardness;
        
        //if a random number is negative, it will return 0
        if (gatherFuel < 0) {
            return gatherFuel = 0;
        }
        return gatherFuel; 
    } 
        
}
