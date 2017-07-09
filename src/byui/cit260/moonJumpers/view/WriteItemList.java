/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import moonjumpers.MoonJumpers;
/**
 *
 * @author sshipp57
 */
public class WriteItemList extends View {
    public static void writeItemList(ArrayList<String> itemList, String filepath) 
            throws IOException {

        try (PrintWriter output = new PrintWriter(filepath)) {
            //write header
            String header = "You have collected the following Items:";
            output.println(header);
            //if itemList is not empty, write each item on a new line
            if (itemList.isEmpty()) {
              //do nothing
            } else {   //write list
                for (String item : MoonJumpers.getPlayer().getItemList()) {
                    output.println(item);
                }
            }
            output.flush();
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override
    public boolean doAction(String value) {
        return false;
    }
}
