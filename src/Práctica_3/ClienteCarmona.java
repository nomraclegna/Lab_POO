package Práctica_3;

public class ClienteCarmona {
    private CuentaBancaria2707 cuentaBancaria;
    private String nombre;
    protected String idCliente;

    public ClienteCarmona(String nombre, String idCliente, String numDeCuenta, double saldo) {
        this.nombre = nombre;
        this.idCliente = idCliente;

        this.cuentaBancaria = new CuentaBancaria2707(nombre, numDeCuenta, saldo);

        System.out.println("El cliente " + this.nombre + " ha creado exitosamente su cuenta bancaria.");
    }

    public void hacerDeposito(double monto){
        System.out.println("El cliente " + this.nombre + " esta depositando.");
        this.cuentaBancaria.depositar(monto);
    }

    public void hacerRetiro(double monto){
        System.out.println("El cliente " + this.nombre + " esta retirando.");
        this.cuentaBancaria.retirar(monto);
    }

    public void mostrarDetalles(){
        System.out.println("~~~ Información del cliente ~~~");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("ID Cliente: " + this.idCliente);
        System.out.println(this.cuentaBancaria.toString());
    }

    public CuentaBancaria2707 getCuentaBancaria(){
        return this.cuentaBancaria;
    }
}
