package MediasPonderadas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();
        int cont = 0;
        double result;
        while (cont < casos){

            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();

            // TODO: complete os espaços em branco com sua solução para o problema

            result = ((a*2) + (b*3)+ (c*5))/10;

            System.out.printf("%.1f " , result);
            cont++;
        }

    }
}
