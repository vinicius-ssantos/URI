package URI;

import java.util.Scanner;

public class URI_1038 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int cod = scan.nextInt();
            int qnt = scan.nextInt();
            double preco;

            switch (cod) {
                case 1:
                    preco = 4.00;
                    break;
                case 2:
                    preco = 4.50;
                    break;
                case 3:
                    preco = 5.00;
                    break;
                case 4:
                    preco = 2.00;
                    break;
                case 5:
                    preco = 1.50;
                    break;
                default:
                    return;
            }
            double total = preco * qnt;
            System.out.printf("Total: R$ %.2f\n", total);

    }
}
