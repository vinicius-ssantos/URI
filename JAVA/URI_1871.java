package URI;

import java.lang.reflect.Type;
import java.util.Scanner;

public class URI_1871 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        while (s1.hasNext()) {
            int num1 = s1.nextInt();
            int num2 = s1.nextInt();

            int result = num1 + num2;
            String string = String.valueOf(result);
            String replace = string.replace("0", "");
            if (num1 == 0 && num2 == 0) {
                break;
            }
            System.out.println(replace);
        }


    }
}
