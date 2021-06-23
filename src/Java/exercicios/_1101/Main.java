package Java.exercicios._1101;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int valorM, valorN;
        while (((valorM = scan.nextInt()) > 0) && ((valorN = scan.nextInt()) > 0)) {
            int sum = 0;
            if (valorM > valorN) {
                for (int i = valorN; i <= valorM; i++) {
                    lista.add(i);
                }
            } else {
                for (int i = valorM; i <= valorN; i++) {
                    lista.add(i);
                }
            }
            int soma = lista.stream().reduce(0, Integer::sum);
            if (valorM > valorN) {
                for (int i = valorN; i <= valorM; i++) {
                    System.out.printf("%d ", i);
                }
            } else {
                for (int i = valorM; i <= valorN; i++) {
                    System.out.printf("%d ", i);
                }
            }
            System.out.printf("Sum=%d\n", soma);
            lista.clear();
        }
    }
}
