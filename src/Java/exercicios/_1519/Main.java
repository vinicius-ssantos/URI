package Java.exercicios._1519;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
//        String texto = "hoje eu visitei meus pais";
//        String texto = "abcdef abc abc abc";
//        String texto = "tive que lavar meu cachorro pois ele estava fedendo";
//        String texto = "abcdef abc abc abcdefg abc abc abc abcdegfhi abc abcd abcdef";
        Scanner scan = new Scanner(System.in);
        while (true) {

            String texto = scan.nextLine();
            if (texto.contains(".")) {
                break;
            }
            String abrev = criarAbrev(texto);
            Map<String, String> mapAbrev = textoAbrevForMap(texto, abrev);
            String textoAbreviado = textoAbrevForString(mapAbrev, texto);

            System.out.println(textoAbreviado);
            printMap(mapAbrev);
        }
    }
    static void printMap(Map<String, String> map) {
        System.out.println(map.entrySet().size());
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e -> System.out.println(e.getKey() + ". = " + e.getValue()));
    }
    static String textoAbrevForString(Map<String, String> map, String texto) {
        String textoAbrevFinal = "";
        Map<String, String> mapAux = new LinkedHashMap<>(map);
        Iterator<String> textoIterator = Arrays.stream(texto.split(" ")).iterator();
        while (textoIterator.hasNext()) {
            String next = textoIterator.next();
            if (mapAux.containsValue(next)) {
                textoAbrevFinal += next.charAt(0) + ". ";
            } else if (!mapAux.containsValue(next)) {
                textoAbrevFinal += next + " ";
            }
        }
        textoAbrevFinal = textoAbrevFinal.substring(0, textoAbrevFinal.length() - 1);
        return textoAbrevFinal;
    }
    static Map<String, String> textoAbrevForMap(String strNormal, String strAbrev) {
        Map<String, String> maior = new LinkedHashMap<>();
        for (String str1 : strNormal.split(" ")) {
            String str1C = String.valueOf(str1.charAt(0));
            for (String str2 : strAbrev.split(" ")) {
                String str2C = String.valueOf(str2.charAt(0));
                if (str1C.equals(str2C) && str1.length() > str2.length() && str1.length() > 2) {
                    if (maior.isEmpty()) {
                        maior.put(str1C, str1);
                    } else if (maior.containsKey(str1C) && maior.get(str1C).length() < str1.length()) {
                        maior.put(str1C, str1);
                    } else if (!maior.containsKey(str1C)) {
                        maior.put(str1C, str1);
                    }
                }
            }
        }
        return maior;
    }
    static String criarAbrev(String s) {
        String nova = "";
        for (String string : s.split(" ")) {
            nova += string.charAt(0) + " ";
        }
        return nova;
    }
}

/*
Exemplo de Entrada
hoje eu visitei meus pais
tive que lavar meu cachorro pois ele estava fedendo
.
Exemplo de Saída
h. eu v. m. p.
4
h. = hoje
m. = meus
p. = pais
v. = visitei
t. q. l. m. c. p. ele e. f.
8
c. = cachorro
e. = estava
f. = fedendo
l. = lavar
m. = meu
p. = pois
q. = que
t. = tive

Blogs são muito populares hoje em dia, e há inclusive ferramentas que te permitem manter o seu
blog sem que você pague nada por isso. Rafael resolveu então criar um blog, onde irá arquivar
todas as suas experiências diárias de sua vida agitada.

Por mais que estas ferramentas sejam gratuitas, há porém um limite de caracteres que se pode
escrever por dia, e Rafael está preocupado que essa limitação o irá impedir de contar suas
melhores experiências. Decidiu então usar um sistema de abreviação de palavras em seus posts.

O sistema de abreviações funciona da seguinte maneira: para cada letra, é possível escolher
uma palavra que inicia com tal letra e que aparece no post. Uma vez escolhida a palavra, sempre
que ela aparecer no post, ela será substituída por sua letra inicial e um ponto, diminuindo
assim o número de caracteres impressos na tela.

Por exemplo, na frase: “hoje eu visitei meus pais”, podemos escolher a palavra “visitei” para
representar a letra 'v', e a frase ficará assim: “hoje eu v. meus pais”, economizando assim
cinco caracteres. Uma mesma palavra pode aparecer mais de uma vez no texto, e será abreviada
todas as vezes. Note que, se após uma abreviação o número de caracteres não diminuir, ela não
deve ser usada, tal como no caso da palavra “eu” acima.

Rafael precisa que seu post tenha o menor número de caracteres possíveis, e por isso pediu a
sua ajuda. Para cada letra escolha uma palavra, de modo que ao serem aplicadas todas as
abreviações, o texto contenha o menor número de caracteres possíveis.

Entrada
Haverá diversos casos de teste. Cada caso de teste é composto de uma linha, contendo uma frase
de até 10⁴ caracteres. A frase é composta de palavras e espaços em branco, e cada palavra é
composta de letras minúsculas ('a'-'z'), e contém entre 1 e 30 caracteres cada.

O último caso de teste é indicado quando a linha dada conter apenas um “.”, o qual não deverá
ser processado.

Saída
Para cada caso de teste, imprima uma linha contendo a frase já com as abreviações escolhidas
e aplicadas.

Em seguida, imprima um inteiro N, indicando o número de palavras em que foram escolhidas uma
letra para a abreviação no texto. Nas próximas N linhas, imprima o seguinte padrão “C. = P”,
onde C é a letra inicial e P é a palavra escolhida para tal letra. As linhas devem ser impressas
em ordem crescente da letra inicial.



        String texto = "hoje eu visitei meus pais";
        String texto = "tive que lavar meu cachorro pois ele estava fedendo";
        String texto = "abcdef abc abc abc abcdefg";



 */