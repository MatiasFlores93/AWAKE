package cl.awakelab.web;


import java.util.InputMismatchException;
import java.util.Scanner;
import cl.awakelab.abpro.*;

/**
* La clase Menu es la clase main desde donde ejecutamos nuestro proyecto. En la
* clase menu instanciamos el objeto Tablero mediante el uso del constructor
* Tablero(), la matrizH que es una matriz de tipo char de 15 filas x 15 columnas,
* y por ultimo instanciamos que la matrizH corresponde al metodo llenarMatriz().
* 
* 
* @author Matias Flores matias.eduardo.flores@gmail.com
* 		  Ana Luisa Medina analuisa.medina.r@gmail.com
* 		  Segundo Medina bit1815@hotmail.com
* 
* @since Eclipse IDE for Enterprise Java Developers - 2019-12
*
 */
public class Menu {

	public static void main(String[] args) {
		
		Tablero tablita = new Tablero();
		
		char[][] matrizH = new char[15][15];
		char[][] matrizC = new char[15][15];
		Scanner sn = new Scanner(System.in);
		matrizH = llenarMatriz();
		
		
		 String[][] tablero;
		
		
		boolean salir = false;

		int op = 0;
		int op1 = 0;

		do {

			System.out.println("ESTRATEGIA DE COMANDO FIRSTLINE");
			System.out.println("-------------------------------");
			System.out.println("1. JUGAR ");
			System.out.println("2. MOSTRAR MATRIZ");
			System.out.println("3. MOSTRAR MATRIZ DE CARROS");

			/*
			 * 
			 * System.out.println("3. MOSTRAR DATOS KROMI");
			 * System.out.println("4. MOSTRAR DATOS CAGUANO");
			 * System.out.println("5. MOSTRAR DATOS TRUPALLA ");
			 */
			System.out.println("4. SALIR");

			try {
				op=Tablero.leerEntero("Escribe una de las opciones");

				switch (op) {

				case 1:
					System.out.println("1. LANZAR HUEVO ");
					
					System.out.println("3. SALIR ");

					
						do {
							try {
								
							
							Tablero.muestraMatrizPrueba(matrizH);
							tablita.LanzarHuevo(Tablero.leerEntero("Ingrese la fila (0 a 14)"),
									Tablero.leerEntero("Ingrese la columna (0 a 14)"));
							matrizH=cambiarMatriz(tablita);
							
							System.out.println(" huevo lanzado ");
							} catch (InputMismatchException e) {
								Tablero.leerEntero("Debes insertar un número");								
							}
						} while (op ==1);
						
					
					

				case 2:
					Tablero.muestraMatrizPrueba(matrizH);

					break;

				case 3:
					Tablero.muestraMatrizCarros(matrizC);
					tablita.agregarCarros(Tablero.crearkromi());
				

					break;

				case 4:
					Tablero.escribir("Muchas gracias por utilizar nuestro juego ", true);

					break;

				default:
					Tablero.escribir("Solo números entre 1 y 4", true);
					break;
				}

			} catch (InputMismatchException e) {
				Tablero.leerEntero("Debes insertar un número");
				
			}

		} while (salir);
	}
	public void arrojarHuevo(int fila, int columna) {
	
	}
	
	/**
	 * El metodo cambiarMatriz() lo que hace es mediante el uso del bucle for each recorrer el ArrayList huevito
	 * el cual contiene los objetos de Huevo lanzados los que mediante el uso del bucle for son ingresados en la
	 * matriz segun las coordenadas registradas en el ArtrayList huevito.
	 * 
	 * @param tabla (crea una tabla)
	 * @return matriz 
	 */
	public static char[][] cambiarMatriz(Tablero tabla) {
		char[][] matriz = new char[15][15];
		for (Huevo huevito : tabla.getHuevos()) {
			matriz[huevito.getLanzamientoEnFila()][huevito.getLanzamientoEnColumna()]='H';	
		}
		
		return matriz;
		
	}
	
	/**
	 * El metodo llenarMatriz() lo que hace es instanciar una matriz de tipo
	 * char de dimensiones de 15 filas por 15 columnas y recorrerla mediante el
	 * uso de un bucle for anidado y rellenandola con espacios
	 * @return matriz
	 */
	public static char[][] llenarMatriz() {
		char[][] matriz = new char[15][15];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = ' ';
			}
		}
		return matriz;
	}
	
}
