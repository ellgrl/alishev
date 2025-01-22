package day2;

import java.util.Scanner;

public class Day2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b){
            System.out.println("Некорректный ввод");
        }
        int i = 0;
        while (a > 0 && b > 0 && i < b) {
            if ( i % 5 == 0 && i % 10 != 0 && i > a) {
                System.out.println(i);
            }
            i++;
        }
    }
}
