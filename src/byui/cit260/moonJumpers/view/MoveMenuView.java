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
public class MoveMenuView {
    private String menu;

    public MoveMenuView() {
        this.menu ="\n"
                + "\n-------------------------------------"
                + "\n| Move Menu                         |"
                + "\n-------------------------------------\n"
                + "N - Move North\n"
                + "E - Move East\n"
                + "S - Move South\n"
                + "W - Move West\n"
                + "V - View Map\n"
                + "Q - Quit\n";
    }

    public void displayMoveMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }
            
            done = this.doAction(menuOption);

        } while (!done);
    }
    
     private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\nEnter a Move Menu Option" + this.menu);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }

            break;

        }

        return value;
    }
     
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