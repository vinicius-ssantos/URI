package Java.exercicios._1024;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String texto = "Texto #3";
//        String texto= "abcABC1";
//        String texto= "vxpdylY .ph";
//        String texto= "vv.xwfxo.fd";

        String novaStr = stringToHex(texto);
        hexToString(novaStr);

    }

    private static void hexToString(String novaStr) {
        String result = new String();
        char[] charArray = novaStr.toCharArray();
        for (int i = 0; i < charArray.length; i = i + 2) {
            String st = "" + charArray[i] + "" + charArray[i + 1];
            char ch1 = (char) Integer.parseInt(st, 16);
            result = result + ch1;
        }
        System.out.println(result);
    }

    private static String stringToHex(String texto) {
        String novaStr = "";
        char ch[] = texto.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            String hexString = Integer.toHexString(ch[i]);
            novaStr += hexString;
        }
        System.out.println(novaStr.toString());
        return novaStr;
    }


}
