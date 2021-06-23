package Java.exercicios._1040;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        List<Double> lista = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            lista.add(scan.nextDouble());
        }
        double media = ((lista.get(0) * 2.0) + (lista.get(1) * 3.0) + (lista.get(2) * 4.0) + (lista.get(3) * 1.0)) / 10.0;
        System.out.println("Media: " + df.format(media));
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 7 && media >= 5) {
            lista.add(scan.nextDouble());
            double notaExame = lista.get(4);
            double mediaF = (media + notaExame) / 2;
            System.out.println("Aluno em exame.");
            System.out.println("Nota do exame: " + df.format(notaExame));
            System.out.println((mediaF > 5.0) ? "Aluno aprovado." : "Aluno reprovado.");
            System.out.println("Media final: " + df.format(mediaF));
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
