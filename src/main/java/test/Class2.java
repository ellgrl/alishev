package test;
// ввести в консоль два числа и показать их отношение (больше, меньше, равно).
// выводить в консоль соответствующий результат
//для определения нужен отдельный метод

import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {

        System.out.println(textModifier());
    }
        public static String textModifier() {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b) {
                return ("Число а больше, чем число b");
            } else {
                if (a < b) {
                    return ("Число а меньше,чем число b");
                }
                    return ("Числа a и b равны");

            }

        }

    }

