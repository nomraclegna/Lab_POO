package Práctica_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehiculoAECLTest {

    @Test
    void testConstructorVehiculo() {
        VehículoAECL vehiculo = new VehículoAECL("Generico", "Marca", "Modelo", 10000);

        assertEquals("Generico", vehiculo.getNombre());
        assertEquals("Marca", vehiculo.getMarca());

        assertFalse(vehiculo.isEncendido());
    }

    @Test
    void testComportamientoArrancarYApagar() {
        VehículoAECL vehiculo = new VehículoAECL("Generico", "Marca", "Modelo", 10000);

        vehiculo.arrancar();

        assertTrue(vehiculo.isEncendido());

        vehiculo.apagar();

        assertFalse(vehiculo.isEncendido());
    }
}