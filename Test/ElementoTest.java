import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElementoTest {

    private final Escenario ESCENARIO = new Escenario("Test");

    @Test
    void getPosicion() {
        Posicion pEsperada = new Posicion(2, 4);


        Roca elemento = new Roca(ESCENARIO, pEsperada);

        assertEquals(pEsperada, elemento.getPosicion());
        assertEquals(2, elemento.getPosicion().getRenglon());
        assertEquals(4, elemento.getPosicion().getColumna());
    }

    @Test
    void setPosicion() {
        Posicion pInicial = new Posicion(1, 1);
        Posicion pNueva = new Posicion(9, 7);


        Roca elemento = new Roca(ESCENARIO, pInicial);

        elemento.setPosicion(pNueva);

        assertEquals(pNueva, elemento.getPosicion());
        assertEquals(9, elemento.getPosicion().getRenglon());
    }
}