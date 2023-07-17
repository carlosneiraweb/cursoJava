/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia.Redifinicion;

/**
 *
 * @author Carlos
 */
public  class Shape {

    public String forma = "Soy una figura";
    public String saludos;
    
    public Shape(String saludos) {
       this.saludos = saludos;
    }

    public String getSaludos() {
        return saludos;
    }

    public void setSaludos(String saludos) {
        this.saludos = saludos;
    }
    
    /**
     * Metodo privado Shape
     */
    private void privadoShape(){
        System.out.println("Metodo privado Shape");
    }
    
    /**
     * Metodo Protected Shape
     */
    
    protected void protectedShape(){
        System.out.println("Metodo protected Shape");
    }
    
    static void metodoStaticoSape(){
        System.out.println("Metodo estatico Shape");
    }
    /**
     * Metodo draw de Shape
     */
    void draw(){
        System.out.println("clase Shape");
    }
    /**
     * Metodo claseShape
     * de la clase Shape
     */
    void claseShape(){
        System.out.println("Soy la clase Shape");
    }
    
}
