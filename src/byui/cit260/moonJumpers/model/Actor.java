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
 * @author mckenzietaggart
 */
public enum Actor implements Serializable {
    
    Player("The user who is playing the game."),
    GoodAlien("Players get along with the good aliens because they do not fight"
            + "the players."),
    BadAlien("Bad aliens fight the players of the game.");

    private final String description;
    private final String currentLocation;

    Actor (String description){
    this.description = description;
    currentLocation = new String("Pluto");
    }
    
    //getters and setters
    public String getDescription() {
        return description;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }
    
    //toString function
    @Override
    public String toString() {
        return "Actor{" + "description=" + description + ", currentLocation=" + currentLocation + '}';
    }
    
    
}
