package cl.awakelab.abpro;

/**
 * La clase Caguano corresponde a una herencia de la clase Carro, por lo que
 * hereda sus atributos, como cantidad de  ocupantes, fecha de ingreso,
 * ubicacion tanto por fila como por columna e id, adicionalmente consta de
 * los atributos de alcance de tiro y color de confeti.
 * 
 * @author Matias Flores matias.eduardo.flores@gmail.com Ana Luisa Medina
 *         analuisa.medina.r@gmail.com Segundo Medina bit1815@hotmail.com
 * 
 * @since Eclipse IDE for Enterprise Java Developers - 2019-12
 * 
 */
public class Caguano extends Carro {
    //atributos
    private int alcanceDeTiro;
    private String colorDeConfeti;
    //contructores                                                     
    public Caguano(int cantidadDeOcupantes, int fechaDeIngreso, int ubicacionFila, int ubicacionColumna, int alcanceDeTiro,
            String colorDeConfeti, String id) {
        super(cantidadDeOcupantes, fechaDeIngreso, ubicacionFila, ubicacionColumna,id);
        this.alcanceDeTiro = alcanceDeTiro;
        this.colorDeConfeti = colorDeConfeti;
    }
    public Caguano() {
    	this.getUbicacionColumna();
    	this.getUbicacionFila();
    	
    }
    

    
    /**
     * @return el alcanceDeTiro
     */
    public float getAlcanceDeTiro() {
        return alcanceDeTiro;
    }
    /**
     * @param alcanceDeTiro el alcanceDeTiro a establecer
     */
    public void setAlcanceDeTiro(int alcanceDeTiro) {
        this.alcanceDeTiro = alcanceDeTiro;
    }
    /**
     * @return el colorDeConfeti
     */
    public String getColorDeConfeti() {
        return colorDeConfeti;
    }
    /**
     * @param colorDeConfeti el colorDeConfeti a establecer
     */
    public void setColorDeConfeti(String colorDeConfeti) {
        this.colorDeConfeti = colorDeConfeti;
    }
    @Override
    public String toString() {
        return "Caguano [alcanceDeTiro=" + alcanceDeTiro + ", colorDeConfeti=" + colorDeConfeti + "]";
    }
    

}
