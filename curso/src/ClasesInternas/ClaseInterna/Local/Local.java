/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInternas.ClaseInterna.Local;



/**
 *
 * @author carlos
 */
public class Local {
    
    public void imprimir(){
        System.out.println("Imprimo desde la clase Externa");
        final String vfinal = "Soy una variable final en el metodo";
        String saludo = "Saludos desde imprimir";
        
        class LocalB{
            public String local = "Soy local";
            
            public void imprimir(){
                
              System.out.println("Imprimo desde la clase local");
              System.out.println(vfinal); 
              System.out.println(saludo);
           
            }
            
        }
        
        LocalB local1 = new LocalB();
        local1.imprimir();
       
        
        System.out.println("Fin de imprimir de la clase Externa");  
    
}
    public static void main(String[] ar){
        
        Local externa1 = new Local();
        externa1.imprimir();
        
        
       
    }
    
    
    
    
    
    //fin externa
}
