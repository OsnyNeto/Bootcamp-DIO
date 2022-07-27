package com.dio.br.metodosJava;

public class exercicio3 {


    /**
     *
     *
     * public class Main {
     *
     *     public static void main(String[] args) {
     *
     *         // Retornos
     *         System.out.println("Exercício retornos");
     *
     *         double areaQuadrado = Quadrilatero.area(3);
     *         System.out.println("Área do quadrado:" + areaQuadrado);
     *
     *         double areaRetangulo = Quadrilatero.area(5,5);
     *         System.out.println("Área do retângulo:" + areaRetangulo);
     *
     *         double areaTrapezio = Quadrilatero.area(7,8,9);
     *         System.out.println("Área do trapézio:" + areaTrapezio);
     *
     *     }
     * }
     * Classe de exemplo para o exercício da Aula 3 de Métodos.
     */
    public class Quadrilatero {

        public static double area(double lado) {

            return lado * lado;
        }

        public static double area(double lado1, double lado2) {

            return lado1 * lado2;
        }

        public static double area(double baseMaior, double baseMenor, double altura) {

            return ((baseMaior+baseMenor)*altura) / 2;
        }

        public static void xpto() {

            System.out.println("Antes");
            return;
        }

        public static double abc() {
            return 1.6;
        }

    }
}
