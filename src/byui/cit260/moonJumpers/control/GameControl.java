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
        Item[] inventory = new Item[6];
        
        Item water = new Item();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[Item.water.ordinal()] = water;
        
        Item metal = new Item();
        metal.setDescription("Metal");
        metal.setQuantityInStock(0);
        metal.setRequiredAmount(0);
        inventory[Item.metal.ordinal()] = metal;
        
        Item lantern = new Item();
        lantern.setDescription("Lantern");
        lantern.setQuantityInStock(0);
        lantern.setRequiredAmount(0);
        inventory[Item.lantern.ordinal()] = lantern;
        
        Item food = new Item();
        food.setDescription("Food");
        food.setQuantityInStock(0);
        food.setRequiredAmount(0);
        inventory[Item.food.ordinal()] = food;
        
        Item fuel = new Item();
        fuel.setDescription("Fuel");
        fuel.setQuantityInStock(0);
        fuel.setRequiredAmount(0);
        inventory[Item.fuel.ordinal()] = fuel;
        
        Item spacecraft = new Item();
        spacecraft.setDescription("Spacecraft");
        spacecraft.setQuantityInStock(0);
        spacecraft.setRequiredAmount(0);
        inventory[Item.spacecraft.ordinal()] = spacecraft;
        
        
        
        return inventory;
    }
}
