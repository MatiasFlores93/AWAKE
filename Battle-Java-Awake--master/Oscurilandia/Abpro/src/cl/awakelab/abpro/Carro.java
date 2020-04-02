package cl.awakelab.abpro;

/**
 * La clase Carro corresponde a una clase abtracta cuyos atributos son
 * cantidad de  ocupantes, fecha de ingreso, ubicacion tanto por fila como por
 * columna e id. De esta clase heredan las clases Kromi, Caguano y Trupalla.
 * 
 * @author Matias Flores matias.eduardo.flores@gmail.com Ana Luisa Medina
 *         analuisa.medina.r@gmail.com Segundo Medina bit1815@hotmail.com
 * 
 * @since Eclipse IDE for Enterprise Java Developers - 2019-12
 * 
 */
public abstract class Carro {
	
	//atributos 
    private String id;
    private int cantidadDeOcupantes;
    private int fechaDeIngreso;
    private int ubicacionFila;
    private int ubicacionColumna;
    
    //contructores
    public Carro(int cantidadDeOcupantes, int fechaDeIngreso, int ubicacionFila, int ubicacionColumna, String id) {
        super();
        this.cantidadDeOcupantes = cantidadDeOcupantes;
        this.fechaDeIngreso = fechaDeIngreso;
        this.ubicacionFila = ubicacionFila;
        this.ubicacionColumna = ubicacionColumna;
        this.id=id;
    }

	public Carro() {
    	
    		setUbicacionColumna(ubicacionColumna);
    		setUbicacionFila(ubicacionFila);
    		
    }
    //get and setter

    /**
     * @return el cantidadDeOcupantes
     */
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    public int getCantidadDeOcupantes() {
        return cantidadDeOcupantes;
    }
    /**
     * @param cantidadDeOcupantes el cantidadDeOcupantes a establecer
     */
    public void setCantidadDeOcupantes(int cantidadDeOcupantes) {
        this.cantidadDeOcupantes = cantidadDeOcupantes;
    }
    /**
     * @return el fechaDeIngreso
     */
    public int getFechaDeIngreso() {
        return fechaDeIngreso;
    }
    /**
     * @param fechaDeIngreso el fechaDeIngreso a establecer
     */
    public void setFechaDeIngreso(int fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }
    /**
     * @return el ubicacion fila
     */
    public int getUbicacionFila() {
        return ubicacionFila;
    }
    /**
     * @param ubicacion el ubicacion fila a establecer
     */
    public void setUbicacionFila(int ubicacionFila) {
        this.ubicacionFila = ubicacionFila;
    }
    /**
     * @return el ubicacionColumna
     */
    public int getUbicacionColumna() {
        return ubicacionColumna;
    }
    /**
     * @param ubicacion el ubicacion fila a establecer
     */
    public void setUbicacionColumna(int ubicacionColumna) {
        this.ubicacionColumna = ubicacionColumna;
    }

	@Override
	public String toString() {
		return "Carro [id=" + id + ", cantidadDeOcupantes=" + cantidadDeOcupantes + ", fechaDeIngreso=" + fechaDeIngreso
				+ ", ubicacionFila=" + ubicacionFila + ", ubicacionColumna=" + ubicacionColumna + "]";
	}




    

}
