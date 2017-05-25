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
 * @author sshipp57
 */
public class Map implements Serializable {
    
    private String currentLocation;
    private String availableLocations;

    public Map() {
    }
    
    

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getAvailableLocations() {
        return availableLocations;
    }

    public void setAvailableLocations(String availableLocations) {
        this.availableLocations = availableLocations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.currentLocation);
        hash = 79 * hash + Objects.hashCode(this.availableLocations);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        if (!Objects.equals(this.availableLocations, other.availableLocations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "currentLocation=" + currentLocation + ", availableLocations=" + availableLocations + '}';
    }
    
    
    
    
}