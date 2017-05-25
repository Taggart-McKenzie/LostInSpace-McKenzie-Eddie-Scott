/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.control;

/**
 *
 * @author sshipp57
 * 
 * 
 */
public class AlienControl {
    
    public static double calcRunningAway (double finalvelocity, double initialvelocity, double time){
    
        if (finalvelocity <= 0) {
                return -1;
                        }
        if (initialvelocity <= 0 || initialvelocity > 15) {
                return -1;
                        }
        if (time <= 0) {
                return -1;
        }
        
        
         double acceleration = (finalvelocity - initialvelocity) / time;
         
         
         return acceleration;
    }
    
    public static double calcFightingMonster (double mass, double velocity, double time){
        
        if (mass <= 0) {
            return -1;
                    }
        if (velocity <= 0 || velocity > 15){
            return -1;
                    }
        if (time <=0) {
            return -1;
                    }
        
        double force = (mass * velocity) / time;
        
        return force;
    }
}
