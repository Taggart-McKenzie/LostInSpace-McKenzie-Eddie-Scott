/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.control;
import byui.cit260.moonJumpers.model.Item;
import byui.cit260.moonJumpers.enums.ItemType;
import byui.cit260.moonJumpers.exceptions.ItemControlException;
import java.util.ArrayList;

/**
 *
 * @author mckenzietaggart
 */
public class ItemControl {
    public int checkInventory(ArrayList<Item> inventory, ItemType itemType) 
            throws ItemControlException {

        int found = -1;
        //for each loop
        for (Item item : inventory) {
            //check for position of item in the list
            if (item.getItemType() == itemType) {
                found = inventory.indexOf(item);  //index of item in the list
            }
        }
        
        if (found != -1) {
            return found;
        }
        else {    //if no such item found
            throw new ItemControlException("Item not found in inventory.");
        }
        
    }   
}
