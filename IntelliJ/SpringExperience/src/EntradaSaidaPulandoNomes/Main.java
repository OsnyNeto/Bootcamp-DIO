package EntradaSaidaPulandoNomes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// complete os espaços em branco com sua solução para o problema
        String[] nomes = new String[10];

        for(int i=0 ; i<10 ; i++){
            System.out.println("Digite um nome: ");
            nomes[i] = sc.nextLine();
        }

        System.out.println(nomes[2]);
        System.out.println(nomes[6]);
        System.out.println(nomes[8]);
    }
}
