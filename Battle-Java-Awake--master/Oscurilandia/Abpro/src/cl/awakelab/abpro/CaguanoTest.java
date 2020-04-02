package cl.awakelab.abpro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cl.awakelab.abpro.Caguano;

class CaguanoTest {
    
    private Caguano caguano;
    private int alcanceDeTiro;
    private String colorDeConfeti;
    private int ubicacionFila;
    private int ubicacionColumna;
    private int fechaDeIngreso;
    private int cantidadDeOcupantes;

    @BeforeEach
    void setUp() throws Exception {
        alcanceDeTiro = (int) (Math.random()* 10);
        colorDeConfeti = "cafe";
        ubicacionFila = 1;
        ubicacionColumna = 5;
        fechaDeIngreso = 1997;
        cantidadDeOcupantes = (int) (Math.random()*10-8);
        
        caguano = new Caguano(cantidadDeOcupantes, fechaDeIngreso, ubicacionFila, ubicacionColumna, alcanceDeTiro, colorDeConfeti);
       
    }


    @Test

    void shouldReturnUbicacionFila() {

        assertEquals(ubicacionFila, caguano.getUbicacionFila());

    }



    @Test

    void shouldChangeUbicacionFila() {

        int fila = 2;
        caguano.setUbicacionFila(fila);
        assertEquals(fila, caguano.getUbicacionFila());

    }
    
    @Test

    void shouldReturnUbicacionColumna() {

        assertEquals(ubicacionColumna, caguano.getUbicacionColumna());

    }
    
    @Test

    void shouldChangeUbicacionColumna() {

        int columna = 6;
        caguano.setUbicacionFila(columna);
        assertEquals(columna, caguano.getUbicacionFila());

    }



    @Test

    void shouldReturnalcanceDeTiro() {

        assertEquals(alcanceDeTiro, caguano.getAlcanceDeTiro());

    }

    

    @Test

    void shouldChangeAlcanceDeTiro() {

        int alcanceDeTiro = (int) (Math.random()* 10);

        caguano.setAlcanceDeTiro(alcanceDeTiro);

        assertEquals(alcanceDeTiro, caguano.getAlcanceDeTiro());

    }

    

    @Test

    void shouldReturncolorDeConfeti() {

         assertEquals(colorDeConfeti, caguano.getColorDeConfeti());

    }

    

    @Test

    void shouldChangeColorConfeti() {

        String color = "rojo";

        caguano.setColorDeConfeti(color);

        assertEquals(color, caguano.getColorDeConfeti());

    }

    

    @Test

    void shouldChangeFechaDeIngreso() {

        int ingreso = 1998;

        caguano.setFechaDeIngreso(fechaDeIngreso);

        assertEquals(ingreso, caguano.getFechaDeIngreso());

    }

    

    @Test

    void shouldReturncantidadDeOcupantes() {

        assertEquals(cantidadDeOcupantes, caguano.getCantidadDeOcupantes());

    }

    

    @Test

    void shouldChargetCantidadDeOcupantes() {

        int cantidadDeOcupantes = (int)(Math.random() * 10 - 8);

        caguano.setCantidadDeOcupantes(cantidadDeOcupantes);

        assertEquals(cantidadDeOcupantes, caguano.getCantidadDeOcupantes());

    }


}
