package Práctica_5;

public class RectanguloCarmona extends Figura27 {

    private double base;
    private double altura;

    public RectanguloCarmona(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * this.base) + (2 * this.altura);
    }

    public double calcularArea(double baseSimulada, double alturaSimulada) {
        System.out.println("Calculando área simulada (double): " + baseSimulada + "x" + alturaSimulada);
        return baseSimulada * alturaSimulada;
    }

    public double calcularArea(int baseSimulada, int alturaSimulada) {
        System.out.println("Calculando área simulada (int): " + baseSimulada + "x" + alturaSimulada);
        return baseSimulada * alturaSimulada;
    }

    public void calcularArea(String mensaje) {
        System.out.println(mensaje + ", el área actual es: " + this.calcularArea());
    }
}