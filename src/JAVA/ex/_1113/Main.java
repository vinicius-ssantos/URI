package JAVA.ex._1113;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valorM;
        int valorSenha = 2002;
        while ((valorM = scan.nextInt()) != valorSenha) {

            System.out.println("Senha Invalida");
        }
        System.out.println("Acesso Permitido");
    }
}
