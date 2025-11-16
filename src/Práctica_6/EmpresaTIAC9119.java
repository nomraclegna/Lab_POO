package Práctica_6;

import java.util.ArrayList;

public class EmpresaTIAC9119 {
    private ArrayList<EmpleadoAC> nomina;
    private String nombreDeEmpresa;

    public EmpresaTIAC9119(String nombreEmpresa) {
        this.nombreDeEmpresa = nombreEmpresa;
        this.nomina = new ArrayList<>();
    }

    public ArrayList<EmpleadoAC> getNomina() {
        return this.nomina;
    }

    public void contratarEmpleado(EmpleadoAC empleado) {
        this.nomina.add(empleado);
        System.out.println("Se ha contratado a " + empleado.getNombre() + " en " + this.nombreDeEmpresa);
    }

    public void pagarNomina() {
        System.out.println("\n~~~ Pagando Nómina de " + this.nombreDeEmpresa + " ~~~");
        double totalPagado = 0;
        for (EmpleadoAC emp : this.nomina) {
            double salario = emp.calcularSalario();
            System.out.println("Se le ha pagado a " + emp.getNombre() + ": $" + salario);
            totalPagado += salario;
        }

        System.out.println("Total pagado de nomina: $" + totalPagado);
    }

    public void procesarBonos() {
        System.out.println("\n~~~ Procesando Bonos ~~~");
        for (EmpleadoAC emp : this.nomina) {
            if (emp instanceof Bonificable27) {
                Bonificable27 empleadoBonificable = (Bonificable27) emp;
                double salario = emp.calcularSalario();
                double bono = empleadoBonificable.calcularBono(salario);

                System.out.println("Dando bono a " + emp.getNombre() + ": $" + bono);
            } else
                System.out.println(emp.getNombre() + " no es elegible para bonos este mes.");

        }
    }
}