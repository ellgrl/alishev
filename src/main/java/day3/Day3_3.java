package day3;

import java.util.Scanner;

public class Day3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        while (counter < 5) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            counter++;
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);
            }
        }
    }

