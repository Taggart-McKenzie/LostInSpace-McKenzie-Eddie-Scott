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
import byui.cit260.moonJumpers.model.Scene;
import byui.cit260.moonJumpers.model.Weapon;
import moonjumpers.MoonJumpers;

/**
 *
 * @author Eddie Pincay
 */
public class GameControl {

    private static Weapon[] createWeaponList;

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        MoonJumpers.setPlayer(player);

        return player;
    }
    public static void createMap(Game game){
        Map map = MapControl.createMap();
        game.setMap(map); 
    
    }
    public static void createNewGame(Player player) {

        Game game = new Game();//create new game
        MoonJumpers.setCurrentGame(game);//save in Moon Jumpers

        game.setPlayer(player);//save player in game

        //create the item list and save in the game
        Item[] itemList = GameControl.createItemList();
        game.setInventory(itemList);

        Weapon[] weaponList = GameControl.createWeaponList();
        game.setWeapon(weaponList);

        Actor actor;
        game.setActor(Actor.Player);

        Map map = MapControl.createMap();
        game.setMap(map);

        MapControl.moveActorToStartingLocation(map);

    }

    private static Item[] createItemList() {
        Item[] inventory = new Item[6];

        Item water = null;
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[Item.water.ordinal()] = water;

        Item metal = null;
        metal.setDescription("Metal");
        metal.setQuantityInStock(0);
        metal.setRequiredAmount(0);
        inventory[Item.metal.ordinal()] = metal;

        Item lantern = null;
        lantern.setDescription("Lantern");
        lantern.setQuantityInStock(0);
        lantern.setRequiredAmount(0);
        inventory[Item.lantern.ordinal()] = lantern;

        Item food = null;
        food.setDescription("Food");
        food.setQuantityInStock(0);
        food.setRequiredAmount(0);
        inventory[Item.food.ordinal()] = food;

        Item fuel = null;
        fuel.setDescription("Fuel");
        fuel.setQuantityInStock(0);
        fuel.setRequiredAmount(0);
        inventory[Item.fuel.ordinal()] = fuel;

        Item spacecraft = null;
        spacecraft.setDescription("Spacecraft");
        spacecraft.setQuantityInStock(0);
        spacecraft.setRequiredAmount(0);
        inventory[Item.spacecraft.ordinal()] = spacecraft;

        return inventory;
    }

    private static Weapon[] createWeaponList() {

        Weapon[] weapons = new Weapon[5];

        Weapon stir = null;
        stir.setDescription("Stir");
        stir.setStrength(0);
        weapons[Weapon.stir.ordinal()] = stir;

        Weapon magneticweapon = null;
        magneticweapon.setDescription("Magnetic Weapon");
        magneticweapon.setStrength(0);
        weapons[Weapon.magneticweapon.ordinal()] = magneticweapon;

        Weapon healingsolution = null;
        healingsolution.setDescription("Healing Solution");
        healingsolution.setStrength(0);
        weapons[Weapon.healingsolution.ordinal()] = healingsolution;

        Weapon knife = null;
        knife.setDescription("Knife");
        knife.setStrength(0);
        weapons[Weapon.knife.ordinal()] = knife;

        Weapon homepump = null;
        homepump.setDescription("Home Pump");
        homepump.setStrength(0);
        weapons[Weapon.homepump.ordinal()] = homepump;

        return weapons;
    }

    public static void assignScenesToLocation(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
