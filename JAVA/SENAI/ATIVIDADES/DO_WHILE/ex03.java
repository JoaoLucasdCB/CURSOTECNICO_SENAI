package DO_WHILE;

public class ex03 {
    public static void main(String[] args) {
        int num = 0;
        do {

            num++;
            System.out.println(num);
            if (num == 10) {
                break;
            }

        } while (true); {
            System.out.println("o programa atingiu o numero 10 e encerrou");
        }


    }
}
