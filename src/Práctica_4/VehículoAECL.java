package Práctica_4;

public class VehículoAECL {
    private String nombre;
    private String marca;
    private String modelo;
    private double costo;
    private boolean encendido;

    public VehículoAECL(String nombre, String marca, String modelo, double costo){
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
        this.encendido = false;
    }

    public void mostrarDetalles(){
        System.out.println("~~~ Detalles del vehiculo ~~~");
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Costo: $" + costo);
        String estado = this.encendido ? "Encendido" : "Apagado";
        System.out.println("Estado: " + estado);
    }

    public void arrancar() {
        if (this.encendido) {
            System.out.println(this.nombre + " ya estaba encendido.");
        } else {
            this.encendido = true;
            System.out.println("El vehículo " + this.nombre + " ha arrancado.");
        }
    }

    public void estado() {
        if (this.encendido) {
            System.out.println("El vehículo " + this.nombre + " está encendido.");
        } else {
            System.out.println(this.nombre + " está apagado.");
        }
    }

    public void apagar() {
        if (this.encendido) {
            this.encendido = false;
            System.out.println("El vehículo " + this.nombre + " se ha apagado.");
        } else {
            System.out.println(this.nombre + " ya está apagado.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCosto() {
        return costo;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
