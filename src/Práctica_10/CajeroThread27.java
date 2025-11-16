package Práctica_10;

public class CajeroThread27 extends Thread {

    private String nombreCajero;
    private CuentaBancaria cuenta;
    private double montoARetirar;

    public CajeroThread27(String nombreCajero, CuentaBancaria cuenta, double montoARetirar) {
        super(nombreCajero);
        this.nombreCajero = nombreCajero;
        this.cuenta = cuenta;
        this.montoARetirar = montoARetirar;
    }

    @Override
    public void run() {
        System.out.println("El cajero " + this.nombreCajero + " está iniciando...");
        this.cuenta.retirar(this.montoARetirar, this.nombreCajero);
    }
}