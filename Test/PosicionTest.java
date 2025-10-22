import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PosicionTest {

    @Test
    void testConstructorYGetRenglon() {
        Posicion p = new Posicion(7, 3);
        assertEquals(7, p.getRenglon());
    }

    @Test
    void testConstructorYGetColumna() {
        Posicion p = new Posicion(7, 3);
        assertEquals(3, p.getColumna());
    }
}