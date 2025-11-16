package Práctica_4;

public class CamionCarmona extends VehículoAECL {
    private double capacidadDeCarga;
    private int numDeEjes;

    public CamionCarmona(String nombre, String marca, String modelo, double costo, double capacidadDeCarga, int numDeEjes) {
        super(nombre, marca, modelo, costo);
        this.capacidadDeCarga = capacidadDeCarga;
        this.numDeEjes = numDeEjes;
    }

    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public int getNumDeEjes() {
        return numDeEjes;
    }

    @Override
    public void arrancar() {
        System.out.println("El camión " + getMarca() + " está encendido.");
    }

    @Override
    public void estado() {
        if (isEncendido()) {
            System.out.println("El camión " + getMarca() + " está en ruta o listo para cargar.");
        } else {
            System.out.println("El camión " + getMarca() + " está estacionado y apagado.");
        }
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();

        System.out.println("Capacidad de carga: " + this.capacidadDeCarga + " toneladas");
        System.out.println("Número de ejes: " + this.numDeEjes);
    }
}
