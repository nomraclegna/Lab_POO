package Práctica_4;

public class MotocicletaCarmona extends VehículoAECL {
    private int cilindrada;
    private String tipoDeMotocicleta;

    public MotocicletaCarmona(String nombre, String marca, String modelo, double costo, int cilindrada, String tipoDeMotocicleta) {
        super(nombre,  marca, modelo, costo);

        this.cilindrada = cilindrada;
        this.tipoDeMotocicleta = tipoDeMotocicleta;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getTipoDeMotocicleta() {
        return tipoDeMotocicleta;
    }

    @Override
    public void arrancar() {
        System.out.println("La moto " + getMarca() + " ha arrancado.");
    }

    @Override
    public void estado() {
        System.out.println("La moto " + getMarca() + " está encendida.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();

        System.out.println("Cilindrada: " + this.cilindrada + "cc");
        System.out.println("Tipo de motocicleta: " + this.tipoDeMotocicleta);
    }
}
