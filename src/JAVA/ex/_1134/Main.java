package JAVA.ex._1134;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int al = 0;
        int gas = 0;
        int die = 0;
        int x = 0;
        while (x != 4) {
            int valor1 = scan.nextInt();
            if ((valor1 >= 1 && valor1 <= 4)) {
                if (valor1 == 1) {
                    al++;
                } else if (valor1 == 2) {
                    gas++;
                } else if (valor1 == 3) {
                    die++;
                } else if (valor1 == 4) {
                    x = 4;
                }
            }
        }
        System.out.println("MUITO OBRIGADO\nAlcool: " + al + "\nGasolina: " + gas + "\nDiesel: " + die);
    }
}
