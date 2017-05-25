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
public class Game implements Serializable{
    
    //class instance variables
    private double totalTime;
    private double numberOfPeople;
    private String attribute;
    
    //defualt constructor
    public Game() {
    }
    
    //getters and setters
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(double numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    //equals and hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.numberOfPeople) ^ (Double.doubleToLongBits(this.numberOfPeople) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.attribute);
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numberOfPeople) != Double.doubleToLongBits(other.numberOfPeople)) {
            return false;
        }
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        return true;
    }
    
    //toString function

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", numberOfPeople=" + numberOfPeople + ", attribute=" + attribute + '}';
    }
    
    
}
