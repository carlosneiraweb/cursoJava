/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ejemplo;

/**
 *
 * @author carlos
 */
public class ClaseB implements Constantes,MiInterfaz{
    
    
    int dDato;
  
	// Define las versiones de put() y get() que utiliza la ClaseB
    public void put( int dato ) {
		// Se usa "constanteInt" del interfaz Constantes
        dDato = dato * CONSTANTE_INT;
        System.out.println(
            "En put() de ClaseB, usando constanteInt del interfaz Constantes: " 
            + dDato );
        }
  
    public int get() {
        return( dDato );
        }
    
    
    
    
    
    //fin ClaseB
}
