import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DestruibleTest {

    @Test
    void destruir() {

        Destruible objetoDestruible = new Destruible() {
            @Override
            public String destruir() {
                return "Objeto simulado destruido";
            }
        };

        String mensajeEsperado = "Objeto simulado destruido";

        assertEquals(mensajeEsperado, objetoDestruible.destruir());
    }
}