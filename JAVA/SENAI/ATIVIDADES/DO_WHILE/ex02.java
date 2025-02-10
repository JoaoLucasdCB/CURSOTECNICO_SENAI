package DO_WHILE;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: ");
            int num = sc.nextInt();
        if (num == 0) {
            System.out.println("Voce digitou 0 e encerrou a inserção de numeros");
            break;
            }
            System.out.println("Voce digitou o numero " + num );
        } while (true);


         }


}
