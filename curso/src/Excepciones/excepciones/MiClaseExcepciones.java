/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones.excepciones;
import java.util.Scanner;

import java.util.InputMismatchException;

/**
 *
 * @author carlos
 */
public class MiClaseExcepciones  {
 
 // private Scanner sc;
static  Scanner sc = new Scanner(System.in);

  /*
   public  MiClaseExcepciones(){
      this.sc = new Scanner(System.in); 
   }
   */
  
  
    
    public  int leerEntero() {
    boolean repetir;
    int n = 0; 
    
        do {
        repetir = false;
                
            try {
                System.out.println("Introduce un número enterto");
                
                n = sc.nextInt();
                
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido");
                repetir = true;
                sc.nextLine();
            }
        } while (repetir);
        
        return n;
        }
    
    
    
    
    public double leerDouble() {
        boolean r= false;
        double n = 0;
        
        do {

            
            try {
                
                System.out.println("Introduce un número double");
                n = sc.nextDouble();
                
            } catch (InputMismatchException e) {
                System.out.println("El número introducido no es double"+n);
                r = true;
            }finally {
                sc.nextLine();
            }
            
        } while (r);           
        
        return n;
    }
    
    
    
   
    
    
    
    
    
    
    //MiClaseExcepciones   
}
