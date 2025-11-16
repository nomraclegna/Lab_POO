package Práctica_10;

public class MainProductorConsumidor9119 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Runnable tareaProductor1 = new Productor9119(buffer, "Angel Carmona");
        Runnable tareaProductor2 = new Productor9119(buffer, "Alejandro Quintanilla");

        Runnable tareaConsumidor1 = new Consumidor9119(buffer, "Natalie Gonzáles");
        Runnable tareaConsumidor2 = new Consumidor9119(buffer, "John Hernández");

        Thread hiloP1 = new Thread(tareaProductor1);
        Thread hiloP2 = new Thread(tareaProductor2);
        Thread hiloC1 = new Thread(tareaConsumidor1);
        Thread hiloC2 = new Thread(tareaConsumidor2);

        System.out.println("~~~ Iniciando Simulación Productor-Consumidor ~~~");
        System.out.println("Capacidad del Buffer: 10");

        hiloP1.start();
        hiloP2.start();
        hiloC1.start();
        hiloC2.start();
    }
}
