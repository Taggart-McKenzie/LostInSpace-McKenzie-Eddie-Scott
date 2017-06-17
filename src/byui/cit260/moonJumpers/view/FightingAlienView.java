/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.control.AlienControl;

/**
 *
 * @author sshipp57
 */
public class FightingAlienView extends View {

    public FightingAlienView(){
        super("\nThe Astronaut runs into the Alien!"
                + "\nThe Alien attacks you, What is the strength of the Aliens attack?");
    }
    
    @Override
    public boolean doAction(String FightingOption) {
        double alienAttack = Double.parseDouble(FightingOption);
        
        displayMessage = "What is your current life amount?";
        String lifeInput = getInput();
        double playerLife = Double.parseDouble(lifeInput);
        
        double playerLifeFinal = AlienControl.calcFigthingAlien(alienAttack, playerLife);
        
        if (playerLifeFinal < 0) {
            System.out.println("\nYou were damaged by the Alien");
            return false;
        } else {
            System.out.println("\nYou were not damaged by the Alien");
        }
        return true;
        
    }
    
}
