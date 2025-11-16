package Práctica_4;

import java.util.ArrayList;

public class Concesionaria9119 {
    private ArrayList<VehículoAECL> inventario;
    private String nombreConcesionaria;

    public Concesionaria9119(String nombre) {
        this.nombreConcesionaria = nombre;
        this.inventario = new ArrayList<>();
    }

    public ArrayList<VehículoAECL> getInventario() {
        return this.inventario;
    }

    public void agregarVehiculo(VehículoAECL vehiculo) {
        this.inventario.add(vehiculo);
        System.out.println("Se ha añadido un " + vehiculo.getNombre() + " al inventario.");
    }

    public void mostrarInventario() {
        System.out.println("\n~~~ Inventario de: " + this.nombreConcesionaria + " ~~~");
        for (VehículoAECL vehiculo : this.inventario) {
            vehiculo.mostrarDetalles();
        }
    }
}
