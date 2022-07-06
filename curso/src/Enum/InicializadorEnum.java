/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author carlos
 */
public class InicializadorEnum {
    
    public static void main(String[] args) {
        
      Precio precio = Precio.BARATO;
      String pre = precio.toString();
      Precio total = Precio.valueOf("BARATO");
      System.out.println(pre+ " "+total);
      System.out.println(precio.ordinal());
      precio.toString();
      
      System.out.println ("un precio " + precio + " esta entre " + 
      precio.getPrecioMinimo() + " y " + precio.getPrecioMaximo());
    
    Futbolista casillas = new Futbolista("Casillas", 1, Demarcacion.PORTERO, Equipo.REAL_MADRID);
    Futbolista capdevila = new Futbolista("Capdevila", 11, Demarcacion.DEFENSA, Equipo.VILLAREAL);
    System.out.println(casillas.toString());
    System.out.println(capdevila.toString());
    }
}
