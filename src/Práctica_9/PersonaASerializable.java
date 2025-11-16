package Práctica_9;

import java.io.Serializable;

public class PersonaASerializable implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nombre;
    private int edad;
    private transient String contraseña; //

    public PersonaASerializable(String nombre, int edad, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Persona{Nombre='" + nombre + "', Edad=" + edad + ", Contraseña='" + contraseña + "'}";
    }
}