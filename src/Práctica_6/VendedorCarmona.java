package Práctica_6;

public class VendedorCarmona extends EmpleadoAC implements Bonificable27 {
    private double salario;
    private double comision;

    public VendedorCarmona(String nombre, String idEmp, double salario, double comision) {
        super(nombre, idEmp);
        this.salario = salario;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return this.salario + this.comision;
    }

    @Override
    public double calcularBono(double salarioBase) {
        System.out.println("Calculando bono para Vendedor. ");
        return this.comision * 0.15;
    }

}