package com.dio.br;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {

            int N = leitor.nextInt();

            int M = leitor.nextInt();

            int troco = M - N;

            int[] notas = {2, 5, 10, 20, 50, 100};

            boolean possivel = false;


            if (N == 0 && M == 0) break;


            for (int i = 0; i < 6; i++) {

                for (int j = 0; j < 6; j++) {

                    if (troco - notas[j] == notas[i]) possivel = true;

                }

            }


            if (possivel) System.out.println("possible");

            else System.out.println("impossible");

        }
    }}
//        Scanner leitor = new Scanner(System.in);
//
//        int QT = Integer.parseInt(leitor.nextLine());
//
//        String linha1[], linha2[], nome1, escolha1, nome2, escolha2;
//        int N, M;
//
//        for (int i = 0; i < QT; i++) {
//
//            //quebra string em várias substrings a partir de um caracter
//            linha1 = leitor.nextLine().split(" ");
//            linha2 = leitor.nextLine().split(" ");
//
//
//            N = Integer.parseInt(linha2[0]);
//            M = Integer.parseInt(linha2[1]);
//
//            nome1 = linha1[0];
//            escolha1 = linha1[1];
//
//            nome2 = linha1[2];
//            escolha2 = linha1[3];
//
//
//            if((N+M)%2==0 && escolha1.equalsIgnoreCase("par")&& escolha2.equalsIgnoreCase("impar")){
//                System.out.println(nome1+"  "+escolha1);
//            }
//            if((N+M)%2==0 && escolha1.equalsIgnoreCase("impar")&& escolha2.equalsIgnoreCase("par")){
//                System.out.println(nome2+"  "+escolha2);
//            }
//
//            if((N+M)%2==1 && escolha1.equalsIgnoreCase("impar")&& escolha2.equalsIgnoreCase("par")){
//                System.out.println(nome1+"  "+escolha1);
//            }
//            if((N+M)%2==1 && escolha1.equalsIgnoreCase("par")&& escolha2.equalsIgnoreCase("impar")){
//                System.out.println(nome2+"  "+escolha2);
//            }
//
//

//            if (((N + M) % 2 == 0 && escolha1.equalsIgnoreCase("PAR")) ||
//                  ( (N + M) % 2 == 1 && escolha2.equalsIgnoreCase("IMPAR")))
//                System.out.println(nome1);
//            else
//                System.out.println(nome2);

//        Scanner scan = new Scanner(System.in);
//-----------------------------
//        double x1,x2,y1,y2;
//        System.out.println("digite os valores");
//         x1 = Double.parseDouble(scan.next());
//         y1 = Double.parseDouble(scan.next());
//         x2 = Double.parseDouble(scan.next());
//         y2 = Double.parseDouble(scan.next());
//
//        double distancia;
//
//        double d1 = Math.pow((x2-x1),2);
//        double d2 = Math.pow((y2-y1),2);
//
//        distancia = Math.sqrt(d1+d2);
//
//        System.out.printf("%.4f", distancia);

            //System.out.println(raiz);

//         Gato gato = new Gato();
//        Livro livro = new Livro("Gato de botas", 2000);
//        System.out.println(gato);
//       int a = 6;
//        int b = 8;
//
//
//        System.out.println("Hello world! "+ (a+b));
//        }
//
//
//    }

//    class Livro {
//        private String nome;
//        private Integer numPags;
//
//        public Livro() {
//        }
//
//        public Livro(String nome, Integer numPags) {
//            this.nome = nome;
//            this.numPags = numPags;
//        }
//
//        public String getNome() {
//            return nome;
//        }
//
//        public void setNome(String nome) {
//            this.nome = nome;
//        }
//
//        public Integer getNumPags() {
//            return numPags;
//        }
//
//        public void setNumPags(Integer numPags) {
//            this.numPags = numPags;
//        }
//
//        @Override
//        public String toString() {
//            return "Livro{" +
//                    "nome='" + nome + '\'' +
//                    ", numPags=" + numPags +
//                    '}';
//        }
//    }
