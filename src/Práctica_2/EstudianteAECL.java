package Práctica_2;

public class EstudianteAECL {
    private String nombre;
    private String matricula;
    private int edad;
    private String carrera;
    private int semestreActual;

    public EstudianteAECL() {
        nombre = "Angel Emiliano Carmona Lozano";
        matricula = "2069119";
        edad = 20;
        carrera = "LCC";
        semestreActual = 5;
    }

    public EstudianteAECL(String nombre, String matricula, int edad){
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
    }

    public EstudianteAECL(String nombre, String matricula, int edad, String carrera, int semestreActual){
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
        this.carrera = carrera;
        this.semestreActual = semestreActual;
    }

    public String getNombre(){
        return nombre;
    }

    public String getMatricula(){
        return matricula;
    }

    public int getEdad(){
        return edad;
    }

    public String getCarrera(){
        return carrera;
    }

    public int getSemestreActual(){
        return semestreActual;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public void setSemestreActual(int semestreActual){
        this.semestreActual = semestreActual;
    }

    public void mostrarDetalles(){
        System.out.println("~~~ Detalles del estudiante ~~~");
        System.out.println("Nombre:" + this.nombre);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Edad: " + this.edad);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Semestre Actual: " + this.semestreActual);
    }

    public void avanzarSemestre(){
        this.semestreActual += 1;
        System.out.println(this.nombre + "ha avanzado al semestre " + this.semestreActual);
    }

    public void cambiarCarrera(String nuevaCarrera){
        setCarrera(nuevaCarrera);
        System.out.println(this.nombre + " ha cambiado a la carrera " + this.carrera);
    }

    public void  CumplirAños(){
        this.edad += 1;
        System.out.println(this.nombre + " ha cumplido " + this.edad + " años.");
    }

    public String getEstatus(){
        if(this.semestreActual == 0){
            return "No activo";
        } else {
            return "Activo";
        }
    }
}