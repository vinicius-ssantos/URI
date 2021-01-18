package URI;


import java.util.List;
import java.util.Scanner;

public class URI_1010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cod1 = scan.nextInt();
        int num1 = scan.nextInt();
        double val1 = scan.nextDouble();

        int cod2 = scan.nextInt();
        int num2 = scan.nextInt();
        double val2 = scan.nextDouble();

        double resultado = num1 * val1 + num2 * val2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", resultado);


    }
}
