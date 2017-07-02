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
                + "\n P - View Fuel Percentage            "
                + "\n T - Travel Menu                     "
                + "\n R - Running Away from the Alien     "
                + "\n F - Fight the Alien                 "
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
            case "P":
                this.fuelPercentage();
                break;
            case "T":
                this.travelMenu();
                break;
            case "R":
                this.runAway();
                break;
            case "F":
                this.fightAlien();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    private void goalGame() {
        System.out.println("The goal is to return to Earth safely by navigating"
                + " your way through space, fighting off dangerous alien creatures,"
                + " and collecting resources to help you along the way.");
    }

    private void howMove() {
        MoveMenuView moveMenuView = new MoveMenuView();

        moveMenuView.display();
    }

    private void fuelPercentage() {
        FuelPercentageView fuelPercentageView = new FuelPercentageView();
        
        fuelPercentageView.display();
    }

    private void travelMenu() {
        TravelMenuView travelMenuView = new TravelMenuView();

        travelMenuView.display();
    }

    private void runAway() {
        RunningAwayView runningAwayView = new RunningAwayView();
        
        runningAwayView.display();
    }

    private void fightAlien() {
        FightAlienView fightAlienView = new FightAlienView();
        
        fightAlienView.display();
    }

}
