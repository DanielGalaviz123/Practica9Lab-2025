import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BombaTest {

    private final Escenario ESCENARIO = new Escenario("Test");

    @Test
    void getPosicion() {
        Posicion p1 = new Posicion(5, 5);
        Bomba bomba = new Bomba(ESCENARIO, p1, 1);

        assertEquals(p1, bomba.getPosicion());
        assertEquals(5, bomba.getPosicion().getRenglon());
    }

    @Test
    void setPosicion() {
        Posicion pInicial = new Posicion(1, 1);
        Posicion pNueva = new Posicion(8, 8);
        Bomba bomba = new Bomba(ESCENARIO, pInicial, 1);

        bomba.setPosicion(pNueva);

        assertEquals(pNueva, bomba.getPosicion());
    }

    @Test
    void destruir() {
        Posicion p = new Posicion(0, 0);
        Bomba bomba = new Bomba(ESCENARIO, p, 1);
        String mensajeEsperado = "Bomba destruida";

        assertEquals(mensajeEsperado, bomba.destruir());
    }

    @Test
    void explotar() {
        Posicion p = new Posicion(2, 2);
        Bomba bomba = new Bomba(ESCENARIO, p, 1);

        assertDoesNotThrow(() -> bomba.explotar());
    }
}