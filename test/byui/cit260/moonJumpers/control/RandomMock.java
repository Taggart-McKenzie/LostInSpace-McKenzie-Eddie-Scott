/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.control;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * This class overrides java.util.Random in order to provide a
 * random number generator that can be used predictably in 
 * unit tests.
 * 
 * Seeds won't matter for this class, since we're producing
 * our own provided set of random numbers.
 * 
 * @author kanderson
 */
public class RandomMock extends Random {
 
    // This collection of integers holds the random number sources
    // we want to use.
    private final List<Double> nextSequence;
    
    // This index keeps track of where we are in the list of values
    // provided.
    private int nextIndex;
    
    /**
     * Constructor. The constructor accepts a variable size list of integers
     * to be used in the random number calculations. 
     * @param sequence 
     */
    public RandomMock(double... sequence) {
        nextSequence = new ArrayList<>();
        setSequence(sequence);
    }
    
    /**
     * Replace the sequence of numbers used with a new sequence of numbers.
     * @param sequence 
     */
    public final void setSequence(double... sequence) {
        // Clean out any previous values.
        nextSequence.clear();
        
        // Add the new values to sequence.
        for (double i : sequence){
            nextSequence.add(i);
        }
        
        nextIndex = 0;
    }
    
    /**
     * Provide the next value in the sequence.
     * @param bits
     * @return 
     */
    private double nextInSequence(){
        
        // Return 0 if we have not been provided with 
        // anything.
        if (nextSequence.isEmpty()){
            return 0;
        }
        
        // Get the next item in the list.
        double nextValue = nextSequence.get(nextIndex);
        
        // Increment our counter so we get the next item in the list
        // the next time we're are called. Check to make sure we
        // wrap back to the first element when we've used all the
        // supplied numbers.
        nextIndex++;
        
        if (nextIndex >= nextSequence.size()){
            nextIndex = 0;
        }
        
        return nextValue;
    }
    
    /**
     * Override the boolean method.
     * @return 
     */
    @Override
    public boolean nextBoolean(){
        return ((int)nextInSequence()) % 2 != 0;
    }
    
    /**
     * Override the double method.
     * @return 
     */
    @Override
    public double nextDouble(){
        return nextInSequence();
    }
    
    /**
     * Override the float method.
     * @return 
     */
    @Override
    public float nextFloat(){
        return (float)nextInSequence();
    }
    
    /**
     * Override the int method.
     * @return 
     */
    @Override
    public int nextInt(){
        return (int)nextInSequence();
    }
    
    /**
     * Override the bounded int method.
     * @return 
     */
    @Override
    public int nextInt(int bound){
        return (int)nextInSequence();
    }
    
    
    /**
     * Override the long method.
     * @return 
     */
    @Override
    public long nextLong(){
        return (long)nextInSequence();
    }  
}
