package Práctica_10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolCarmona {
    private final ExecutorService executor;
    private final int numDeTrabajadores;

    public ThreadPoolCarmona(int numTrabajadores) {
        this.numDeTrabajadores = numTrabajadores;
        this.executor = Executors.newFixedThreadPool(numTrabajadores);
        System.out.println("Se ha creado un pool de " + numTrabajadores + " hilos.");
    }

    public void ejecutarTarea(Runnable tarea) {
        this.executor.submit(tarea);
    }

    public void apagarPool() {
        System.out.println("Apagando el pool de hilos.");
        this.executor.shutdown();
    }
}