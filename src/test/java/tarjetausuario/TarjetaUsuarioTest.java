package tarjetausuario;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TarjetaUsuarioTest {

    TarjetaUsuario tarjeta = null;

    @Before
    public void setup() {
        tarjeta = new TarjetaUsuario("888", true);
    }

    @Test
    public void constructorTest() {
        assertTrue(tarjeta.isActivada());
    }

    @Test
    public void setActivadaTest() {
        tarjeta.setActivada(false);
        assertFalse(tarjeta.isActivada());
    }

    @Test
    public void toStringTest() {
        assertEquals("888", tarjeta.toString());
    }

    @Test
    public void testInterfaceAutenticacion() {
        Autenticacion autenticacion = tarjeta;
        assertTrue(autenticacion.isActivada());
    }
}
