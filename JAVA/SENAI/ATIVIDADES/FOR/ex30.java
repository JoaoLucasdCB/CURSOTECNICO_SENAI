package FOR;

public class ex30 {
        public static void main(String[] args) {
            int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int pares = 0;
            int impares = 0;

            for (int numero : numeros) {
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

            System.out.println("Números pares: " + pares);
            System.out.println("Números ímpares: " + impares);
        }
    }
