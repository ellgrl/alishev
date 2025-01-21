package testPackage;

import java.util.Scanner;

public class ClassForPresentation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(test(a, b));
    }

    public static String test(int a, int b) {
        if (a > b) {
            return "Первое число больше";
        } else if (a < b) {
            return "Второе число больше";
        } else {
            return "Числа равны";
        }
    }
}
