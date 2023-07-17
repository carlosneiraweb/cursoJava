/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import Persona.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author carlos
 */
public class InicializadorHashMap {

    public static void main(String[] args) {

        MyHashMap primero = new MyHashMap();
        HashMap<String, Person> mapPerson = null;

        String[] ids = new String[3];
        ids[0] = "1";
        ids[1] = "2";
        ids[2] = "3";

        Person[] per = new Person[]{new Person("carlos", "20"), new Person("sonia","20"), new Person("raul","5") };

        mapPerson = primero.inicializoHashPersona(ids, per);

        //System.out.println("Mostramos contenido de hash");
        //primero.mostrarHashMap(mapPerson);

        //System.out.println("EL objeto con clave "+ids[0]+ " esta en el hashMap ");
        //primero.contieneKey(mapPerson, ids[0]);
        System.out.println("Provamos 3 metodos remove, size y values");
        primero.probarValuesSizeRemove(mapPerson);
        primero.mostrarHashMap(mapPerson);
    }

}
