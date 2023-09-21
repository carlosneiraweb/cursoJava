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

   
  public  enum Precio {
    BARATO(0, 10),
    CARO(100, 1000), 
    MEDIO(10, 100);
   

    private int precioMinimo;
    private int precioMaximo;

    //Constructor privado
    //No se pueden crear nuevos objetos
    //Pero es necesario para asignar el valor 
    //a la enum aunque ya tenga el valor asignado
    private Precio(int minimo, int maximo) {
        precioMinimo = minimo;
        precioMaximo = maximo;
    }

    public int getPrecioMaximo() {
        return precioMaximo;
    }

    public int getPrecioMinimo() {
        return precioMinimo;
    }

    
    
    
    
    public String toString() {
      return "soy un poco " + super.toString();
   }
    
}
    
    

