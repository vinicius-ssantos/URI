package Java.exercicios._1133;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x < y) {
            for (int i = x+1; i < y; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    list.add(i);
                }
            }
        }
        if (y < x) {
            for (int i = y+1; i < x; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    list.add(i);
                }
            }
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
