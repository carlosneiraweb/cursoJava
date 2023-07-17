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
 * Al contar con un contenido mutable, StringBuilder no es un tipo de dato seguro para aplicaciones 
 * con múltiples hilos de ejecución. 
 * Si dos hilos acceden simultáneamente para cambiar algo en la cadena, 
 * el resultado puede ser totalmente inesperado.
 *
 */
public class StringBuilderJava {
    
    
    /**
     * Ejemplo de constructores
     */
    public void metodosContructores(){
       
       System.out.println("Metodos sobre cargado, admite de todo tipo");
       StringBuilder build = new StringBuilder("Mi primer StringBuilder en Java");       
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
       System.out.println("noMutable => "+ noMutable);
       System.out.println("Utilizamos el .concat para intentar añadir algo ");
       noMutable.concat("sol");
       System.out.println("Resultado => "+noMutable);
        System.out.println("Solo podemos cambiar su valor con una nueva asignacion");
        System.out.println("noMutable = noMutable.concat");
       noMutable = noMutable.concat("Cambio");
        System.out.println(noMutable);
       
       
       
   }
    
    /**
     * Diferencia entre append y Insert
     * The append method always adds these characters at the end of the builder; 
     * the insert method adds the characters at a specified point.
     */
    public void AppendAndInsert(){
        
        
        
        
        
        
     //fin   AppendAndInsert 
    }
    
    
    /**
     * Probamos varios metodos de la clase
     */
    public void Metodos(){
        
        StringBuilder uno = new StringBuilder("Soy un String mutable");
        System.out.println(uno);
        System.out.println("Tengo una capacidad de "+uno.capacity());
        System.out.println("Delete 0,3");
        System.out.println(uno.delete(0, 3));
        
        
        
        
        //fin Metodos
    }
    
    
//fin StringBuilderJava  
}
