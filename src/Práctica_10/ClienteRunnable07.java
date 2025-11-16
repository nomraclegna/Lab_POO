package Práctica_10;

public class ClienteRunnable07 implements Runnable {

    private String nombreCliente;
    private CuentaBancaria cuenta;
    private double montoADepositar;

    public ClienteRunnable07(String nombreCliente, CuentaBancaria cuenta, double montoADepositar) {
        this.nombreCliente = nombreCliente;
        this.cuenta = cuenta;
        this.montoADepositar = montoADepositar;
    }

    @Override
    public void run() {
        System.out.println("El cliente " + this.nombreCliente + " está iniciando...");
        this.cuenta.depositar(this.montoADepositar, this.nombreCliente);
    }
}