package cl.awakelab.abpro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cl.awakelab.abpro.Kromi;

class KromiTest {

    private Kromi kromi;
    private int anoDeFabricacion;
    private String marca;
    private int ubicacionFila;
    private int ubicacionColumna;
    private int fechaDeIngreso;
    private int cantidadDeOcupantes;
    
    kromi = new Kromi(cantidadDeOcupantes, fechaDeIngreso, ubicacionFila, ubicacionColumna, anoDeFabricacion, marca);


    @BeforeEach
    void setUp() throws Exception {
        
        anoDeFabricacion = 1994;
        marca = "scania";
        ubicacionFila = 2;
        ubicacionColumna = 6;
        fechaDeIngreso = 1997;
        cantidadDeOcupantes = (int) (Math.random()*10-8);
        
    }

    @Test

    void shouldReturnUbicacionFila() {

        assertEquals(ubicacionFila, kromi.getUbicacionFila());

    }

    @Test

    void shouldChangeUbicacionFila() {

        int fila = 3;
        kromi.setUbicacionFila(fila);
        assertEquals(fila, kromi.getUbicacionFila());

    }
    
    @Test

    void shouldReturnUbicacionColumna() {

        assertEquals(ubicacionColumna, kromi.getUbicacionColumna());

    }
    
    @Test

    void shouldChangeUbicacionColumna() {

        int columna = 7;
        kromi.setUbicacionFila(columna);
        assertEquals(columna, kromi.getUbicacionFila());

    }
    
    @Test

    void shouldChangeFechaDeIngreso() {

        int ingreso = 1998;

        kromi.setFechaDeIngreso(fechaDeIngreso);

        assertEquals(ingreso, kromi.getFechaDeIngreso());

    }

    

    @Test

    void shouldReturncantidadDeOcupantes() {

        assertEquals(cantidadDeOcupantes, kromi.getCantidadDeOcupantes());

    }

    

    @Test

    void shouldChargetCantidadDeOcupantes() {

        int cantidadDeOcupantes = (int)(Math.random() * 10 - 8);

        kromi.setCantidadDeOcupantes(cantidadDeOcupantes);

        assertEquals(cantidadDeOcupantes, kromi.getCantidadDeOcupantes());

    }
    
    @Test

    void shouldChangeAnoDeFabricacion() {

        int ingreso = 1998;

        kromi.setAnoDeFabricacion(anoDeFabricacion);

        assertEquals(ingreso, kromi.getAnoDeFabricacion());

    }
    
    @Test

    void shouldChangeMarca() {

        String tipo = "volvo";

        kromi.setMarca(tipo);

        assertEquals(tipo, kromi.getMarca());

    }
}
