/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.model.Game;
import byui.cit260.moonJumpers.model.Location;
import byui.cit260.moonJumpers.model.Map;
import moonjumpers.MoonJumpers;

/**
 *
 * @author sshipp57
 */
public class MapView {

    private void displayMap() {
        Game game = MoonJumpers.getCurrentGame();
        Map map = game.getMap();
        Location[] locations = map.getLocations();

        for (int i = 0; i < locations.length; i++) {
            System.out.println(
                    "Location " + locations[i].getName() + ": "
                    + locations[i].getScene().getDescription());

        }
    }
}
