/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import java.util.Scanner;

/**
 *
 * @author sshipp57
 */
public class HelpMenuView extends View {

        public HelpMenuView() {
        super("\n"
                + "\n-------------------------------------"
                + "\n| Help Menu                         |"
                + "\n-------------------------------------"
                + "\n G - What is the goal of the game?   "
                + "\n M - How to Move                     "
                + "\n F - View Fuel Percentage            "
                + "\n T - Travel Menu                     "
                + "\n R - Running Away from the Alien     "
                + "\n Q - Quit                            ");
    }

    
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "G":
                this.goalGame();
                break;
            case "M":
                this.howMove();
                break;
            case "F":
                this.fuelPercentage();
                break;
            case "T":
                this.travelMenu();
            case "R":
                this.runAway();
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    private void goalGame() {
        System.out.println("\n*** Calls goalGame() function ***");
    }

    private void howMove() {
        MoveMenuView moveMenuView = new MoveMenuView();

        moveMenuView.displayMoveMenuView();
    }

    private void fuelPercentage() {
        FuelPercentageView fuelPercentageView = new FuelPercentageView();
        
        fuelPercentageView.displayFuelPercentageView();
    }

    private void travelMenu() {
        TravelMenuView travelMenuView = new TravelMenuView();

        travelMenuView.displayTravelMenuView();
    }

    private void runAway() {
        RunningAwayView runningAwayView = new RunningAwayView();
        
        runningAwayView.displayRunningAwayView();
    }

}
