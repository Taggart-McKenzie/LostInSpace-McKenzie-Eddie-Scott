/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.model;

import byui.cit260.moonJumpers.control.GameControl;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author sshipp57
 */
public class Map {

    private Location[] locations;

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

}
