
package Excepciones.excepciones.Clase;

import java.util.Scanner;
import Excepciones.excepciones.Propias.*;
import java.util.InputMismatchException;
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
            throw new MisExcepcionesNumericas.numeroCero(num);
        } catch (MisExcepcionesNumericas.numeroCero e) {
           System.out.println(e.getMessage());
        } catch(InputMismatchException e){
            System.out.println("El dato introducido no es un número"+e.getMessage());
        }
        
        
    }       


    public void leerNumeroEnteroMayor5()throws MisExcepcionesNumericas.leerEnteroMayor5{
        
    boolean test = true;   
    int n;
    
        try {
            
                     

                System.out.println("Introduce un número menor a 5 que sea un entero");
                n = sc.nextInt();
                
                if(n > 5)
               throw new MisExcepcionesNumericas.leerEnteroMayor5("EL número introducido es mayor a 5");

        } catch (MisExcepcionesNumericas.leerEnteroMayor5 e) {
                             
            
            //System.out.println(e.getCause());
            System.out.println(e.getMessage());
            
        } 
    }   
        
      
    public void leerNumeroDouble(){
      
        double d = 0;
        
        try{ 
            
            System.out.println("Introduce un número double");
            d = sc.nextDouble();
            
        }catch(InputMismatchException e){
           
            System.out.println("El dato introducido no es númerico");
        
        
        }
    }
    
    
    
//fin Ejercicio    
}
