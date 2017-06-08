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
public class TravelMenuView {

    private String menu;

    public TravelMenuView() {
        this.menu = "\n"
                + "\n-------------------------------------"
                + "\n| Where would you like to travel?   |"
                + "\n-------------------------------------"
                + "\n J - Jupiter                         "
                + "\n E - Europa                          "
                + "\n G - Ganymede                        "
                + "\n C - Callisto                        "
                + "\n Q - Quit                            ";
    }


    public void displayTravelMenuView() {
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
            System.out.println("\nEnter a Travel Menu Option" + this.menu);

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

    private boolean doAction(String choice) {
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    private void jupiter() {
        System.out.println("\n*** Welcome To The Planet Jupiter ***");
    }

    private void europa() {
        System.out.println("\n*** Welcome To The Moon Europa ***");
    }

    private void ganymede() {
        System.out.println("\n*** Welcome To The Moon Ganymede ***");

    }

    private void callisto() {
        System.out.println("\n*** Welcome To The Moon Callisto ***");

    }
}
