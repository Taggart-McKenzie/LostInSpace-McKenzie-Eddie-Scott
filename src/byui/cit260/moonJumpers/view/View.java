/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import moonjumpers.MoonJumpers;

/**
 *
 * @author sshipp57
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = MoonJumpers.getInFile();
    protected final PrintWriter console = MoonJumpers.getOutFile();
    
    public View() {
    }
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean done = false;
        do {

            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(value);

        } while (!done);
    }
    
    @Override
    public String getInput(){
        
        boolean valid = false;
        String value = "";
        try {
            
        while (!valid) {
            //get the value entered from the keyboard
            this.console.println(this.displayMessage);

            value = this.keyboard.readLine();
            value = value.trim();

            if (value.length() < 1) {
                ErrorView.display(this.getClass().getName(), "\nInvalid value: value cannot be blank");
                continue;
            }

            break;
        }
        } catch (Exception te) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + te.getMessage());
        }

        return value;
    }
}
