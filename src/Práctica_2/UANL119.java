package Práctica_2;

import java.util.ArrayList;

public class UANL119{
    private ArrayList<EstudianteAECL> list;

    public UANL119(){
        this.list = new ArrayList<>();
    }

    public void agregarEstudiante(EstudianteAECL estudiante){
        this.list.add(estudiante);
        System.out.println(estudiante.getNombre() + " se ha agregado a la lista.");
    }
    public void mostrarEstudiantes(){
        System.out.println("\n~~~ Lista de Estudiantes ~~~");

        for (EstudianteAECL estudiante : list){
            estudiante.mostrarDetalles();
        }

        if (list.isEmpty()){
            System.out.println("No hay registros.");
        }
    }

    public EstudianteAECL buscarEstudiante(String matricula) {
        for (EstudianteAECL estudiante : list) {

            if (estudiante.getMatricula().equals(matricula)) {
                System.out.println("Estudiante encontrado: " + estudiante.getNombre());
                return estudiante;
            }
        }

        System.out.println("Error: No se encontró ningún estudiante con la matrícula " + matricula);
        return null;
    }
}
