package Práctica_11;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Estudiante {

    private final StringProperty matricula;
    private final StringProperty nombre;
    private final StringProperty carrera;
    private final StringProperty semestre;

    public Estudiante(String matricula, String nombre, String carrera, String semestre) {
        this.matricula = new SimpleStringProperty(matricula);
        this.nombre = new SimpleStringProperty(nombre);
        this.carrera = new SimpleStringProperty(carrera);
        this.semestre = new SimpleStringProperty(semestre);
    }

    public StringProperty matriculaProperty() {
        return matricula;
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public StringProperty carreraProperty() {
        return carrera;
    }

    public StringProperty semestreProperty() {
        return semestre;
    }

    public String getMatricula() {
        return matricula.get();
    }

    public String getNombre() {
        return nombre.get();
    }
}