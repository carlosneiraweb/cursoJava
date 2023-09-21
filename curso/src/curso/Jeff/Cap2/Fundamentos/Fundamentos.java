/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.Jeff.Cap2.Fundamentos;

/**
 *
 * @author carlos
 */
public class Fundamentos {
    
    
    
    /**
     * Metodo que recive un array<br>
     * con varios elementos.<br>
     * 
     * @param values array de elementos double<br>
     * @return total double
     */
    
    public double sum(double... values){
      
        
        double total = 0;
        
        for (int i = 0; i < values.length; i++) 
            total += values[i];
            
        
        return total;
    //fin sum    
    }
    
    
    /**
     * METODOS SOBRECARGADOS
     * <br>
     * Dos metodos estan sobrecargados  <br>
     * si sus listas de parametros difieren en numero<br>
     * u orden, o al menos un parametro es de tipo diferente.<br>
     * No se puede sobrecargar un metodo cambiando el tipo de retorno.<br>
     *
     */
    
    public void escribir(String letras, int numeros){
        
        System.out.println("letras "+letras+ " numeros "+numeros);
        
    }
    
    public void escribir(int numeros, String letras){
        
        System.out.println("numeros "+numeros+ " letras "+letras);
    }
    
    
    
    //fin Fundamentos
    
}
