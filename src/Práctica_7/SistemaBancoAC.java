package Práctica_7;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SistemaBancoAC {
    private static final Logger logger = Logger.getLogger(SistemaBancoAC.class.getName());
    private static FileHandler fileHandler;

    static {
        try {
            fileHandler = new FileHandler("banco_log.txt", true);

            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            logger.setLevel(Level.INFO);
            logger.info("~~~ Sistema de logging iniciado por Angel Carmona (2069119) ~~~");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private double saldoEnCuenta = 1000.0;
    private String usuarioValido = "AECL9119";

    public void validarUsuario(String idUsuario) throws Usuario9119NoEncontradoException {
        if (!idUsuario.equals(this.usuarioValido)) {
            throw new Usuario9119NoEncontradoException("ERROR. El usuario '" + idUsuario + "' no se encontró.");
        }
        System.out.println("Usuario " + idUsuario + " vse validó exitosamente.");
    }

    public void procesarRetiro(double monto) throws Saldo07InsuficienteException {
        if (monto > this.saldoEnCuenta) {
            throw new Saldo07InsuficienteException("ERROR. Saldo insuficiente. Saldo actual: " + this.saldoEnCuenta);
        }

        this.saldoEnCuenta -= monto;
        System.out.println("Retiro exitoso. Nuevo saldo: " + this.saldoEnCuenta);
    }

    public void realizarTransaccion(String idUsuario, double montoARetirar) {

        System.out.println("\n~~~ Intentando transacción para " + idUsuario + " por $" + montoARetirar + " ~~~");

        try {
            validarUsuario(idUsuario);

            procesarRetiro(montoARetirar);

            System.out.println("Transacción completada exitosamente.");
            logger.info("Transacción por " + montoARetirar + " para " + idUsuario);

        }
        catch (Usuario9119NoEncontradoException e) {
            System.out.println("Error de Transacción: " + e.getMessage());
            logger.log(Level.WARNING, "Intento de acceso fallido: " + e.getMessage());
        }
        catch (Saldo07InsuficienteException e) {
            System.out.println("Error de Transacción: " + e.getMessage());
            logger.log(Level.WARNING, "Intento de retiro fallido para " + idUsuario + ": " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error inesperado del sistema: " + e.getMessage());
            logger.log(Level.SEVERE, "Error inesperado: " + e.getMessage());
        }
        finally {
            System.out.println("~~~ Fin de la transacción ~~~");
        }
    }

}