import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RocaTest {

    @Test
    void testCreacionYRocaNoEsNula() {
        Escenario escenario = new Escenario("Test");
        Posicion posicion = new Posicion(5, 5);

        Roca roca = new Roca(escenario, posicion);

        assertNotNull(roca);
    }

    @Test
    void testGetPosicion() {
        Escenario escenario = new Escenario("Test");
        Posicion posicion = new Posicion(1, 9);
        Roca roca = new Roca(escenario, posicion);

        assertEquals(1, roca.getPosicion().getRenglon());
    }
}