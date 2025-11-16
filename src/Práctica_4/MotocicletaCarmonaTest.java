package Práctica_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotocicletaCarmonaTest {

    @Test
    void testConstructorMotocicletaHeredaYAsigna() {
        MotocicletaCarmona moto = new MotocicletaCarmona("Ninja", "Kawasaki", "Ninja 400", 130000, 400, "Deportiva");

        assertEquals("Ninja", moto.getNombre());
        assertEquals("Kawasaki", moto.getMarca());
        assertEquals(130000, moto.getCosto());
        assertFalse(moto.isEncendido());

        assertEquals(400, moto.getCilindrada());
        assertEquals("Deportiva", moto.getTipoDeMotocicleta());
    }
}