/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.control.GameControl;
import java.util.Scanner;
import moonjumpers.MoonJumpers;

/**
 *
 * @author sshipp57
 */
public class MainMenuView extends View {

    public MainMenuView(){
        super(  "\n"
                + "\n-------------------------------------"
                + "\n| Main Menu                         |"
                + "\n-------------------------------------"
                + "\n N - Start New Game                  "
                + "\n R - Restore Existing Game           "
                + "\n H - Get Help on How to Play the Game"
                + "\n Q - Quit                            ");
    }
    
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "R":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    private void startNewGame() {
        //create a new game
        //GameControl.createNewGame(MoonJumpers.getPlayer());

        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called***");
    }

    private void displayHelpMenu() {

        HelpMenuView helpMenuView = new HelpMenuView();

        helpMenuView.display();
    }
}
