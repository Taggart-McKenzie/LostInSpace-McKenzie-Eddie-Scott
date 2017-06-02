/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.control;

import byui.cit260.moonJumpers.model.Player;

/**
 *
 * @author Eddie Pincay
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        System.out.println("\n*** createPlayer() function called ***");
        return new Player();
    }
    public void startNewGame(){
        
    }
    public boolean saveGame(double player, double weapon, double fuel, double location){
        return player > 0;
    }
    
}
