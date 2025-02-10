package DO_WHILE;

public class ex04 {
    public static void main(String[] args) {
        int num = 10;
        do {

            num--;
            System.out.println(num);
            if (num == 1) {
                break;
            }

        } while (true); {
            System.out.println("o programa atingiu o numero 1 e encerrou");
        }


    }
}

