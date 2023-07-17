/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap5.Enum;

/**
 *
 * @author carlos
 */
public class Lanzar {
    
    
    public static void main(String args[]){

    
        Coin c = Coin.QUARTER;
        System.out.println(c.toDenomination(100));
        
        System.err.println(Coin.values()[2]);
    
    
}
    
    
    
    
}
