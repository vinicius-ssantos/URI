package URI;

import java.util.Scanner;

public class URI_1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = 0;
        int contador = -1;
        for (int i = 1; i <=100; i++) {
            int num = scanner.nextInt();
            if (maior > num) {
                maior = maior;
            } else {
                maior = num;
                contador = i;
            }
        }
        System.out.println(maior);
        System.out.println(contador);
    }
}
