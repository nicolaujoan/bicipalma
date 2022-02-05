package estacion;

import static org.junit.Assert.*;

import bicicleta.Bicicleta;
import estacion.Anclaje;
import org.junit.Before;
import org.junit.Test;

public class AnclajeTest {
    Anclaje anclaje = null;
    Bicicleta bici = null;

    @Before
    public void crearBici() {
        bici = new Bicicleta(333);
    }

    @Before
    public void setup() {
        anclaje = new Anclaje();
    }

    @Test
    public void test_constructor() {
        assertFalse(anclaje.isOcupado());
    }

    @Test
    public void testGetBici() {
        anclaje.anclarBici(bici);
        assertEquals(bici, anclaje.getBici());
    }

    @Test
    public void testLiberarBici() {
        anclaje.liberarBici();
        assertNull(anclaje.getBici());
    }

    @Test
    public void testToString() {
        assertEquals(anclaje.toString(), "ocupado: false");
    }

}
