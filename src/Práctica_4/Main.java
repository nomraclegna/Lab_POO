package Práctica_4;

public class Main {
    public static void main(String[] args) {
        Concesionaria9119 miConcesionaria = new Concesionaria9119("Vehículos Carmona");
        AutoCarmona auto1 = new AutoCarmona("Jetta", "Volkswagen", "2024", 500000, 4, "Magna");
        MotocicletaCarmona moto1 = new MotocicletaCarmona("Ninja", "Kawasaki", "Ninja 400", 130000, 400, "Deportiva");
        CamionCarmona camion1 = new CamionCarmona("Tractor", "Kenworth", "T680", 2500000, 40, 6);
        System.out.println("--- Agregando Vehículos ---");
        miConcesionaria.agregarVehiculo(auto1);
        miConcesionaria.agregarVehiculo(moto1);
        miConcesionaria.agregarVehiculo(camion1);

        miConcesionaria.mostrarInventario();

        System.out.println("\n~~~ Arrancando todos los vehículos ~~~");
        for (VehículoAECL vehiculo : miConcesionaria.getInventario()) {
            vehiculo.arrancar();
        }
    }
}
