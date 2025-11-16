package Práctica_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CamionCarmonaTest {

    @Test
    void testConstructorCamionHeredaYAsigna() {

        CamionCarmona camion = new CamionCarmona("Tractor", "Kenworth", "T680", 2500000, 40.5, 6);

        assertEquals("Tractor", camion.getNombre());
        assertEquals("Kenworth", camion.getMarca());
        assertEquals(2500000, camion.getCosto());
        assertFalse(camion.isEncendido());

        assertEquals(40.5, camion.getCapacidadDeCarga());
        assertEquals(6, camion.getNumDeEjes());
    }
}