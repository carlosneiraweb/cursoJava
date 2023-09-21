
/**
 * 1º   Se inicializan a default las variables de clase padre.
 * 
 * 2º   Desde los inicializadores de clase padre se inicializan las 
 *      variables de clase a valores determinados.
 *      No se pueden usar variables de instancia dentro de un inicializador de clase,
 *      pero si variables normales.
 * 
 * 3º   Se asigna valor default a las variables de clase en la clase hija.
 *      Se asigna un valor determinado desde el inicializador de clase en la clase hija.
 * 
 * 4º   Llamamos al constructor de la clase hija.
 * 
 * 5º   Antes de ejecutar el codigo del constructor padre se instancian
 *      a default las variables de instancia 
 *      de la clase padre,
 *      y desde el inicializador de instancia padre
 *      se inicializan a un valor determinado.
 * 
 * 6º   Se ejecuta el constructor padre.
 * 
 * 7º   Se inicializan las variables de instancia a default 
 *      de la clase hija,  desde el inicializador de instancia
 *      de la clase hija se asigna valor predeterminado.
 *      Se pueden usar variables de clase en un inicializador de instancia.
 * 
 * 8º   Se llama al constructor de la clase hija.
 *      
 * 
 * 
 * 
 */
package Inicializadores;


public class padreINicializadores {
    
  public Integer i;
  static Integer padre = 100000000;
  static Integer staticPadre;
  public Float instanciaPadre;

    public padreINicializadores(Integer i) {
        this.i = i;
       
        System.out.println("Constructor clase padre propiedad publi i =>  "+ i);
        System.out.println("Propiedad estatica desde clase padre "+padre);
        System.out.println("");
    }
  
    //Inicializadores de clase
    static{
        
        System.out.println("Valor de variable staticPadre en la de clase default "+staticPadre);
        staticPadre = 10;
        System.out.println("Asignamos valor a variable staticPadre del inicializador clase padre  "+ staticPadre);
        String variableNormal ="Variable normal dentro de un inicializador de clase 'variableNormal'";
        System.out.println(variableNormal);
        System.out.println("");
    }
    
    //Inicializaciones de instancia
    {
     System.out.println("""
                           Antes de ejecutar el codigo del constructor padre
                           se instancian a default la variables de instancia
                           y desde el inicializador de instancia de la clase padre
                           se inicializan.
                           """);
     System.out.println("Desde inicializador de instancia clase padre valor default vafiable instanciaPadre => "+instanciaPadre);
     instanciaPadre = 105.000005f;
     System.out.println("Inicializamos el valor de instanciaPadre a un valor determinado");
     System.out.println("Inicializador de instancia desde la clase padre  "+instanciaPadre);
     System.out.println("");
    }
    
    
}
