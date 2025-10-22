import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonajeTest {

    private final Escenario ESCENARIO = new Escenario("Test");

    @Test
    void getPosicion() {
        Posicion pEsperada = new Posicion(3, 3);
        // Usamos Terricola para instanciar Personaje
        Terricola personaje = new Terricola("P1", ESCENARIO, pEsperada);

        assertEquals(pEsperada, personaje.getPosicion());
        assertEquals(3, personaje.getPosicion().getRenglon());
    }

    @Test
    void setPosicion() {
        Posicion pInicial = new Posicion(1, 1);
        Posicion pNueva = new Posicion(6, 8);
        Terricola personaje = new Terricola("P1", ESCENARIO, pInicial);

        personaje.setPosicion(pNueva);

        assertEquals(pNueva, personaje.getPosicion());
        assertEquals(8, personaje.getPosicion().getColumna());
    }

    @Test
    void getNombre() {
        String nombreEsperado = "Protagonista";
        Terricola personaje = new Terricola(nombreEsperado, ESCENARIO, new Posicion(0, 0));

        assertEquals(nombreEsperado, personaje.getNombre());
    }
}