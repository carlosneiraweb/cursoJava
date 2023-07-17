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
public class Intermedia extends Animal{
    
    protected String Inpr;
    public String Inpu;

    public Intermedia(String Inpr, String Inpu, String Apu, String Apri, String Apr) {
        super(Apu, Apri, Apr);
        this.Inpr = Inpr;
        this.Inpu = Inpu;
        
    }

    

    protected void InProtecteMethod(){
       
       
    }
    
    public void InPublicMethod(){
        
    }
    
    
    
}
