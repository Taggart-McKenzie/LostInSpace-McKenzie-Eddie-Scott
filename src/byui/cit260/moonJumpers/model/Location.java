/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Eddie Pincay
 */
public enum Location implements Serializable{
    
    Pluto("You have arrived on Pluto"), 
    Neptune("You have arrived on Neptune"),
    Uranus("You have arrived on Uranus"),
    Saturn("You have arrived on Saturn"),
    RingsofSaturn("You have arrived on the Rings of Saturn"),
    TitanMoon("You have arrived on Titan, a moon near Saturn"),
    HyperionMoon("You have arrived on Hyperion, a moon near Saturn"),
    Jupiter("You have arrived on Jupiter"),
    LoMoon("You have arrived at Lo, one of Jupiter's Moons"),
    EuropaMoon("You have arrived at Europa, one of Jupiter's Moons"),
    GanymedeMoon("You have arrived at Ganymede, one of Jupiter's Moons"),
    CallistroMoon("You have arrived at Callistro, one of Jupiter's Moons."),
    Mars("You have arrived on Mars"),
    Ceres("You have arrived on Ceres, a large mass in the astroid belt"),
    EarthMoon("You have arrived on Earth's Moon"),
    Earth("You have made it to Earth! You have completed a successful mission."),
    Venus("You have arrived to Venus"),
    Mercury("You have arrived on Mercury"),
    Spaceship("You are in the spaceship traveling to your next destination"),
    BigDipper("You have reached the Big Dipper"),
    LittleDipper("You have reached the Little Dipper"),
    Aquarius("You have reached Aquarius Constellation"),
    Aries("You have reached the constellation Aries"),
    NorthStar("You have found the North Star"),
    Sun("You have arrived on the Sun");
    
    // class instance variables
    //private String celestialBodies;
    private final String nextCelestialBody;
    private final Boolean visited;
    private double amountRemaining = 25;

    Location(String nextCelestialBody) {
        this.nextCelestialBody = nextCelestialBody;
        visited = true;
    }

    @Override
    public String toString() {
        return "Location{" + "nextCelestialBody=" + nextCelestialBody + ", visited=" + visited + ", amountRemaining=" + amountRemaining + '}';
    }

    public String getNextCelestialBody() {
        return nextCelestialBody;
    }

    public Boolean getVisited() {
        return visited;
    }

    public double getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }
    
    
}
