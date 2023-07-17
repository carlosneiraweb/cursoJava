/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaHerencia;

/**
 *
 * @author carlos
 */
public class Animal {
    
    
    public String Apu;
    private String Apri;
    protected String Apr;

    public Animal(String Apu, String Apri, String Apr) {
        this.Apu = Apu;
        this.Apri = Apri;
        this.Apr = Apr;
    }
    
    
    
    
    protected void protectedAnima(){
        System.out.println("metodo protected animal");
    }
    
    public void publicoAnimal(){
        System.out.println("Metodo publico animal");
    }
    
}
