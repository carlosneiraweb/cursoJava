/**
 * https://www.campusmvp.es/recursos/post/cadenas-mutables-e-inmutables-en-java-cuando-usar-string-stringbuilder-y-stringbuffer.aspx
 */
package curso.Jeff.Cap7.API.String;

/**
 *
 * Una secuencia de caracteres mutable y segura para subprocesos.<br>
 * Un búfer de cadena es como un String, pero se puede modificar. <br>
 * En cualquier momento, contiene una secuencia particular de caracteres, <br>
 * pero la longitud y el contenido de la secuencia se pueden cambiar <br>
 * a través de ciertas llamadas a métodos.<br>
 * 
 * Los búferes de cadena son seguros para que los usen varios subprocesos. <br>
 * Los métodos se sincronizan cuando es necesario para que todas las operaciones <br>
 * en cualquier instancia en particular se comporten como si ocurrieran en algún orden <br>
 * en serie que sea consistente con el orden de las llamadas a métodos realizadas por cada uno<br>
 * de los subprocesos involucrados.
 */
public class StringBufferJava {
    
    
    /**
     * mismo que StringBuilder
     */
    
}
