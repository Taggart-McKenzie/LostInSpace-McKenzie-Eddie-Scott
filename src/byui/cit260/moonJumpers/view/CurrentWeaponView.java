/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.control.AlienControl;
import byui.cit260.moonJumpers.exceptions.AlienControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eddie Pincay
 */
public class CurrentWeaponView extends View {
    public CurrentWeaponView() {
        super("\nWhat is the power of your current weapon?"
                + "\nSelect a number between 1-5?.");
    }

    @Override
    public boolean doAction(String weaponOption) {

        double weaponSelect = Double.parseDouble(weaponOption);

        displayMessage = "What is the attack power that you want between 1 - 20??";
        String userInput = getInput();
        double attackPower = Double.parseDouble(userInput);

        double result = 0;
        try {
            result = AlienControl.calcCurrentWeapon(weaponSelect, attackPower);
        } catch (AlienControlException ex) {
            Logger.getLogger(CurrentWeaponView.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (result < 0) {
            System.out.println("Sorry, Insert the corresponding values for the calculation..");
        } else {
            System.out.println("Your current weapon has an attack of " + result + " points");
        }
        return true;
    }
    
}
