/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inicializadores;

/**
 *
 * @author carlos
 */
public class InicializacionExcepciones {
    
    
    public String aviso;
    public Integer cod;
    public static String aviso2 = "Soy el aviso de un metodo estatico";
    public static Integer ad = 5;

    public InicializacionExcepciones(String aviso, Integer cod) {
        this.aviso = aviso;
        this.cod = cod;
    }
    
    
    public void genero(){
        
        
        try {
            System.out.println(aviso);
            if(cod == 5 ){
                throw new Exception("Lanzo excepcio clase");
            }
            
            
        } catch (Exception e) {
            System.out.println("Mensaje "+e.getMessage());
        }
        
        
        
    }
    
    public static void GeneroEstatico(){
        
        try{
            System.out.println(aviso2);
            if(ad == 5){
                throw new Exception("Lanzo excepcion estatica");
            }
            
        }catch(Exception e){
            System.out.println("Mensaje estatico "+ e.getMessage());
        }
        
        
        
    }
}
