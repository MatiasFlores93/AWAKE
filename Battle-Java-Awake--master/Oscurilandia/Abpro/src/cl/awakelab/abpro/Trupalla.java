package cl.awakelab.abpro;

/**
 * La clase Trupalla corresponde a una herencia de la clase Carro, por lo que
 * hereda sus atributos, como cantidad de  ocupantes, fecha de ingreso,
 * ubicacion tanto por fila como por columna e id, adicionalmente consta de
 * los atributos de nivel de armadura y nombre de operario.
 * 
 * @author Matias Flores matias.eduardo.flores@gmail.com Ana Luisa Medina
 *         analuisa.medina.r@gmail.com Segundo Medina bit1815@hotmail.com
 * 
 * @since Eclipse IDE for Enterprise Java Developers - 2019-12
 * 
 */
public class Trupalla extends Carro {
    
    private int nivelDeArmadura;
    private String nombreOperario;
    
    public Trupalla(int cantidadDeOcupantes, int fechaDeIngreso, int ubicacionFila, int ubicacionColumna, int nivelDeArmadura,
            String nombreOperario, String id) {
        super(cantidadDeOcupantes, fechaDeIngreso, ubicacionFila, ubicacionColumna, id);
        this.nivelDeArmadura = nivelDeArmadura;
        this.nombreOperario = nombreOperario;
    }
    /**
     * @return el nivelDeArmadura
     */
    public int getNivelDeArmadura() {
        return nivelDeArmadura;
    }
    /**
     * @param nivelDeArmadura el nivelDeArmadura a establecer
     */
    public void setNivelDeArmadura(int nivelDeArmadura) {
        this.nivelDeArmadura = nivelDeArmadura;
    }
    /**
     * @return el nombreOperario
     */
    public String getNombreOperario() {
        return nombreOperario;
    }
    /**
     * @param nombreOperario el nombreOperario a establecer
     */
    public void setNombreOperario(String nombreOperario) {
        this.nombreOperario = nombreOperario;
    }
    @Override
    public String toString() {
        return "Trupalla [nivelDeArmadura=" + nivelDeArmadura + ", nombreOperario=" + nombreOperario + "]";
    }
    

}
