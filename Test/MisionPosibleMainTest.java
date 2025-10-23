import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

class MisionPosibleMainTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> MisionPosibleMain.main(new String[]{}));
    }

    @Test
    void leerConfiguracion() {
        Escenario e = new Escenario("Test");
        assertDoesNotThrow(() -> MisionPosibleMain.leerConfiguracion(e, "configuracion.txt"));
    }

    @Test
    void guardarConfiguracion() {
        Escenario e = new Escenario("Test");
        assertDoesNotThrow(() -> MisionPosibleMain.guardarConfiguracion(e, "configuracion.txt"));
        File archivo = new File("configuracion.txt");
        assertTrue(archivo.exists());
    }
}
