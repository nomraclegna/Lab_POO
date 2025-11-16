package Práctica_6;

public abstract class EmpleadoAC {
    protected String nombre;
    protected String idEmp;
    protected String departamento = "Departamento 2707";

    public EmpleadoAC(String nombre, String idEmpleado) {
        this.nombre = nombre;
        this.idEmp = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void tomarVacaciones() {
        System.out.println("El empleado " + this.nombre + " está de vacaciones.");
    }

    public abstract double calcularSalario();
}