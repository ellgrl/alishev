package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        Random rand = new Random();

        for (int i = 0; i < arrayLength; i++)
            array[i] = rand.nextInt(10);

        System.out.println(Arrays.toString(array));

        int counter2 = 0;
         for (int i = 0; i < arrayLength; i++) {
             if (array[i] > 8)
                 counter2++;
         }
        System.out.println("Количество чисел больше 8 = " + counter2);

        int counter3 = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == 1)
                counter3++;
        }
        System.out.println("Количество чисел равных 1 = " + counter3);

        int counter4 = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] % 2 == 0)
                counter4++;
        }
        System.out.println("Количество четных чисел = " + counter4);

        int counter5 = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] % 2 != 0)
                counter5++;
        }
        System.out.println("Количество нечетных чисел = " + counter5);

        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            sum += array[i];
        }
        System.out.println("Сумма всех элементов = " + sum);

    }
}
