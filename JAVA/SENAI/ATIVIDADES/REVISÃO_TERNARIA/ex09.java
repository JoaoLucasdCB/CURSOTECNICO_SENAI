package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("o valor " + num1 + " é o maior");
        } else if (num2 > num1) {
            System.out.println("o valor " + num2 + " é o maior");
        } else System.out.println("os numeros sao iguais");
   scanner.close(); }
}