package estacion;

import static org.junit.Assert.*;

import bicicleta.Bicicleta;
import bicicleta.Movil;
import org.junit.Before;
import org.junit.Test;

public class AnclajesTest {
    Anclajes anclajes = null;
    Movil bici = null;

    @Before
    public void setup() {
        anclajes = new Anclajes(30);
        bici = new Bicicleta(333);

    }

    @Test
    public void testNumAnclajes() {
        assertEquals(30, anclajes.numAnclajes());
    }

    @Test
    public void testOcuparAnclaje() {
        anclajes.ocuparAnclaje(0, bici);
        assertTrue(anclajes.anclajes()[0].isOcupado());
        anclajes.liberarAnclaje(0);
        assertFalse(anclajes.anclajes()[0].isOcupado());
    }

    @Test
    public void getBici() {
        anclajes.ocuparAnclaje(5, bici);
        assertEquals(bici, anclajes.anclajes()[5].getBici());
    }


    @Test
    public void testGetBiciAt() {
        anclajes.anclajes()[5].anclarBici(bici);
        assertEquals(bici, anclajes.getBiciAt(5));
    }

    @Test
    public void testToString() {
        assertEquals("Numero de anclajes: 30", anclajes.toString());
    }

}
