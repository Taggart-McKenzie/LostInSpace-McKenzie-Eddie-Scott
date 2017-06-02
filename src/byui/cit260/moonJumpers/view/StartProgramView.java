/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.control.GameControl;
import byui.cit260.moonJumpers.model.Player;
import java.util.Scanner;

/**
 *
 * @author sshipp57
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
    
        this.promptMessage = "\nPlease enter your name:";
        // display the banner when view is created
        this.displayBanner();
    
    }

    private void displayBanner() {
    
        System.out.println(
                "\n******************************************************************"
               +"\n* Lost in Space is a text-based role-playing game where the      *"
               +"\n* player of the game has found himself lost in space and         *"
               +"\n* must use the clues and resources provided to him as he         *"
               +"\n* navigates his way back to Earth safely. When he first awakens, *"
               +"\n* he finds himself on Neptune, the eighth and farthest           *"
               +"\n* known planet from the Sun in the Solar System. His journey     *"
               +"\n* home may include visits to Uranus, Saturn, Jupiter, Mars,      *"
               +"\n* Titan, or the Moon. Each location offers more clues and        *"
               +"\n* that will help him earn fuel for his spaceship acquire weapons *"
               +"\n* to fight off aliens, and ultimately find his way back to Earth *"
               +"\n*                                                                *"
               +"\n* The player awakens to find himself on an unfamiliar and barren *"
               +"\n* planet, with intense winds and no sign of life. As he looks up *"
               +"\n* to the night sky, he observes 14 distant moons, some larger    *"
               +"\n* than others. His spaceship has crashed and he has lost all     *"
               +"\n* communication with Earth. As he looks out the window, he notices*"
               +"\n* a shiny metal box next to the spaceship. With his spacesuit    *"
               +"\n* still intact, he opens the door of the spaceship and retrieves *"
               +"\n* the metal box. Secured safely within the box is a map which    *"
               +"\n* provides him with his first clue as he begins his journey back *"
               +"\n* to Earth.                                                      *"
               +"\n*                                                                *"
               +"\n* Knowing he is a long way from home, the player desperately     *"
               +"\n* wants to make it back to Earth safely. The goal of the game is *"
               +"\n* for the player to return to Earth safely by navigating his way *"
               +"\n* through space, fighting off dangerous alien creatures, and     *"
               +"\n* collecting helpful clues and resources as he stops at each of  *"
               +"\n* than others. His spaceship has crashed and he has lost all     *"
               +"\n* the destinations along the way. The player will need to find the*"
               +"\n* resources that will help him restore the spaceship, gather the *"
               +"\n* necessary fuel, acquire weapons to fight aliens, and eventually*"
               +"\n* land the spaceship safely back on Earth.                       *"
               +"\n*                                                                *"
               +"\n******************************************************************"
        );
    }

    public void displayStartProgramView() {
        
        boolean done = false;
        do {
            
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playersName);
        } while (!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
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

    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2){
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null){
            System.out.println("\nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n*** displayNextView() called ***");
    }
    
}
