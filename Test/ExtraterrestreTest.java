import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExtraterrestreTest {

    private final Escenario ESCENARIO = new Escenario("Test");

    @Test
    void getNombre() {
        String nombreEsperado = "Xenomorfo";
        Extraterrestre e = new Extraterrestre(nombreEsperado, ESCENARIO, new Posicion(1, 1));

        assertEquals(nombreEsperado, e.getNombre());
    }

    @Test
    void getPosicion() {
        Posicion pEsperada = new Posicion(5, 5);
        Extraterrestre e = new Extraterrestre("E1", ESCENARIO, pEsperada);

        assertEquals(pEsperada, e.getPosicion());
        assertEquals(5, e.getPosicion().getColumna());
    }

    @Test
    void setPosicion() {
        Posicion pInicial = new Posicion(1, 1);
        Posicion pNueva = new Posicion(9, 9);
        Extraterrestre e = new Extraterrestre("E1", ESCENARIO, pInicial);

        e.setPosicion(pNueva);

        assertEquals(pNueva, e.getPosicion());
        assertEquals(9, e.getPosicion().getRenglon());
    }

    @Test
    void destruir() {
        String nombre = "Predator";
        Extraterrestre e = new Extraterrestre(nombre, ESCENARIO, new Posicion(0, 0));
        String mensajeEsperado = nombre + " destruido";

        assertEquals(mensajeEsperado, e.destruir());
    }
}