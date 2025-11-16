package Práctica_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuentaBancaria2707Test {
    @Test
    void testDepositoExitoso() {
        CuentaBancaria2707 cuenta = new CuentaBancaria2707("Angel", "123", 1000.0);

        cuenta.depositar(500.0);

        double saldoEsperado = 1500.0;
        double saldoActual = cuenta.getSaldo();

        assertEquals(saldoEsperado, saldoActual);
    }

    @Test
    void testDepositoInvalido_ExcedeLimite() {
        CuentaBancaria2707 cuenta = new CuentaBancaria2707("Angel", "123", 1000.0);

        cuenta.depositar(9120.0);

        double saldoEsperado = 1000.0;
        double saldoActual = cuenta.getSaldo();

        assertEquals(saldoEsperado, saldoActual);
    }
}

