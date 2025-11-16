package Práctica_10;

import java.util.ArrayList;
import java.util.List;

public class Buffer {

    private List<Integer> lista;
    private final int capacidad_max = 10;

    public Buffer() {
        this.lista = new ArrayList<>();
    }

    public synchronized void producir(int producto, String nombreProductor) throws InterruptedException {

        while (this.lista.size() == capacidad_max) {
            System.out.println("El buffer está lleno. " + nombreProductor + " debe esperar... ");
            wait();
        }

        this.lista.add(producto);
        System.out.println(nombreProductor + " produjo el ítem: " + producto + ". (Tamaño: " + this.lista.size() + ")");

        notifyAll();
    }

    public synchronized int consumir(String nombreConsumidor) throws InterruptedException {
        while (this.lista.isEmpty()) {
            System.out.println("El buffer se encuentra vacío. " + nombreConsumidor + " debe esperar... ");
            wait();
        }

        int producto = this.lista.remove(0);
        System.out.println(nombreConsumidor + " consumió el ítem: " + producto + ". (Tamaño: " + this.lista.size() + ")");

        notifyAll();

        return producto;
    }
}