package cl.awakelab.abpro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cl.awakelab.abpro.Trupalla;

class TrupallaTest {
    
    private Trupalla trupalla;
    private int nivelDeArmadura;
    private String nombreDeOperario;
    private int ubicacionFila;
    private int ubicacionColumna;
    private int fechaDeIngreso;
    private int cantidadDeOcupantes;
    

    @BeforeEach
    void setUp() throws Exception {
        nivelDeArmadura = 1;
        nombreDeOperario = "jose";
        ubicacionFila = 2;
        ubicacionColumna = 6;
        fechaDeIngreso = 1997;
        cantidadDeOcupantes = (int) (Math.random()*10-8);
        
        trupalla = new Trupalla(cantidadDeOcupantes, fechaDeIngreso, ubicacionFila, ubicacionColumna, nivelDeArmadura, nombreDeOperario);

    }

    @Test

    void shouldReturnUbicacionFila() {

        assertEquals(ubicacionFila, trupalla.getUbicacionFila());

    }

    @Test

    void shouldChangeUbicacionFila() {

        int fila = 3;
        trupalla.setUbicacionFila(fila);
        assertEquals(fila, trupalla.getUbicacionFila());

    }
    
    @Test

    void shouldReturnUbicacionColumna() {

        assertEquals(ubicacionColumna, trupalla.getUbicacionColumna());

    }
    
    @Test

    void shouldChangeUbicacionColumna() {

        int columna = 7;
        trupalla.setUbicacionFila(columna);
        assertEquals(columna, trupalla.getUbicacionFila());

    }
    
    @Test

    void shouldChangeFechaDeIngreso() {

        int ingreso = 1998;

        trupalla.setFechaDeIngreso(fechaDeIngreso);

        assertEquals(ingreso, trupalla.getFechaDeIngreso());

    }

    

    @Test

    void shouldReturncantidadDeOcupantes() {

        assertEquals(cantidadDeOcupantes, trupalla.getCantidadDeOcupantes());

    }

    

    @Test

    void shouldChargetCantidadDeOcupantes() {

        int cantidadDeOcupantes = (int)(Math.random() * 10 - 8);

        trupalla.setCantidadDeOcupantes(cantidadDeOcupantes);

        assertEquals(cantidadDeOcupantes, trupalla.getCantidadDeOcupantes());

    }
    

}
