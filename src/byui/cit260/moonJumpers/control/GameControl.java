/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.control;

import byui.cit260.moonJumpers.model.Actor;
import byui.cit260.moonJumpers.model.Game;
import byui.cit260.moonJumpers.model.Item;
import byui.cit260.moonJumpers.model.Map;
import byui.cit260.moonJumpers.model.Player;
import byui.cit260.moonJumpers.model.Weapon;
import moonjumpers.MoonJumpers;

/**
 *
 * @author Eddie Pincay
 */
public class GameControl {

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        MoonJumpers.setPlayer(player);

        return player;
    }

    public static void createNewGame(Player player) {
        
        Game game = new Game();//create new game
        MoonJumpers.setCurrentGame(game);//save in Moon Jumpers
        
        game.setPlayer(player);//save player in game
        
        //create the item list and save in the game
        Item[] itemList = GameControl.createItemList();
        game.setInventory(itemList);
        
        Weapon weapon = new Weapon();
        game.setWeapon(weapon);
        
        Actor actor = new Actor();
        game.setActor(Actor.Player);
      
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorToStartingLocation(map);
        
        
        
        
        
        
    }

    private static Item[] createItemList() {
        System.out.println("***called createItemList() in GameControl***");
        return null;
    }
}
