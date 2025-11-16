package Práctica_5;

public abstract class Figura27 implements CalculableAECL {
    protected String color;

    public Figura27(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public abstract double calcularArea();

    @Override
    public abstract double calcularPerimetro();
}
