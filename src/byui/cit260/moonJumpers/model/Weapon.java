/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.model;

import java.io.Serializable;

/**
 *
 * @author mckenzietaggart
 */
public enum Weapon implements Serializable {
    
    stir("You have 3 shots to use them. Less 20 points"),
    magneticweapon("It is damaged after 5 attempts. Less 15 points"),
    healingsolution("You have a chance to heal 50% of the total life and you have 2 times."),
    knife("You can lower only 10 points per attack."),
    homepump("Destroy a question");
    
    private final String description;
    private final double strength;
    
    Weapon(String description) {
        this.description = description;
        strength = new Double("10");
    }
    
    public String getDescription() {
        return description;
    }

    public double getStrength() {
        return strength;
    }

    //toString function

    @Override
    public String toString() {
        return "Weapon{" + "description=" + description + ", strength=" + strength + '}';
    }
    
}
