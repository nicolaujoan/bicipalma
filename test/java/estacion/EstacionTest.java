package estacion;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EstacionTest {

//    Estacion estacion = null;

   /* @Before
    public void setup() {
         estacion = new Estacion(5, "Petra", 20);
    }*/

    /*@Test
    public void testConsultarEstacion() {
        assertEquals("id: 5" +
                "\ndireccion: Petra" +
                "\nnumeroAnclajes: 20", estacion.toString());
    }*/

    @Test
    public void visualizarAnclajesLibres() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        assertEquals(6, estacion.anclajesLibres());
    }
}
