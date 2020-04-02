package cl.awakelab.abpro;

/**
 * La clase Kromi corresponde a una herencia de la clase Carro, por lo que
 * hereda sus atributos, como cantidad de  ocupantes, fecha de ingreso,
 * ubicacion tanto por fila como por columna e id, adicionalmente consta de
 * los atributos de ano de fabricacion y marca.
 * 
 * @author Matias Flores matias.eduardo.flores@gmail.com Ana Luisa Medina
 *         analuisa.medina.r@gmail.com Segundo Medina bit1815@hotmail.com
 * 
 * @since Eclipse IDE for Enterprise Java Developers - 2019-12
 * 
 */
public class Kromi extends Carro {

	private int anoDeFabricacion;
	private String marca;

	public Kromi(int cantidadDeOcupantes, int fechaDeIngreso, int ubicacionFila, int ubicacionColumna,
			int anoDeFabricacion, String marca, String id) {
		super(cantidadDeOcupantes, fechaDeIngreso, ubicacionFila, ubicacionColumna, id);
		this.anoDeFabricacion = anoDeFabricacion;
		this.marca = marca;
	}

	/**
	 * @return el anoDeFabricacion
	 */
	public int getAnoDeFabricacion() {
		return anoDeFabricacion;
	}

	/**
	 * @param anoDeFabricacion el anoDeFabricacion a establecer
	 */
	public void setAnoDeFabricacion(int anoDeFabricacion) {
		this.anoDeFabricacion = anoDeFabricacion;
	}

	/**
	 * @return el marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca el marca a establecer
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Kromi [anoDeFabricacion=" + anoDeFabricacion + ", marca=" + marca + "]";
	}

}
