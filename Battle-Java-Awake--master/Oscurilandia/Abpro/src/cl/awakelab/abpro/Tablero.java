package cl.awakelab.abpro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
* La clase Tablero corresponde al Controller de nuestro proyecto y en el
* instanciamos una matriz de tipo char de dimensiones 15 fila y 15 columnas en
* donde ingresaremos los carros creados, las direcciones horizontal y vertical 
* para el posicionamiento de los carros en la matriz, se instancia tambien un
* ArrayLiast de nombre huevos al que se le agregaran objetos de la clase Huevo,
* y por ultimo instanciamos un Array con elementos heredados de tipo Carro.
* 
* @author Matias Flores matias.eduardo.flores@gmail.com
* 		  Ana Luisa Medina analuisa.medina.r@gmail.com
* 		  Segundo Medina bit1815@hotmail.com
* 
* @since Eclipse IDE for Enterprise Java Developers - 2019-12
*
*/
public class Tablero {

	public char[][] matriz = new char[15][15];
	public static int horizontal, columna;

	private ArrayList<Huevo> huevos;
	private Carro[] carros;
	private String[][] matrizCarros;
	private String[][] matrizPrimeraLinea;
	/**
	 * creamos los contructores que se utilizaran 
	 */
	public Tablero() {
		this.carros = new Carro[18];
		this.huevos = new ArrayList<Huevo>();
		llenarTablero();
		//rellenarMatrizCarro();
		
	}
/**
 * generamos get and setter 
 * @return
 */
	public static Scanner getEntrada() {
		return entrada;
	}

	public static void setEntrada(Scanner entrada) {
		Tablero.entrada = entrada;
	}

	public ArrayList<Huevo> getHuevos() {
		return huevos;
	}

	public Carro[] getCarros() {
		return carros;
	}

	Kromi newKromi;
	static Scanner entrada = new Scanner(System.in);
/**
 * mostramos los datos de lso huevos que se han lanzado a la matriz 
 */
	public void muestraHuevos() {
		for (Huevo huevo : this.huevos) {
			System.out.print("[" + huevo.getPuntajeBonus() + huevo.getPuntajeObtenido() + "]");
		}
	}
/**
 * mostramos los datos de los carrros  e imprimimos la ubicacion en la matriz 
 */
	public void muestraCarros() {
		for (Carro carro : this.carros) {
			System.out.print("[" + carro.getUbicacionColumna() + carro.getUbicacionFila() + "]");
		}
	}
/**
 * ingresar datos de caguano a el tablero  
 * @param carro
 */
	public void ingresarATablero(Caguano carro) {
		boolean creado = true;
		for (int i = 0; i < 18 && creado; i++) {
			if (carros[i] == null) {
				carros[i] = carro;
				creado = false;
				if (i > 0) {
					cambioPosicionTablero(i);
				}
			}
		}
	}
/**ingresamos los datos de kromi al tablero  
 * 
 * @param carro
 */
	public void ingresarATablero(Kromi carro) {
		boolean creado = true;
		for (int i = 0; i < 18 && creado; i++) {
			if (carros[i] == null) {
				carros[i] = carro;
				creado = false;
				if (i > 0) {
					cambioPosicionTablero(i);
				}
			}
		}
	}
/**
 * ingresamos los datos datos del trupalla 
 * @param carro
 */
	public void ingresarATablero(Trupalla carro) {
		boolean creado = true;
		for (int i = 0; i < 18 && creado; i++) {
			if (carros[i] == null) {
				carros[i] = carro;
				creado = false;
				if (i > 0) {
					cambioPosicionTablero(i);
				}
			}
		}
	}
/**
 * crear un metodo  para cambiar las pocisiones del tablero 
 * @param posicionCarroNuevo
 */
	public void cambioPosicionTablero(int posicionCarroNuevo) {
		boolean condicion;

		for (int j = 0; j < posicionCarroNuevo; j++) {
			condicion = ((carros[posicionCarroNuevo].getUbicacionFila() == carros[j].getUbicacionFila()
					&& carros[posicionCarroNuevo].getUbicacionColumna() == carros[j].getUbicacionColumna())
					|| (carros[j].getUbicacionFila() + 1 == carros[posicionCarroNuevo].getUbicacionFila()
							&& carros[posicionCarroNuevo].getUbicacionColumna() == carros[j].getUbicacionColumna())
					|| (carros[j].getUbicacionFila() + 2 == carros[posicionCarroNuevo].getUbicacionFila()
							&& carros[posicionCarroNuevo].getUbicacionColumna() == carros[j].getUbicacionColumna())
					|| (carros[posicionCarroNuevo].getUbicacionFila() == carros[j].getUbicacionFila()
							&& carros[j].getUbicacionColumna() + 1 == carros[posicionCarroNuevo]
									.getUbicacionColumna()));

			if (condicion) {
				// carros[posicionCarroNuevo].setUbicacionColumna();
				// carros[posicionCarroNuevo].setUbicacionFila();
				cambioPosicionTablero(j);
			}
		}
	}

	public void llenarTablero() {

	}
	
/*
 * @return kromi
 */
	public static Kromi crearkromi() {
		Random rd = new Random();
		Kromi kromi = new Kromi(3, 2020, rd.nextInt(15), rd.nextInt(15), 5, "Kromi","id_Kromi");
		return kromi;
	}
/**
 * 
 * @return caguano
 */
	public Caguano crearCaguanpo() {
		Random rd = new Random();
		Caguano caguano = new Caguano(2, 2010, rd.nextInt(15), rd.nextInt(15), 5, "Caguano ","id_Caguano");
		return caguano;
	}
/**
 * 
 * @return trupalla
 */
	public Trupalla crearTrupalla() {
		Random rd = new Random();
		Trupalla trupalla = new Trupalla(3, 2001, rd.nextInt(15), rd.nextInt(15), 5, "Trupalla","id_Trupalla");
		return trupalla;
	}
/**
 * 
 * @param carro
 */
	public void agregarCarros(Carro carro) {
		boolean agregado = true;
		for (int i = 0; i < 18 && agregado; i++) {
			if (carros[i] == null) {
				carros[i] = carro;
				agregado = false;
			}
		}
	}

	public void lanzarHuevo(Huevo huevo) {

		if (this.matrizCarros[huevo.getLanzamientoEnFila()][huevo.getLanzamientoEnColumna()].equals("| K |")) {
			huevo.setPuntajeObtenido(3);
			this.matrizPrimeraLinea[huevo.getLanzamientoEnFila()][huevo.getLanzamientoEnColumna()] = "| H |";
			this.matrizCarros[huevo.getLanzamientoEnFila()][huevo.getLanzamientoEnColumna()] = "| H |";
		} else if (this.matrizCarros[huevo.getLanzamientoEnFila()][huevo.getLanzamientoEnColumna()].equals("| C |")) {
			huevo.setPuntajeObtenido(2);
			this.matrizPrimeraLinea[huevo.getLanzamientoEnFila()][huevo.getLanzamientoEnColumna()] = "| H |";
			this.matrizCarros[huevo.getLanzamientoEnFila()][huevo.getLanzamientoEnColumna()] = "| H |";
		} else if (this.matrizCarros[huevo.getLanzamientoEnFila()][huevo.getLanzamientoEnColumna()].equals("| T |")) {
			huevo.setPuntajeObtenido(2);
			this.matrizPrimeraLinea[huevo.getLanzamientoEnFila()][huevo.getLanzamientoEnColumna()] = "| H |";
			this.matrizCarros[huevo.getLanzamientoEnFila()][huevo.getLanzamientoEnColumna()] = "| H |";
		} else
			this.matrizPrimeraLinea[huevo.getLanzamientoEnFila()][huevo.getLanzamientoEnColumna()] = "| H |";
		this.matrizCarros[huevo.getLanzamientoEnFila()][huevo.getLanzamientoEnColumna()] = "| H |";
		huevos.add(huevo);

	}
	public void mostrarMatrizCarros() {
		String impcarro;
		
		for (int i = 0; i < this.matrizCarros.length; i++) {
			impcarro = i + "  ";
			System.out.printf(impcarro);
			for (int j = 0; j < this.matrizCarros.length; j++) {
				System.out.printf( this.matrizCarros[i][j]);
			}
			impcarro = "  " + i;
			System.out.print(impcarro);
			System.out.println("");
		}
		
	}
	
	/**
	 * El metodo muestraMatrizPrueba() lo que hace es imprimir una matriz
	 * definida como char, esto mediante el uso del for anidado. El bucle for(j)
	 * que imprime las columnas utiliza el metodo System.out.print(), mientras
	 * que el for(i) que imprime las filas utiliza System.out.println() para
	 * una impresion ordenada de la matriz ingresada.
	 * @param matriz
	 */
	public static void muestraMatrizPrueba(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println("");
		}
	}

	public static char[][] creaMatrizCarros(int x, int y) {
		char[][] matriz = new char[x][y];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = ' ';
			}
		}
		return matriz;
	}

	public static void muestraMatrizCarros(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println("");
		}
	}

	/**
	 * El metodo LanzarHuevo() lo que hace es solicitar tanto un numero de fila
	 * como un numero de columna y crea un objeto huevo en el ArrayList huevos
	 * con esas indicaciones.
	 * @param fila
	 * @param columna
	 */
	public void LanzarHuevo(int fila, int columna) {
		Huevo huevo1 = new Huevo(fila, columna);
		huevos.add(huevo1);
	}

	public void rellenarMatrizCarro() {
		for (int i = 0; i < carros.length; i++) {
			
			llenarMatriz((Caguano) carros[i]);
			llenarMatriz((Trupalla) carros[i]);
			llenarMatriz((Kromi) carros[i]);
		}

	}

	private void llenarMatriz(Trupalla Trupalla) {
		this.matrizCarros[Trupalla.getUbicacionFila()][Trupalla.getUbicacionColumna()] = "| T |";
	}

	private void llenarMatriz(Kromi kromi) {
		this.matrizCarros[kromi.getUbicacionFila()][kromi.getUbicacionColumna()] = "| K |";
		this.matrizCarros[kromi.getUbicacionFila() + 1][kromi.getUbicacionColumna()] = "| K |";
		this.matrizCarros[kromi.getUbicacionFila() + 2][kromi.getUbicacionColumna()] = "| K |";
	}

	private void llenarMatriz(Caguano caguano) {
		this.matrizCarros[caguano.getUbicacionFila()][caguano.getUbicacionColumna()] = "| C |";
		this.matrizCarros[caguano.getUbicacionFila()][caguano.getUbicacionColumna() + 1] = "| C |";
	}

	/**
	 * El metodo escribir() es una funcion orientada a escribir mensaje.
	 * El mensaje es el mismo pero la funcion utilizada dependera del valor
	 * booleano que se entregue. Si el valor del booleano es verdadero se
	 * utiliza la funcion System.out.println() la cual agrega un salto de linea
	 * posterior a la impresion del mensaje, mientras que de ser falso la
	 * funcion ulizada en System.out.print() la que no contempla un salto de
	 * linea, es decir, se sigue ejecutando el codigo hacia a la derecha de la
	 * misma linea del mensaje.
	 * @param mensaje
	 * @param salto
	 */
	public static void escribir(String mensaje, boolean salto) {
		if (salto) {
			System.out.println(mensaje);
		} else
			System.out.print(mensaje);
	}

	/**
	 * El metodo leerEntero() es una funcion de tipo entero (int) que nos
	 * permite solicitar un valor de tipo entero mediante el uso del metodo
	 * escribir e inmediatamente leerlo mediante la funcion Scanner(System.in)
	 * @param mensaje
	 * @return int
	 * 
	 */
	public static int leerEntero(String mensaje) {
		escribir(mensaje, true);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}

}
