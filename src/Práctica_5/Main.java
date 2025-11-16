package Práctica_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura27> misFiguras = new ArrayList<>();

        misFiguras.add(new CirculoCarmona("Rojo", 10.0)); // radio 10
        misFiguras.add(new RectanguloCarmona("Azul", 5.0, 8.0)); // base 5, altura 8
        misFiguras.add(new TrianguloCarmona("Verde", 5.0, 5.0, 5.0)); // Lados 5,5,5
        misFiguras.add(new CirculoCarmona("Amarillo", 1.0)); // radio 1

        CalculadoraGeometrica9119 calculadora = new CalculadoraGeometrica9119();

        System.out.println("~~~ Calculando Áreas Totales ~~~");
        double areaTotal = calculadora.calcularAreaTotal(misFiguras);
        System.out.println("El Área Total de todas las figuras es: " + areaTotal);

        System.out.println("\n~~~ Demostración de instanceof y Casting ~~~");

        for (Figura27 figura : misFiguras) {
            System.out.println("\nProcesando figura de color: " + figura.getColor());
            if (figura instanceof CirculoCarmona) {
                CirculoCarmona circuloEspecifico = (CirculoCarmona) figura;
                circuloEspecifico.calcularArea("Mensaje de prueba para sobrecarga");

            } else if (figura instanceof RectanguloCarmona) {
                RectanguloCarmona rectanguloEspecifico = (RectanguloCarmona) figura;
                System.out.println("Es un rectangulo");
                // Llamamos a la sobrecarga con dos ints
                double areaSimulada = rectanguloEspecifico.calcularArea(10, 10);
                System.out.println("Área simulada (10x10): " + areaSimulada);

            } else if (figura instanceof TrianguloCarmona) {
                TrianguloCarmona trianguloEspecifico = (TrianguloCarmona) figura;
                System.out.println("Es un triangulo");
                double areaAlt = trianguloEspecifico.calcularArea(6.0, 3.0);
                System.out.println("Área alternativa (base 6, alt 3): " + areaAlt);
            }
        }
    }
}