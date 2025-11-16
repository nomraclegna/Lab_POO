package Práctica_9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class GestorArchivosCarmona9119 {

    public void crearDirectorio(String nombreDirectorio) throws IOException {
        Path path = Paths.get(nombreDirectorio);
        if (!Files.exists(path)) {
            Files.createDirectories(path);
            System.out.println("Directorio creado: " + nombreDirectorio);
        } else {
            System.out.println("Directorio ya existe: " + nombreDirectorio);
        }
    }

    public void escribirArchivoTexto(String contenido, String nombreArchivo) throws IOException {
        Path path = Paths.get(nombreArchivo);
        Files.writeString(path, contenido);
        System.out.println("Escritura de texto exitosa en: " + nombreArchivo);
    }

    public String leerArchivoTexto(String nombreArchivo) throws IOException {
        Path path = Paths.get(nombreArchivo);
        if (!Files.exists(path)) {
            return "ERROR. Archivo no encontrado.";
        }
        return Files.readString(path);
    }

    public void guardarObjeto(PersonaASerializable persona, String archivo) throws IOException {
        try (java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(new java.io.FileOutputStream(archivo))) {
            oos.writeObject(persona);
            System.out.println("Serialización exitosa en: " + archivo);
        }
    }
    public PersonaASerializable cargarObjeto(String archivo) throws IOException, ClassNotFoundException {
        try (java.io.ObjectInputStream ois = new java.io.ObjectInputStream(new java.io.FileInputStream(archivo))) {
            return (PersonaASerializable) ois.readObject();
        }
    }

    public void escribirCSV(List<String> lineasCSV, String archivoCSV) throws IOException {
        Path path = Paths.get(archivoCSV);
        Files.write(path, lineasCSV);
        System.out.println("Escritura de datos CSV exitosa en: " + archivoCSV);
    }

    public String crearArchivoBackup(String nombreBase) throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String timestamp = LocalDateTime.now().format(formatter);

        String nombreArchivo = nombreBase + "_" + timestamp + ".dat";

        Files.createFile(Paths.get(nombreArchivo));
        System.out.println("Archivo de backup creado con timestamp: " + nombreArchivo);

        return nombreArchivo;
    }
}