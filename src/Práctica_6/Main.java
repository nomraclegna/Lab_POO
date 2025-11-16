package Práctica_6;

public class Main {
    public static void main(String[] args) {
        EmpresaTIAC9119 miEmpresa = new EmpresaTIAC9119("Riot Games");

        GerenteCarmona gerente = new GerenteCarmona("Angel Carmona", "2069119", 5000);

        DesarrolladorCarmona dev = new DesarrolladorCarmona("Luis Rolando", "2121169", "Java", 10000);

        VendedorCarmona vendedor = new VendedorCarmona("Oscar Almaguer", "2295844", 15000, 4000);

        System.out.println("~~~ Contrataciones ~~~");
        miEmpresa.contratarEmpleado(gerente);
        miEmpresa.contratarEmpleado(dev);
        miEmpresa.contratarEmpleado(vendedor);

        miEmpresa.pagarNomina();

        miEmpresa.procesarBonos();

        System.out.println("\n~~~ Evaluaciones y Promociones ~~~");

        for (EmpleadoAC emp : miEmpresa.getNomina()) {
            if (emp instanceof Evaluable07) {
                Evaluable07 evaluable = (Evaluable07) emp;
                System.out.println("Evaluación de " + emp.getNombre() + ": " + evaluable.evaluarDesempeño());
            }

            if (emp instanceof Promovible9119) {
                Promovible9119 promovible = (Promovible9119) emp;
                promovible.promover("Director de la Planta");
            }
        }
    }
}