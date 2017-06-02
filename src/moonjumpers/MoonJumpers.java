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

        Player playerOne = new Player();

        playerOne.setName("Eddie Pincay");
        playerOne.setBestTime(10.00);

        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);

        Map location = new Map();

        location.setCurrentLocation("Jupiter");
        location.setAvailableLocations("Earth");

        String locationInfo = location.toString();
        System.out.println(location);

        Item moonBoots = new Item();

        moonBoots.setInventoryType("Footwear");
        moonBoots.setQuantityInStock(1.00);
        moonBoots.setRequiredAmount(1.00);

        String moonBootsInfo = moonBoots.toString();
        System.out.println(moonBoots);

        Question quiz = new Question();

        quiz.setQuestions("What is the sun?");
        quiz.setAnswers("A ball of fire");
        quiz.setCorrectAnswers("Yes");
        quiz.setEquations(2.00);

        String quizInfo = quiz.toString();
        System.out.println(quiz);

        Location celestial = new Location();

        celestial.setCelestialBodies("Saturn");
        celestial.setNextCelestialBody("Neptune");
        celestial.setVisited(Boolean.TRUE);
        celestial.setAmountRemaining(2.00);

        String celestialInfo = celestial.toString();
        System.out.println(celestial);

        Scene scene = new Scene();

        scene.setDescription("You must go to Neptune");
        scene.setTravelTime("02:00 hours");
        scene.setPlanetType("Gaseous giants");
        scene.setFuelAmount(15.00);
        scene.setDisplaySymbol("Np");

        String sceneInfo = scene.toString();
        System.out.println(scene);

        //display the actor test
        Actor actorOne = new Actor();

        actorOne.setName("Green Alien");
        actorOne.setDescription("Fights against the player on the planet Jupiter");
        actorOne.setCurrentLocation("Jupiter");

        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);

        //display the weapon test
        Weapon weaponOne = new Weapon();

        weaponOne.setName("Astro Blaster");
        weaponOne.setDescription("The astro blaster has maximum strength and will kill an alien in one hit");
        weaponOne.setStrength(20);

        String weaponInfo = weaponOne.toString();
        System.out.println(weaponInfo);

        //display the game test
        Game gameOne = new Game();

        gameOne.setTotalTime(10);
        gameOne.setNumberOfPeople(1);
        gameOne.setAttribute("You have visited Earth's Moon, Saturn, and the Sun");

        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
    }

}
