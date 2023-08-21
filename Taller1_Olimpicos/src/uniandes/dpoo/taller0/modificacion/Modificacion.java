package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	
	public static void main(String args[]) throws FileNotFoundException, IOException {
		
		System.out.println("Hola, mundo!");
		System.out.println();
		System.out.println("Eventos cargados: ");
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println();
		System.out.println("Pais con más medallas: ");
		System.out.println(calc.paisConMasMedallistas());

		
	}
	
}
