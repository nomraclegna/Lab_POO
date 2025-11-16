package Práctica_7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileWriter;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;
import java.io.IOException;

class SistemaBancoACTest {
    @Test
    void testRetiroExitoso() {
        SistemaBancoAC banco = new SistemaBancoAC();

        assertDoesNotThrow(() -> {
            banco.realizarTransaccion("AECL9119", 500.0); // Retiro válido
        });
    }

    @Test
    void testErrorSaldoInsuficiente() {
        SistemaBancoAC banco = new SistemaBancoAC();

        assertThrows(Saldo07InsuficienteException.class, () -> {
            banco.procesarRetiro(5000.0);
        });
    }

    @Test
    void testLoggingConTryWithResources() {
        System.out.println("\n--- Prueba de Logging y try-with-resources ---");
        SistemaBancoAC banco = new SistemaBancoAC();

        try (FileWriter testWriter = new FileWriter("test_log.txt", true)) {

            testWriter.write("--- Prueba iniciada ---\n");

            banco.realizarTransaccion("usuario_falso", 100.0);

            testWriter.write("--- Prueba finalizada ---\n");


        } catch (IOException e) {
            e.printStackTrace();
            fail("El logger de prueba no se pudo crear: " + e.getMessage());
        }

        System.out.println("Prueba de try-with-resources completada. Revisa 'test_log.txt'.");
    }
}