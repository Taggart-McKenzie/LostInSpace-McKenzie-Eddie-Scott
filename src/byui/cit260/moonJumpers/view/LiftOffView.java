/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.view;

import byui.cit260.moonJumpers.control.LocationControl;
import java.util.Scanner;

/**
 *
 * @author mckenzietaggart
 */
class LiftOffView {
    
    private String lift;
    
    public void displayLiftOffView() {
    
        boolean done = false;//set flag to not done
            do{
                //prompt for and get input value
            String liftOffOption = this.getLiftOffOption();
            if (liftOffOption.toUpperCase().equals("Q"))//user wants to quit 
                return;//exit the game
            
            //do the action and display the next view
            done = this.doAction(liftOffOption);
            } while (!done);
            
        //prompt the end user for input values
        //read in the values entered
        //check to see if the value is invalid (if statement)
        //call function to perform the action and display next view
        //while statement
        //two string functions

    }
    
    private String getLiftOffOption(){
        Scanner keyboard = new Scanner(System.in);//get input from keyboard
        String value = "";//value to be returned
        boolean valid = false;//initialize to not valid

        while (!valid) {//loop while an invalid value is entered
            System.out.println("\n" + this.lift);

            value = keyboard.nextLine();//get next line typed from keyboard
            value = value.trim();//trim excess blanks

            if (value.length() < 1) {//value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;//end the loop
        }
        return value;//return the value entered
    }

    private boolean doAction(String liftOffOption) {

         this.lift = "How much fuel do you need to travel to the next destination?";
         String fuel = this.getLiftOffOption();
         double fuelAmount = Double.parseDouble(fuel);
         
        this.lift = "How many miles away is your next destination?";
        String farAway = this.getLiftOffOption();
        double miles = Double.parseDouble(farAway);
        
        System.out.println("LIFT_OFF value = 10");
        
        this.lift = "Calculate the solution to the problem:"
                     + "\n(fuelAmount * miles)/LIFT_OFF = liftOff";
        String solution = this.getLiftOffOption();
        double liftOff = Double.parseDouble(solution);
        
        double result = LocationControl.calcLiftOff(fuelAmount, miles);
        
        if (liftOff == result){
            System.out.println("Sucessful lift off!");
        }
        else{
            System.out.println("Invalid, unsuccessful lift off. Try again.");
        }
        return true;
    }
   
}
