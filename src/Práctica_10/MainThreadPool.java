package Práctica_10;

public class MainThreadPool {
    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Runnable tareaProductor1 = new Productor9119(buffer, "Angel Carmona");
        Runnable tareaProductor2 = new Productor9119(buffer, "Luis Ortiz");
        Runnable tareaProductor3 = new Productor9119(buffer, "John Hernández");
        Runnable tareaConsumidor1 = new Consumidor9119(buffer, "Jaime Zermeño");
        Runnable tareaConsumidor2 = new Consumidor9119(buffer, "Liliana Ramos");
        Runnable tareaConsumidor3 = new Consumidor9119(buffer, "Oscar Almaguer");

        ThreadPoolCarmona miPool = new ThreadPoolCarmona(5);

        System.out.println("~~~ Iniciando Simulación con ThreadPool ~~~");

        miPool.ejecutarTarea(tareaProductor1);
        miPool.ejecutarTarea(tareaConsumidor1);
        miPool.ejecutarTarea(tareaProductor2);
        miPool.ejecutarTarea(tareaConsumidor2);
        miPool.ejecutarTarea(tareaProductor3);
        miPool.ejecutarTarea(tareaConsumidor3);

        miPool.apagarPool();
    }
}