/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.control.AlienControl;
import java.util.Scanner;

/**
 *
 * @author sshipp57
 */
public class RunningAwayView extends View {

    private String runAway;

    public RunningAwayView() {
        super("\nThe astronaut accelerate away                        "
                + "\nfrom the monster from _ m/s");

    }

    
    @Override
    public boolean doAction(String runningAwayOption) {
        double finalVelocity = Double.parseDouble(runningAwayOption);

        this.runAway = "to _ m/s";
        String secondInput = this.getInput();
        double initialVelocity = Double.parseDouble(secondInput);

        this.runAway = "in _ seconds    "
                + "\nHow fast does the astronaut need to accelerate away from danger?";
        String thirdInput = this.getInput();
        double time = Double.parseDouble(thirdInput);

        double result = AlienControl.calcRunningAway(finalVelocity, initialVelocity, time);

        if (result < 0) {
            System.out.println("\nYou were caught by the alien");
            return false;
        } else {
            System.out.println("\nWow! You accelerated away from the alien"
                    + "\nfast enough. You are safe!");
        }

        return true;

    }

}
