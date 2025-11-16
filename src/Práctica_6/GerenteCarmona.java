package Práctica_6;

public class GerenteCarmona extends EmpleadoAC implements Bonificable27, Evaluable07, Promovible9119 {
    private double bonoGerencial;

    public GerenteCarmona(String nombre, String idEmpleado, double bonoGerencial) {
        super(nombre, idEmpleado);
        this.bonoGerencial = bonoGerencial;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = 50000;
        return salarioBase + this.bonoGerencial;
    }

    @Override
    public double calcularBono(double salarioBase) {
        System.out.println("Calculando bono para el gerente.");
        return (salarioBase * 0.20) + this.bonoGerencial;
    }

    @Override
    public String evaluarDesempeño() {
        return "El Gerente " + this.nombre + " ha tenido un gran desempeño.";
    }

    @Override
    public void promover(String nuevoPuesto) {
        System.out.println("El Gerente " + this.nombre + " ha sido promovido a " + nuevoPuesto);
    }
}