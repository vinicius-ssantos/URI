package JAVA.ex._1040;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class mainTeste {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
   //     double N1 = 2.0;
     //   double N2 = 4.0;
       // double N3 = 7.5;
       // double N4 = 8.0;

        //double N1 = 2.0;
       // double N2 = 6.5;
      //  double N3 = 4.0;
     //   double N4 = 9.0;

        double N1 = 9.0;
        double N2 = 4.0;
        double N3 = 8.5;
        double N4 = 9.0;
        double MEDIA = ((N1*2) + (N2*3) + (N3*4) + (N4*1)) / 10;
        System.out.println("Media: " + df.format(MEDIA));
        if (MEDIA >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (MEDIA < 7 && MEDIA >= 5) {
            System.out.println("Aluno em exame.");
            double NExame =  6.4;
            System.out.println("Nota do exame: " + df.format(NExame));
            MEDIA = (MEDIA + NExame) / 2;
            if (MEDIA >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + df.format(MEDIA));
        } else {
            System.out.println("Aluno reprovado.");
        }
    }

}
