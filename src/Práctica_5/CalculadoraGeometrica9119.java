package Práctica_5;

import java.util.ArrayList;

public class CalculadoraGeometrica9119 {
    public double calcularAreaTotal(ArrayList<Figura27> figuras) {
        double areaTotal = 0.0;
        for (Figura27 figura : figuras) {
            double areaDeLaFigura = figura.calcularArea();

            System.out.println("Calculando área de una figura de color " + figura.getColor() + ". \nÁrea = " + areaDeLaFigura);

            areaTotal = areaTotal + areaDeLaFigura;
        }

        return areaTotal;
    }
}