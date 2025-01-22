package day3;

import java.util.Scanner;

public class Day3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (b == 0) {
                break;
            }
            else {
                double c = a / b;
                System.out.println(c);
            }
        }
    }

}