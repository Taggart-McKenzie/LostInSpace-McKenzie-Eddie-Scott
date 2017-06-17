/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.control.AlienControl;

/**
 *
 * @author mckenzietaggart
 */
public class FightAlienView extends View {

    public FightAlienView() {
        super("\nWill the astronaut beat the alien?"
                + "\nSolve the problem to find out."
                + "\nWhat is the alien attack strength on a scale of 1-5?.");
    }

    @Override
    public boolean doAction(String fightOption) {

        double alienAttack = Double.parseDouble(fightOption);

        displayMessage = "What is the player's life?";
        String lifeSpan = getInput();
        double playerLife = Double.parseDouble(lifeSpan);

        displayMessage = "Calculate the solution to the problem:"
                + "\n(alienAttack - playerLife) = ";
        String solution = this.getInput();
        double battle = Double.parseDouble(solution);

        double result = AlienControl.calcFightingAlien(alienAttack, playerLife);

        if (result > 0) {
            System.out.println("Sorry, the alien won the battle.");
        } else {
            System.out.println("Good job, you beat the alien! Here is a new weapon.");
            //add weapon to ItemControl
        }
        return true;
    }

}
