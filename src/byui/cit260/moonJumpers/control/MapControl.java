/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.control;

import byui.cit260.moonJumpers.model.Location;
import byui.cit260.moonJumpers.model.Map;

/**
 *
 * @author mckenzietaggart
 */
public class MapControl {

    static Map createMap() {
        Map map = new Map();
        Location[] locations = new Location[25];

        locations[0] = new Location("Jupiter");
        locations[1] = new Location("Pluto");
        locations[2] = new Location("Neptune");
        locations[3] = new Location("Uranus");
        locations[4] = new Location("Saturn");
        locations[5] = new Location("RingsofSaturn");
        locations[6] = new Location("TitanMoon");
        locations[7] = new Location("HyperionMoon");
        locations[8] = new Location("LoMoon");
        locations[9] = new Location("EuropaMoon");
        locations[10] = new Location("GanymedeMoon");
        locations[11] = new Location("CallistroMoon");
        locations[12] = new Location("Mars");
        locations[13] = new Location("Ceres");
        locations[14] = new Location("EarthMoon");
        locations[15] = new Location("Earth");
        locations[16] = new Location("Venus");
        locations[17] = new Location("Mercury");
        locations[18] = new Location("Spaceship");
        locations[19] = new Location("BigDipper");
        locations[20] = new Location("LittleDipper");
        locations[21] = new Location("Aquarius");
        locations[22] = new Location("Aries");
        locations[23] = new Location("NorthStar");
        locations[24] = new Location("Sun");

        assignScenesToLocation(locations);
        return map;

    }

    static void moveActorToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignScenesToLocation(Location[] locations) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
