/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicializadores;

/**
 *
 * @author carlos
 */
public class padreINicializadores {
    
  public Integer i;

    public padreINicializadores(Integer i) {
        this.i = i;
        System.out.println("Constructor clase padre INicializadores  "+ i);
    }
  
    //Inicializadores de clase
    static{
        Integer x = 10;
        System.out.println("Inicializador de clase desde clase padre Inicializadores "+ x);
    }
    
    //Inicializaciones de instancia
    {
     Float f = 105.000005f;
     System.out.println("Inicializador de instancia desde la clase padre de INicializadores "+f);
    }
    
    
}
