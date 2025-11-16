package Práctica_5;

public class TrianguloCarmona extends Figura27 {

    private double lado1;
    private double lado2;
    private double lado3;

    public TrianguloCarmona(String color, double lado1, double lado2, double lado3) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        double s = (this.lado1 + this.lado2 + this.lado3) / 2.0;

        return Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));
    }

    @Override
    public double calcularPerimetro() {
        // Fórmula del perímetro: lado1 + lado2 + lado3
        return this.lado1 + this.lado2 + this.lado3;
    }

    public double calcularArea(double base, double altura) {
        System.out.println("Calculando área (base x altura / 2): " + base + "x" + altura);
        return (base * altura) / 2.0;
    }

    public double calcularArea(int base, int altura) {
        System.out.println("Calculando área (int base x altura / 2): " + base + "x" + altura);
        return (base * altura) / 2.0;
    }

    public void calcularArea(String mensaje) {
        System.out.println(mensaje + ", el área actual (Fórmula de Herón) es: " + this.calcularArea());
    }
}