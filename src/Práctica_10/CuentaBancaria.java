package Práctica_10;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public synchronized void depositar(double monto, String nombreUsuario) {
        System.out.println(nombreUsuario + " está intentando depositar $" + monto);
        double saldoNuevo = this.saldo + monto;

        try { Thread.sleep(10); } catch (InterruptedException e) {}

        this.saldo = saldoNuevo;
        System.out.println("DEPÓSITO de " + nombreUsuario + " exitoso. Nuevo Saldo: $" + this.saldo);
    }

    public synchronized void retirar(double monto, String nombreUsuario) {
        System.out.println(nombreUsuario + " está intentando retirar $" + monto);

        if (this.saldo >= monto) {
            double saldoNuevo = this.saldo - monto;

            try { Thread.sleep(10); } catch (InterruptedException e) {}

            this.saldo = saldoNuevo;
            System.out.println("RETIRO de " + nombreUsuario + " exitoso. Nuevo Saldo: $" + this.saldo);
        } else {
            System.out.println("RETIRO de " + nombreUsuario + " fallido. Saldo insuficiente: $" + this.saldo);
        }
    }
}