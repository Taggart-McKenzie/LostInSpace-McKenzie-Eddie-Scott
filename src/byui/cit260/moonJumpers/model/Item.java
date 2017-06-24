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
    
    Water("It is necessary to have energy on the planet"),
    Metal("With this you can upgrade your ship."),
    Lantern("This serves to illuminate dark places"),
    Food("It is necessary to have energy"),
    Fuel("Necesario para nuestra nave y para generar fuego."),
    Spacecraft("It's necessary to travel between the planets.");
    
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