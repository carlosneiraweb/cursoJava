/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInternas.ClaseInterna;

/**
 *
 * @author carlos
 */
public class PruebaClaseAnidada {

    public static void main(String[] ar) {

       
        ClaseAnidada x = new ClaseAnidada();//Solo accede a los capos public de su clase
        
        //NO FUNCIONA POR QUE PUNTO ES PRIVATE
        //LA CLASE INTERNA SE COMPORTA COMO UN METODO
         
        //x.new Punto(2,3).  
        //ClaseAnidada.Punto i = x.new Punto(1,2);
        
        ClaseAnidada ca = new ClaseAnidada();
       
        ca.agregarPunto(30, 30);
        ca.agregarPunto(2, 7);
        ca.agregarPunto(-3, 2);
        ca.agregarPunto(-5, -4);
        ca.agregarPunto(-9, 2);

        System.out.println("Cantidad de puntos en el primer cuadrante+"
                + ca.cantidadPuntosCuadrante(1));
        
        System.out.println("Cantidad de puntos en el segundo cuadrante+"
                + ca.cantidadPuntosCuadrante(2));
        System.out.println("Cantidad de puntos en el tercer cuadrante+"
                + ca.cantidadPuntosCuadrante(3));
        System.out.println("Cantidad de puntos en el cuarto cuadrante+"
                + ca.cantidadPuntosCuadrante(4));


    }

    //ClaseAnidada 
}
