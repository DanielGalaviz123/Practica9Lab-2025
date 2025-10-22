import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TerricolaTest {

    @Test
    void testDestruirDevuelveMensajeCorrecto() {
        Escenario e = new Escenario("Test");
        Posicion p = new Posicion(0, 0);
        String nombre = "AgenteSmith";

        Terricola t = new Terricola(nombre, e, p);

        assertEquals("AgenteSmith destruido", t.destruir());
    }
}