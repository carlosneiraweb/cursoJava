/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.hashMap;
import java.util.HashMap;
import java.util.Map;
import Persona.Person;

/**
 *
 * @author carlos
 */
public class MyHashMap {

    public HashMap<String,String> usuarios = new HashMap<>();
    

    public MyHashMap(String clave, String valor) {
        this.usuarios.put(clave, valor);
        
    }

    public HashMap<String, String> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashMap<String, String> usuarios) {
        this.usuarios = usuarios;
    }
    
    
}
