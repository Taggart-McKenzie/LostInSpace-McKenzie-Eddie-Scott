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
public abstract class Scene {

    private String description;

    public Scene(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
