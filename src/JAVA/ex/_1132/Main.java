package JAVA.ex._1132;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x<y){
            for (int i=x;i<=y;i++){
                if (i%13!=0){
                    list.add(i);
                }
            }
        }
        if (y<x){
            for (int i=y;i<=x;i++){
                if (i%13!=0){
                    list.add(i);
                }
            }
        }
        System.out.println(list.stream().reduce(0, Integer::sum));
    }
}
