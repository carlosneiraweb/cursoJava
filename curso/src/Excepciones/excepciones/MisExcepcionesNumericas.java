
package Excepciones.excepciones;

/**
 *
 * @author carlos
 */
public class MisExcepcionesNumericas {
   
    static class numeroCero extends Exception{

        public numeroCero(String message) {
            super(message);
        }
   
    }
    
    static class numeroDouble extends Exception{

        public numeroDouble(String message) {
            super(message);
        }
   
    }
    
    
    //fin mis excepciones
}
