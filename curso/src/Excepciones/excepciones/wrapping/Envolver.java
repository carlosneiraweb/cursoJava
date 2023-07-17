//https://jenkov.com/tutorials/java-exception-handling/exception-wrapping.html
package Excepciones.excepciones.wrapping;

import Excepciones.excepciones.Propias.MisExcepcionesNumericas.*;


public class Envolver {
    
    
    
    
    /**
     * In this way, our IllegalArgumentException 
     * instance wraps the original NullPointerException as a cause. 
     * Hence we can show the more specific exception instead of showing the generic one.
     * @return boolean
     */
    public boolean envuelveNull(){
        
        String name = null;

            try {
                return name.equals("Joe"); // causes NullPointerException
            } catch (Exception e) {
                // log
                throw new IllegalArgumentException(e);
            }
        
    }
    
}