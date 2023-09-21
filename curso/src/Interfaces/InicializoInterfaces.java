/**
*http://puntocomnoesunlenguaje.blogspot.com/2013/09/java-interfaces.html
*/
package Interfaces;

import Interfaces.Animal;

/**
 *
 * @author carlos
 */
public class InicializoInterfaces {

    public static void main(String[] args) {
        Animal unop = new Animal();
        Animal dos = new Animal();
        System.out.println("Total animales " + Animal.devuelvoTotal());

    }

    //InicializoInterfaces
}
