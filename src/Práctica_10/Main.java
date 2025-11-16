package Práctica_10;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaCompartida = new CuentaBancaria(1000.0);
        System.out.println("Saldo inicial: $" + cuentaCompartida.getSaldo());
        System.out.println("~~~ Inicia la simulación ~~~");

        CajeroThread27 cajero1 = new CajeroThread27("Cajero 1 (Thread)", cuentaCompartida, 500.0);

        Runnable tareaCliente1 = new ClienteRunnable07("Angel Carmona (Runnable)", cuentaCompartida, 200.0);

        Thread hiloCliente1 = new Thread(tareaCliente1);

        CajeroThread27 cajero2 = new CajeroThread27("Cajero 2 (Thread)", cuentaCompartida, 300.0);

        Runnable tareaCliente2 = new ClienteRunnable07("Jaime Zermeño (Runnable)", cuentaCompartida, 100.0);
        Thread hiloCliente2 = new Thread(tareaCliente2);

        CajeroThread27 cajero3 = new CajeroThread27("Cajero 3 (Fallo)", cuentaCompartida, 800.0);

        cajero1.start();
        hiloCliente1.start();
        cajero2.start();
        hiloCliente2.start();
        cajero3.start();

        try {
            cajero1.join();
            hiloCliente1.join();
            cajero2.join();
            hiloCliente2.join();
            cajero3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("~~~ Simulación terminada ~~~");
        System.out.println("Saldo final en la cuenta: $" + cuentaCompartida.getSaldo());
    }
}