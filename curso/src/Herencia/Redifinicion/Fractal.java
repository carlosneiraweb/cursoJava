/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia.Redifinicion;

/**
 *
 * @author carlos
 */
public class Fractal extends Rectangle {
    
    public String fractal;

    public Fractal(String radius, int l1, int l2, int l3, int l4, String saludos) {
        super(radius, l1, l2, l3, l4, saludos);
        this.fractal = "Soy un fractal";
        
    }
    
    
    
}
