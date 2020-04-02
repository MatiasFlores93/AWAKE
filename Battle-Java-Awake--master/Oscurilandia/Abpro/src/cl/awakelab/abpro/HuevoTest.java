package cl.awakelab.abpro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cl.awakelab.abpro.Huevo;

class HuevoTest {
    
    private Huevo huevo;
    private int lanzamientoEnFila;
    private int lanzamientoEnColumna;
    private int puntajeObtenido;
    private int puntajeBonus;

    @BeforeEach
    void setUp() throws Exception {
        
        lanzamientoEnFila = 2;
        lanzamientoEnColumna = 3;
        puntajeObtenido = 12;
        puntajeBonus = 10;
        
        huevo = new Huevo(lanzamientoEnFila, lanzamientoEnColumna);
    }

    @Test

    void shouldReturnLanzamientoEnFila() {

        assertEquals(lanzamientoEnFila, huevo.getLanzamientoEnFila());

    }

    @Test

    void shouldChangeLanzamientoEnFila() {

        int fila = 2;
        huevo.setLanzamientoEnFila(fila);
        assertEquals(fila, huevo.getLanzamientoEnFila());

    }
    
    @Test

    void shouldReturnLanzamientoEnColumnaColumna() {

        assertEquals(lanzamientoEnColumna, huevo.getLanzamientoEnColumna());

    }
    
    @Test

    void shouldChangeLanzamientoEnColumna() {

        int columna = 6;
        huevo.setLanzamientoEnColumna(columna);
        assertEquals(columna, huevo.getLanzamientoEnColumna());

    }
    
    @Test

    void shouldReturnPuntajeObtenido() {

        assertEquals(puntajeObtenido, huevo.getPuntajeObtenido());

    }

    @Test

    void shouldChangePuntajeObtenido() {

        int puntaje = 13;
        huevo.setPuntajeObtenido(puntaje);
        assertEquals(puntaje, huevo.getPuntajeObtenido());

    }
    
    @Test

    void shouldReturnPuntajeBonus() {

        assertEquals(puntajeBonus, huevo.getPuntajeBonus());

    }
    
    @Test

    void shouldChangePuntajeBonus() {

        int bonus = 10;
        huevo.setPuntajeBonus(bonus);
        assertEquals(bonus, huevo.getPuntajeBonus());

    }


}
