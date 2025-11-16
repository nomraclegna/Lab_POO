package Práctica_5;

public class CirculoCarmona extends Figura27 {

    private double radio;

    public CirculoCarmona(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (this.radio * this.radio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    public double calcularArea(double radioSimulado) {
        System.out.println("Calculando área con radio simulado: " + radioSimulado);
        return Math.PI * (radioSimulado * radioSimulado);
    }

    public double calcularArea(int radioSimulado) {
        System.out.println("Calculando área con radio simulado (entero): " + radioSimulado);
        return Math.PI * (radioSimulado * radioSimulado);
    }

    public void calcularArea(String mensaje) {
        System.out.println(mensaje + " el área actual es: " + this.calcularArea());
    }
}