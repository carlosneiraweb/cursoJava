/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap5.Genericos.Personalizados.LimitesSuperior;

/**
 *
 * @author carlos
 */
public class Triangulo extends Shape implements Comparable<Triangulo>{
    

private double x,y,esquina;
    
    Triangulo(double x, double y, double esquina){
        this.x = x;
        this.y = y;
        this.esquina = esquina;
    }
    
    @Override
    public int compareTo(Triangulo tr){
        System.out.println(esquina);
        System.out.println(tr.esquina);
        if (esquina < tr.esquina)
            return -1;
        else
            
            if(esquina > tr.esquina)
                return 1;
        else
                return 0;
    }
    
    @Override 
    public String toString(){
        return "(" + x + ", "+ y + ", "+esquina + ")";
    }


//fin triangulo    

   
}
