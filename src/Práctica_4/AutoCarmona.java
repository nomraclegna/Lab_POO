package Práctica_4;

public class AutoCarmona extends VehículoAECL {
    private int numDePuertas;
    private String tipoDeGasolina;

    public AutoCarmona(String nombre, String marca, String modelo, double costo, int numDePuertas,  String tipoDeGasolina) {
        super(nombre, marca, modelo, costo);
        this.numDePuertas = numDePuertas;
        this.tipoDeGasolina = tipoDeGasolina;
    }

    public int getNumDePuertas() {
        return numDePuertas;
    }
    public String getTipoDeGasolina() {
        return tipoDeGasolina;
    }

    @Override
    public void arrancar() {
        System.out.println("El auto " + getMarca() + " " + getModelo() + " ha arrancado.");
    }

    @Override
    public void estado() {
        System.out.println("El auto " + getMarca() + " " + getModelo() + " está en modo parking.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Puertas: " + this.numDePuertas);
        System.out.println("Combustible: " + this.tipoDeGasolina);
    }
}
