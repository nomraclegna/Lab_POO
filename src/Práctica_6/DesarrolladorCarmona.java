package Práctica_6;

public class DesarrolladorCarmona extends EmpleadoAC implements Bonificable27, Evaluable07 {
    private String lenguajePrincipal;
    private int salarioBase;

    public DesarrolladorCarmona(String nombre, String idEmpleado, String lenguajePrincipal, int salarioBase) {
        super(nombre, idEmpleado);
        this.lenguajePrincipal = lenguajePrincipal;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase;
    }

    @Override
    public double calcularBono(double salarioBase) {
        System.out.println("Calculando bono para Desarrollador.");
        return salarioBase * 0.10;
    }

    @Override
    public String evaluarDesempeño() {
        return "El Desarrollador " + this.nombre + " (" + this.lenguajePrincipal + ") ha completado sus tareas.";
    }
}