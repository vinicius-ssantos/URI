package JAVA.ex._1116;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor1 = scan.nextInt();
        for (int i = 0; i < valor1; i++) {
            int valor2 = scan.nextInt();
            int valor3 = scan.nextInt();
            if (valor3 != 0) {
                double valor4 = (valor2*1.0) / (valor3*1.0);
                System.out.println(valor4);
            } else {
                System.out.println("divisao impossivel");
            }
        }
    }
}
