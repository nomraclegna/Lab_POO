package Práctica_10;

import java.util.Random;

public class Productor9119 implements Runnable {
    private final Buffer buffer;
    private final String nombre;

    public Productor9119(Buffer buffer, String nombre) {
        this.buffer = buffer;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            for (int i = 0; i < 10; i++) {
                int producto = random.nextInt(100);
                this.buffer.producir(producto, this.nombre);

                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {
            System.out.println(this.nombre + " fue interrumpido.");
        }
    }
}