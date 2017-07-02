/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.exceptions;

/**
 *
 * @author mckenzietaggart
 */
public class TravelControlException extends Exception {

    public TravelControlException() {
    }

    public TravelControlException(String message) {
        super(message);
    }

    public TravelControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public TravelControlException(Throwable cause) {
        super(cause);
    }

    public TravelControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
