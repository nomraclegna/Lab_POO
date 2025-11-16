package Práctica_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BibliotecaA9119 biblioteca = new BibliotecaA9119();
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        biblioteca.agregarLibro(new Libro2707("Cien años de soledad", "García Márquez", 2069119, "Novela"));
        biblioteca.agregarLibro(new Libro2707("La bailarina de Auschwitz", "Edith Edger", 2121179, "Historia"));
        biblioteca.agregarLibro(new Libro2707("El Alquimista", "Paulo Coelho", 2121015, "Ficción"));
        biblioteca.agregarLibro(new Libro2707("El llamado de Chutulu", "H. P. Lovecraft", 2295844, "Terror"));

        biblioteca.registrarUsuario("2069119", "Angel Carmona", "8182070362");
        biblioteca.registrarUsuario("2295844", "John Hernandez", "8120246101");


        while (opcion != 0) {
            System.out.println("\n--- BIBLIOTECA CENTRAL (CLI) ---");
            System.out.println("1. Mostrar libros (Orden Natural)");
            System.out.println("2. Ordenar por Autor");
            System.out.println("3. Buscar y Filtrar (Streams)");
            System.out.println("4. Probar Reservas (Queue)");
            System.out.println("5. Ver Análisis de Complejidad (O(N) vs O(1))");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        biblioteca.mostrarLibrosOrdenNatural();
                        biblioteca.mostrarCategoriasUnicas();
                        break;
                    case 2:
                        biblioteca.mostrarLibrosOrdenPorAutor();
                        break;
                    case 3:
                        List<Libro2707> resultados = biblioteca.filtrarPorAutor("H. P. Lovecraft");
                        resultados.forEach(System.out::println);
                        break;
                    case 4:
                        biblioteca.hacerReserva("2069119");
                        biblioteca.hacerReserva("2295844");
                        System.out.println("Procesando la reserva más antigua: " + biblioteca.procesarReserva());
                        break;
                    case 5:
                        System.out.println("\n~~~ COMPARACIÓN DE RENDIMIENTO ~~~");
                        biblioteca.medirTiempo("busqueda_id", 2069119);
                        biblioteca.medirTiempo("busqueda_hash", 2295844);
                        biblioteca.medirTiempo("eliminar_reserva", 0);
                        break;
                    case 0:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } else {
                System.out.println("Entrada inválida. Intente de nuevo.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}