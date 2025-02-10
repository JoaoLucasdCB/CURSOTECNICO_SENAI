package DO_WHILE;

import java.util.Scanner;

public class ex01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            do {
                System.out.println("Digite um número:");


                int num = sc.nextInt();


                while (num < 0) {
                    System.out.println("Número inválido! Digite um número positivo:");
                    num = sc.nextInt();
                }


                System.out.println("Você digitou: " + num);


                System.out.println("Deseja continuar? (s/n)");
                char escolha = sc.next().charAt(0);


                if (escolha == 'n' || escolha == 'N') {
                    break;
                }

            } while (true);

            System.out.println("Programa encerrado.");
        }
    }


