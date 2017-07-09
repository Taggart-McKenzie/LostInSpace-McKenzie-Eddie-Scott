/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.control.GameControl;
import byui.cit260.moonJumpers.exceptions.GameControlException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import moonjumpers.MoonJumpers;

/**
 *
 * @author sshipp57
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n-------------------------------------"
                + "\n| Main Menu                         |"
                + "\n-------------------------------------"
                + "\n N - Start New Game                  "
                + "\n S - Save game                       "
                + "\n R - Restore Existing Game           "
                + "\n H - Get Help on How to Play the Game"
                + "\n P - Print Report                    "
                + "\n Q - Quit                            ");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "R":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "P":
        {
            try {
                this.printReport();
            } catch (GameControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(MoonJumpers.getPlayer());

        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
    }

    private void startExistingGame() {
        this.console.println("\n\nEnter the file path for the file where the game "
        + "is to be saved.");
        
        String filePath = this.getInput();
        
        try{
        GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
        
    }

    private void displayHelpMenu() {

        HelpMenuView helpMenuView = new HelpMenuView();

        helpMenuView.display();
    }
    

    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where the game "
                + "is to be saved.");
        String filePath = this.getInput();

        try {

            GameControl.saveGame(MoonJumpers.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
     private void printReport() throws GameControlException {
        String filePath = null;
        boolean valid = false;

        this.console.println("Enter the name you want to save your List: ");
        while (!valid) {
            try {
                //prompt for player input

                filePath = this.keyboard.readLine();
                filePath = filePath.trim();

                if (filePath.length() < 1) {
                    ErrorView.display(this.getClass().getName(),
                            "\n***Invalid: entry required.!");
                } else {
                    valid = true;
                }

            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                throw new GameControlException(ex.getMessage());
            }
        }

        try {
            //save inventory list to specified file
            WriteItemList.writeItemList(MoonJumpers.getPlayer().getItemList(), filePath);
            this.console.println("\nItem List successfully written to file " + filePath + ".");
        } catch (IOException ioe) {
            ErrorView.display("MainMenuView", ioe.getMessage());

        }
    }
    

    
}
