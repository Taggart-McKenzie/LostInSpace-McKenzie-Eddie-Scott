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
public class Location implements Serializable{
    
    // class instance variables
    private String celestialBodies;
    private String nextCelestialBody;
    private Boolean visited;
    private double amountRemaining;

    public Location() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.celestialBodies);
        hash = 83 * hash + Objects.hashCode(this.nextCelestialBody);
        hash = 83 * hash + Objects.hashCode(this.visited);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.amountRemaining) ^ (Double.doubleToLongBits(this.amountRemaining) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.amountRemaining) != Double.doubleToLongBits(other.amountRemaining)) {
            return false;
        }
        if (!Objects.equals(this.celestialBodies, other.celestialBodies)) {
            return false;
        }
        if (!Objects.equals(this.nextCelestialBody, other.nextCelestialBody)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "celestialBodies=" + celestialBodies + ", nextCelestialBody=" + nextCelestialBody + ", visited=" + visited + ", amountRemaining=" + amountRemaining + '}';
    }

    
    
    public String getCelestialBodies() {
        return celestialBodies;
    }

    public void setCelestialBodies(String celestialBodies) {
        this.celestialBodies = celestialBodies;
    }

    public String getNextCelestialBody() {
        return nextCelestialBody;
    }

    public void setNextCelestialBody(String nextCelestialBody) {
        this.nextCelestialBody = nextCelestialBody;
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public double getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }
    
    
}
