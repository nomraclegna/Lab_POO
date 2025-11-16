package Práctica_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutoCarmonaTest {

    @Test
    void testConstructorAuto() {
        AutoCarmona auto = new AutoCarmona("Jetta", "Volkswagen", "2024", 450000, 4, "Gasolina");

        assertEquals("Jetta", auto.getNombre());
        assertEquals("Volkswagen", auto.getMarca());
        assertEquals(450000, auto.getCosto());
        assertFalse(auto.isEncendido());

        assertEquals(4, auto.getNumDePuertas());
        assertEquals("Gasolina", auto.getTipoDeGasolina());
    }
}