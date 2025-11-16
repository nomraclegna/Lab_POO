package Práctica_2;

public class Main {
    public static void main(String[] args) {
        EstudianteAECL AECL1 = new EstudianteAECL("Luis", "2050107", 19, "LCC", 5);
        EstudianteAECL AECL2 = new EstudianteAECL("Natalie", "1950620", 23);
        EstudianteAECL AECL3 = new EstudianteAECL();
        AECL3.setNombre("Alejandro");
        AECL3.setMatricula("1920654");
        EstudianteAECL AECL4 = new EstudianteAECL("Maria", "1861553", 25, "LMAD", 5);
        EstudianteAECL AECL5 = new EstudianteAECL("Liliana", "2065432", 20);
        UANL119 myUANL = new UANL119();

        myUANL.agregarEstudiante(AECL1);
        myUANL.agregarEstudiante(AECL2);
        myUANL.agregarEstudiante(AECL3);
        myUANL.agregarEstudiante(AECL4);
        myUANL.agregarEstudiante(AECL5);

        System.out.println("\n--- DEMOSTRACIÓN DE MÉTODOS ---");

        AECL1.mostrarDetalles();

        AECL2.cambiarCarrera("LMAD");

        AECL2.avanzarSemestre();

        AECL3.CumplirAños();

        System.out.println(AECL4.getNombre() + " tiene un estatus de: " + AECL4.getEstatus());

        EstudianteAECL encontrado = myUANL.buscarEstudiante("1950620");

        if (encontrado != null) {
            encontrado.avanzarSemestre();
        }

        myUANL.mostrarEstudiantes();
    }
}