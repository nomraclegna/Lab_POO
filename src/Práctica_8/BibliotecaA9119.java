package Práctica_8;

import java.util.*;
import java.util.stream.Collectors;

public class BibliotecaA9119 {

    private List<Libro2707> librosDisponibles;

    private Queue<String> colaReservas;

    private Map<String, String[]> usuariosRegistrados;

    private Set<String> categoriasUnicas;

    public BibliotecaA9119() {
        this.librosDisponibles = new ArrayList<>();
        this.colaReservas = new LinkedList<>();
        this.usuariosRegistrados = new HashMap<>();
        this.categoriasUnicas = new HashSet<>();
    }

    public static class ComparadorPorAutor implements Comparator<Libro2707> {
        @Override
        public int compare(Libro2707 l1, Libro2707 l2) {
            return l1.getAutor().compareTo(l2.getAutor());
        }
    }

    public void agregarLibro(Libro2707 libro) {
        this.librosDisponibles.add(libro);
        this.categoriasUnicas.add(libro.getCategoria());
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public Libro2707 buscarLibro(int id) {
        return librosDisponibles.stream()
                .filter(l -> l.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean eliminarLibro(int id) {
        Libro2707 libro = buscarLibro(id);
        if (libro != null) {
            this.librosDisponibles.remove(libro);
            System.out.println("Libro eliminado: " + libro.getTitulo());
            return true;
        }
        return false;
    }

    public void hacerReserva(String matriculaUsuario) {
        this.colaReservas.offer(matriculaUsuario);
        System.out.println("Reserva de " + matriculaUsuario + " añadida a la cola.");
    }

    public String procesarReserva() {
        return this.colaReservas.poll();
    }

    public List<Libro2707> filtrarPorAutor(String autor) {
        System.out.println("~~~ Buscando libros por autor: " + autor + " ~~~");
        return librosDisponibles.stream()
                .filter(l -> l.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
    }

    public void mostrarCategoriasUnicas() {
        System.out.println("~~~ Categorías Únicas (HashSet) ~~~");
        this.categoriasUnicas.forEach(System.out::println);
    }

    public void mostrarLibrosOrdenNatural() {
        Collections.sort(librosDisponibles);
        System.out.println("\n~~~ Libros Ordenados por ID (Natural) ~~~");
        librosDisponibles.forEach(System.out::println);
    }

    public void mostrarLibrosOrdenPorAutor() {
        Collections.sort(librosDisponibles, new ComparadorPorAutor());
        System.out.println("\n~~~ Libros Ordenados por Autor (Comparator) ~~~");
        librosDisponibles.forEach(System.out::println);
    }

    public void registrarUsuario(String matricula, String nombre, String telefono) {
        String[] datos = {nombre, telefono};
        this.usuariosRegistrados.put(matricula, datos);
        System.out.println("Usuario " + nombre + " registrado con matrícula: " + matricula);
    }

    public String[] buscarUsuarioPorMatricula(String matricula) {
        return this.usuariosRegistrados.get(matricula);
    }

    public void medirTiempo(String operacion, int idLibro) {
        long inicio = System.nanoTime();
        String tipo = "";

        if (operacion.equalsIgnoreCase("busqueda_id")) {
            buscarLibro(idLibro);
            tipo = "Búsqueda Lineal";
        } else if (operacion.equalsIgnoreCase("eliminar_reserva")) {
            procesarReserva();
            tipo = "Procesar Reserva (O(1))";
        } else if (operacion.equalsIgnoreCase("busqueda_hash")) {
            buscarUsuarioPorMatricula("U-" + idLibro);
            tipo = "Búsqueda Hash (O(1))";
        }

        long fin = System.nanoTime();
        double tiempoMs = (fin - inicio) / 1_000_000.0;

        System.out.printf("Tiempo de %s: %.5f ms\n", tipo, tiempoMs);
    }

}