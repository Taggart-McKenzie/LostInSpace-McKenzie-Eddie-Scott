/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.control.AlienControl;
import byui.cit260.moonJumpers.exceptions.AlienControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sshipp57
 */
public class RunningAwayView extends View {

    public RunningAwayView() {
        super("\nThe astronaut accelerate away                        "
                + "\nfrom the monster from _ m/s");

    }

    @Override
    public boolean doAction(String runningAwayOption) {
        double finalVelocity = Double.parseDouble(runningAwayOption);

        displayMessage = "to _ m/s";
        String secondInput = getInput();
        double initialVelocity = Double.parseDouble(secondInput);

        displayMessage = "in _ seconds    "
                + "\nHow fast does the astronaut need to accelerate away from danger?";
        String thirdInput = getInput();
        double time = Double.parseDouble(thirdInput);

        double result = 0;
        try {
            result = AlienControl.calcRunningAway(finalVelocity, initialVelocity, time);
        } catch (AlienControlException ex) {
            ErrorView.display(this.getClass().getName(), "Invaild Number");
            return false;
        }

        if (result < 0) {
            this.console.println("\nYou were caught by the alien");
            return false;
        } else {
            this.console.println("\nWow! You accelerated away from the alien"
                    + "\nfast enough. You are safe!");
        }

        return true;

    }

}
