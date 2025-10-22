import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EscenarioTest {

    @Test
    void agregarElemento() {
        Escenario e = new Escenario("Test");
        Posicion p = new Posicion(5, 5);
        Roca elemento = new Roca(e, p);

        e.agregarElemento(elemento);

        String resultado = e.toString();

        assertTrue(resultado.contains("R "));
        assertFalse(resultado.contains("T "));
    }

    @Test
    void destruirElementos() {
        Escenario e = new Escenario("Test");
        Terricola t = new Terricola("Target", e, new Posicion(1, 1));
        Roca r = new Roca(e, new Posicion(1, 2));

        e.agregarElemento(t);
        e.agregarElemento(r);

        e.destruirElementos(new Posicion(1, 1), 0);

        String resultado = e.toString();

        assertTrue(resultado.contains("R "));
        // El Terricola en (1,1) debe haberse ido.
        assertNotEquals('T', resultado.charAt(11));
    }

    @Test
    void testToString() {
        Escenario e = new Escenario("Test");
        Terricola t = new Terricola("T1", e, new Posicion(0, 0));

        e.agregarElemento(t);

        String resultado = e.toString();

        assertEquals('T', resultado.charAt(0));
        assertTrue(resultado.endsWith("0 \n"));
        assertEquals(210, resultado.length());
    }
}