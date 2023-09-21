/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ejemplo;

/**
 *
 * @author carlos
 */
public class ClaseA implements Constantes,MiInterfaz {
    
    
    double dDato;
  
	// Define las versiones de put() y get() que utiliza la ClaseA
    public void put( int dato ) {
		// Se usa "pi" del interfaz Constantes
        dDato = (double)dato * PI;
        System.out.println(
            "En put() de ClaseA, usando pi del interfaz Constantes: " 
			+ dDato );
        }
  
    public int get() {
        return( (int)dDato );
        }
  
	// Se define un metodo show() para la ClaseA que no esta declarado
	// en el interfaz MiInterfaz
    void show() {
        System.out.println(
			"En show() de ClaseA, dDato = " + dDato );
        }
    
    
    
    
}
