/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moonjumpers;

import byui.cit260.moonJumpers.model.Player;
import byui.cit260.moonJumpers.model.Item;
import byui.cit260.moonJumpers.model.Map;
import byui.cit260.moonJumpers.model.Question;
import byui.cit260.moonJumpers.model.Location;
import byui.cit260.moonJumpers.model.Scene;
import byui.cit260.moonJumpers.model.Actor;
import byui.cit260.moonJumpers.model.Game;
import byui.cit260.moonJumpers.model.Weapon;
import byui.cit260.moonJumpers.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eddie Pincay
 */
public class MoonJumpers {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    
    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        try {
            //open character stream files for end user input and output
            MoonJumpers.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            MoonJumpers.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            MoonJumpers.logFile = new PrintWriter(filePath);
            
            //create StartProgramView and start the program
            startProgramView.display();
            
        } catch (Throwable te) {
            System.out.println("Exception: " + te.toString() +
                               "\nCause: " + te.getCause() +
                               "\nMessage: " + te.getMessage());
            te.printStackTrace();
            //System.out.println(te.getMessage());
            //te.printStackTrace();
            //startProgramView.display();
        }
        finally {
            try {
                if (MoonJumpers.inFile != null)
                    MoonJumpers.inFile.close();
                if (MoonJumpers.outFile != null)
                    MoonJumpers.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }

        }
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MoonJumpers.currentGame = currentGame;
    }
    
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MoonJumpers.player = player;
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        MoonJumpers.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        MoonJumpers.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        MoonJumpers.logFile = logFile;
    }
}
