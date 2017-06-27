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
public class Location {

    private String name;
    private Scene scene;

    public Location() {

    }

    public Location(String locationName) {
        name = locationName;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene locationScene) {
        scene = locationScene;
    }

    public String getName() {
        return name;
    }

}
