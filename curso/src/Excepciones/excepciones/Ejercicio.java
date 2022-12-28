
package Excepciones.excepciones;

import java.util.Scanner;
import Excepciones.excepciones.*;
/**
 *
 * @author carlos
 */
public class Ejercicio {
   
    static Scanner sc = new Scanner(System.in);
    
    public void introducirMayorCero() throws MisExcepcionesNumericas.numeroCero{
    
        int num;
        
        try {
                
            System.out.println("Introduce el número 0");
            num = sc.nextInt(); 
            if(num < 0)
            throw new MisExcepcionesNumericas.numeroCero("El número introducido es menor a 0");
        } catch (MisExcepcionesNumericas.numeroCero e) {
           System.out.println(e.getMessage());
        }
}       


        
        
      
       
    
}
