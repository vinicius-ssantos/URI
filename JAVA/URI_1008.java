package URI;

import java.util.Scanner;

public class URI_1008 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numHora = scan.nextInt();
        int salarioPorHora = scan.nextInt();
        double horasTrabalhadas = scan.nextDouble();
        double SALARY = salarioPorHora * horasTrabalhadas;


        System.out.printf("NUMBER = %d\n", numHora);
        System.out.printf("SALARY = U$ %.2f\n",SALARY);

    }
}
