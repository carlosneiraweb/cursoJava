/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.Jeff.Cap7.API.String;

/**
 *
 * @author carlos
 * 
 * 
 */


/**
 * 
 * Esta clase está diseñada para usarse como un reemplazo directo en StringBuffer
 * lugares donde el búfer de cadena estaba siendo utilizado por un solo subproceso
 * (como suele ser el caso). 
 * Siempre que sea posible, se recomienda utilizar esta clase con preferencia, 
 * StringBuffer ya que será más rápida en la mayoría de las implementaciones.
 *
 */
public class StringBuilderJava {
    
    
    /**
     * Ejemplo de constructores
     */
    public void metodosContructores(){
       
       System.out.println("Metodos sobre cargado, admite de todo tipo");
       StringBuilder build = new StringBuilder("Mi primer StringBuilder en Java, saludosddddddddddddddddddddddddddddddddddddddddddddddddddd");       
       System.out.println(build);
      // String builSt = new StringBuilder("fffff");
   
   
    }
      
    /**
     * Metodo para ver que la clase StringBuilder
     * es mutable
     */
    public void BuliderMutable(){
       
       
       StringBuilder muto = new StringBuilder("hola");
       System.out.println("Muestro el primer contenido de muto "+muto);
       System.out.println("");
       System.out.println("Añado mundo ");
       muto.append(" mundo");
       System.out.println(muto);
       System.out.println("Variable de la clase String inmutable");
       String noMutable = new String("Hola Mudo");
       
       
       
       
   }
    
    
    
//fin StringBuilderJava  
}
