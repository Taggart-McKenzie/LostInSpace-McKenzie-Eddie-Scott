/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.exceptions;

/**
 *
 * @author sshipp57
 */
public class AlienControlException extends Exception {

    public AlienControlException() {
    }

    public AlienControlException(String message) {
        super(message);
    }

    public AlienControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public AlienControlException(Throwable cause) {
        super(cause);
    }

    public AlienControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
