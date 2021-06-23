package Java.exercicios._1024;

import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {
//        char c;  //Character Variable Declaration
//        for(int i=33;i<=126;i++) //Loop for printing A to Z character
//        {
//            c =(char)i; //Converting ASCII value to Character
//            System.out.println(i+"  =  "+c); //Displaying ASCII value and its equivalent Character
//        }
        Scanner scan = new Scanner(System.in);
        var string = "Texto #3";
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            String s = String.valueOf(c);


            System.out.print(s);
        }


    }
}
