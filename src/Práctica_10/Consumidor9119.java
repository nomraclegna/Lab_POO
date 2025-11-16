package Práctica_10;

import java.util.Random;

public class Consumidor9119 implements Runnable {

    // El recurso compartido
    private final Buffer buffer;
    private final String nombre;

    public Consumidor9119(Buffer buffer, String nombre) {
        this.buffer = buffer;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            for (int i = 0; i < 10; i++) {
                int producto = this.buffer.consumir(this.nombre);

                Thread.sleep(random.nextInt(2000)); // Hacemos que consuma más lento
            }
        } catch (InterruptedException e) {
            System.out.println(this.nombre + " fue interrumpido.");
        }
    }
}