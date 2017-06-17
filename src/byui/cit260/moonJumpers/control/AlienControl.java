/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.control;

import java.util.Random;

/**
 *
 * @author sshipp57
 * 
 * 
 */
public class AlienControl {
    
    private static Random random = new Random();
    
    protected static void setRandom(Random newRandom) {
        random = newRandom;
    }
    
    public static double calcRunningAway (double finalVelocity, double initialVelocity, double time){
    
        if (finalVelocity <= 0) {
                return -1;
                        }
        if (initialVelocity <= 0 || initialVelocity > 15) {
                return -1;
                        }
        if (time <= 0) {
                return -1;
        }
        
        
         double acceleration = (finalVelocity - initialVelocity) / time;
         
         
         return acceleration;
    }
    
    public static double calcFightingAlien(double alienAttack, double playerLife){
        if (alienAttack < 0 || alienAttack > 5){
            return -1;
        }
        if (playerLife < 0){
            return -1;
        }
        
        double playerLifeFinal = (playerLife - alienAttack);
        
        if (playerLifeFinal < 0){
            playerLifeFinal = 0;
    }
        
        return playerLifeFinal;
    }
    
    public static double calcCurrentWeapon(double weaponSelect, double attackPower){
        if (weaponSelect <= 0 || weaponSelect > 5){
            return -1;
        }
        if (attackPower <= 0 || attackPower > 20){
            return -1;
        }
        
        //random numbers between 0-5
        int randomValue = random.nextInt(6); 
        double weaponCurrent = Math.round(attackPower / randomValue) + weaponSelect - randomValue;
        
        if (weaponCurrent <= 0){
            weaponCurrent = 1;
        }
        
        return weaponCurrent;
    }
}