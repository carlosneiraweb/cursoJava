/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constantes;

/**
 *
 * @author carlos
 */
public class Constantes {
    
    
    private final Integer IN = 10;
    final  Integer IN2;//final vacio
    private final Integer IN3;//final vacio

    Constantes( Integer IN2,Integer IN3) {
  
        this.IN2 = IN2;
        this.IN3=IN3;
    }
    
        
    public Integer sumar(){
        
      Integer total = IN2+IN3;
      
      return total;
        
        
    }
    
}
