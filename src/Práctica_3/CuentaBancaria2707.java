package Práctica_3;


public class CuentaBancaria2707 {
    private double saldo;
    private String numDeCuenta;
    private String nombre;

    private final int limite = 9119;

    public CuentaBancaria2707(String nombre, String numDeCuenta, double saldo) {
        this.nombre = nombre;
        this.numDeCuenta = numDeCuenta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNumeroCuenta() {
        return this.numDeCuenta;
    }

    public String getTitular() {
        return this.nombre;
    }
    
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("ERROR. El monto a depositar debe ser mayor a 0.");
        } else if (monto > limite) {
            System.out.println("ERROR. El depósito excede el límite personal de " + limite);
        } else {
            this.saldo = this.saldo + monto;
            System.out.println("Nuevo saldo: " + this.saldo);
        }
    }
    
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("ERROR. El monto a retirar debe ser mayor a 0.");
        } else if (monto > this.saldo) {
            System.out.println("ERROR. Saldo insuficiente. Su saldo actual es de: " + this.saldo);
        } else {
            this.saldo -= monto;
            System.out.println("Saldo restante: " + this.saldo);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria: " + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Cuenta: " + this.numDeCuenta + "\n" +
                "Saldo: $" + this.saldo;
    }
}