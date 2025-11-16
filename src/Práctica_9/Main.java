package Práctica_9;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorArchivosCarmona9119 gestor = new GestorArchivosCarmona9119();

        System.out.println("~~~ PRUEBA DE GESTOR DE ARCHIVOS (I/O) ~~~");

        try {
            gestor.crearDirectorio("Archivos_Prueba_9");

            String archivoTexto = "datos_9119.txt";
            String contenido = "Matricula,2069119\nNombre,Angel Carmona";
            gestor.escribirArchivoTexto(contenido, archivoTexto);

            System.out.println("\nContenido de " + archivoTexto + ":\n" + gestor.leerArchivoTexto(archivoTexto));

            PersonaASerializable persona = new PersonaASerializable("Luis Ortiz", 19, "contraseña");
            String archivoBinario = "backup_2707.dat";

            gestor.guardarObjeto(persona, archivoBinario);
            PersonaASerializable personaCargada = gestor.cargarObjeto(archivoBinario);

            System.out.println("\nSerialización: Objeto cargado -> " + personaCargada);

            List<String> datosCSV = Arrays.asList(
                    "Matricula,Nombre,Semestre",
                    "2069119,Angel Carmona,6",
                    "2121169,Luis Rolando,5"
            );
            String archivoCSV = "log_carmona.csv";
            gestor.escribirCSV(datosCSV, archivoCSV);

            String archivoBackupGenerado = gestor.crearArchivoBackup("datos_backup");
            System.out.println("Archivo de backup timestamped: " + archivoBackupGenerado);

        } catch (ClassNotFoundException e) {
            System.err.println("Error de Serialización: Clase no encontrada.");
        } catch (IOException e) {
            System.err.println("Error de I/O: " + e.getMessage());
            e.printStackTrace();
        }
    }
}