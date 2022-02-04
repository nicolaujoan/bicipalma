package bicicleta;

import bicicleta.Bicicleta;
import bicicleta.Movil;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class BicicletaTest {

    Bicicleta bici = null;  // referencia a Bicicleta nula

    // setup, se realiza antes de ejecutar cada test
    @Before
    public void setup() {
        bici = new Bicicleta(888);
    }

    // chequea que el constructor funciona como se espera
    @Test
    public void constructorBiciTest() {
        assertEquals(888, bici.getId());
    }

    // chequea que el toString hace lo que promete
    @Test
    public void toStringTest() {
        assertEquals("888", bici.toString());
    }

    // chequea que la interfaz funciona como se espera
    @Test
    public void implementationMovilTest() {
        Movil movil = bici;

        assertEquals(888, movil.getId());
    }
}
