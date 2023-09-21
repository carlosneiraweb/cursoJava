/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia.EquipoFutbol;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class LanzarEquipoFutbol {
    
    
    
	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		
		SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
		SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		SeleccionFutbol raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println("nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.viajar();
		}

                System.out.println("nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
            for (SeleccionFutbol integrante : integrantes) {
                System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
                integrante.entrenamiento();
            }

// PARTIDO DE FUTBOL
            System.out.println("nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
            for (SeleccionFutbol integrante : integrantes) {
                System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
                integrante.partidoFutbol();
            }

    
    //fin LanzarEquipoFutbol
    
}}
