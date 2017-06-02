/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moonjumpers;

import byui.cit260.moonJumpers.model.Player;
import byui.cit260.moonJumpers.model.Item;
import byui.cit260.moonJumpers.model.Map;
import byui.cit260.moonJumpers.model.Question;
import byui.cit260.moonJumpers.model.Location;
import byui.cit260.moonJumpers.model.Scene;
import byui.cit260.moonJumpers.model.Actor;
import byui.cit260.moonJumpers.model.Game;
import byui.cit260.moonJumpers.model.Weapon;
import byui.cit260.moonJumpers.view.StartProgramView;

/**
 *
 * @author Eddie Pincay
 */
public class MoonJumpers {

    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MoonJumpers.currentGame = currentGame;
    }

    private static Player player = null;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MoonJumpers.player = player;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();

        
    }

}
