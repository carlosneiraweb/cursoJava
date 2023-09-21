/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inicializadores;

/**
 *
 * @author carlos
 */
public class lanzarInicializadores {
    
  public static void main(String[] args) {
      
      
        
        System.out.println("Accediendo desde main a una variable de clase sin inicializar 'Inicializadores.staticSinInicializar' => "+Inicializadores.staticSinInicializar); 
        System.out.println("");
        System.out.println("Llamamos al constructor de la clase hija");
        System.out.println("");
        Inicializadores ini = new Inicializadores(5);
        //System.out.println("Intentando acceder propiedad estatica inicializada "+Inicializadores.d);
        //System.out.println("Accediendo staticHija un inicializador sin instanciar la clase"+Inicializadores.staticHija); 
          
    /*   
     System.out.println("Probamos conste de una instancia contra metodo estatico");
        
        System.out.println("");
        
        long tmpInst = System.nanoTime();
        
        InicializacionExcepciones iniInst = new InicializacionExcepciones("Soy el aviso de una instancia", 5);
        iniInst.genero();
        
        long finInst = System.nanoTime();
        
        System.out.println("El coste de crear una instancia ha sido "+ (finInst - tmpInst)); 
        
        
        long tmpEst = System.nanoTime();
        //InicializacionExcepciones.aviso2= "Soy el aviso de un metodo estatico";
        //InicializacionExcepciones.ad = 4;
        InicializacionExcepciones.GeneroEstatico(); 
  
        long finEst = System.nanoTime();
        
        System.out.println("El coste de crear una instancia ha sido "+ (finEst - tmpEst));    
    */
    }
         
    
    
    
    
    
    
    
    
    
}
