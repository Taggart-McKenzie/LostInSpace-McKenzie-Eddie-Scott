/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import java.util.Scanner;

/**
 *
 * @author Eddie Pincay
 */
public class MoveMenuView extends View {
    private String menu;

    public MoveMenuView() {
        super("\n"
                + "\n-------------------------------------"
                + "\n| Move Menu                         |"
                + "\n-------------------------------------\n"
                + "N - Move North\n"
                + "E - Move East\n"
                + "S - Move South\n"
                + "W - Move West\n"
                + "V - View Map\n"
                + "Q - Quit\n");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.moveNorth();
                break;
            case "E":
                this.moveEast();
                break;
            case "S":
                this.moveSouth();
                break;
            case "W":
                this.moveWest();
                break;
            case "V":
                this.viewMap();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void moveNorth() {
        System.out.println("\n*** Move to North ***");
    }

    private void moveEast() {
        System.out.println("\n*** Move to East ***");
    }

    private void moveWest() {
        System.out.println("\n*** Move to West ***");
    }

    private void viewMap() {
        System.out.println("\n*** View a Map ***");
    }

    private void moveSouth() {
        System.out.println("\n*** Move to South ***");
    }

}