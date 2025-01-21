package day4;

import java.util.Random;

public class Day4_4 {
    public static void main(String[] args) {
        int[] Array = new int[100];
        Random r = new Random();

        for (int i = 0; i < Array.length; i++)
            Array[i] = r.nextInt(10000);

        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < Array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += Array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }

        System.out.println(maxSumIndex);
    }
}
