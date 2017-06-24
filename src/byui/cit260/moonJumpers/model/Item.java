/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.model;

import java.io.Serializable;

/**
 *
 * @author Eddie Pincay
 */
public enum Item implements Serializable {
    
    water("It is necessary to have energy on the planet"),
    metal("With this you can upgrade your ship."),
    lantern("This serves to illuminate dark places"),
    food("It is necessary to have energy"),
    fuel("Necesario para nuestra nave y para generar fuego."),
    spacecraft("It's necessary to travel between the planets.");
    
    private final String description;
    private final Double quantityInStock;
    private final Double requiredAmount;

    Item(String description) {
        this.description = description;
        quantityInStock = new Double("5");
        requiredAmount = new Double("2");
    }

    public String getDescription() {
        return description;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    @Override
    public String toString() {
        return "Items{" + "description=" + description + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
    }

  

 
 
}