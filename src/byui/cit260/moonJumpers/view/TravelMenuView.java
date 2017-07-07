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
public class TravelMenuView extends View{

    public TravelMenuView() {
        super( "\n"
                + "\n-------------------------------------"
                + "\n| Where would you like to travel?   |"
                + "\n-------------------------------------"
                + "\n J - Jupiter                         "
                + "\n E - Europa                          "
                + "\n G - Ganymede                        "
                + "\n C - Callisto                        "
                + "\n Q - Quit                            ");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();

        switch (choice) {
            case "J":
                this.jupiter();
                break;
            case "E":
                this.europa();
                break;
            case "G":
                this.ganymede();
                break;
            case "C":
                this.callisto();
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    private void jupiter() {
        this.console.println("\n*** Welcome To The Planet Jupiter ***");
    }

    private void europa() {
        this.console.println("\n*** Welcome To The Moon Europa ***");
    }

    private void ganymede() {
        this.console.println("\n*** Welcome To The Moon Ganymede ***");

    }

    private void callisto() {
        this.console.println("\n*** Welcome To The Moon Callisto ***");

    }
}
