import java.util.Scanner;

public class day2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a + 1; i <= b && i >= a; i++) {
           if (i % 5 == 0 && i % 10 != 0) {
               System.out.print(i + " ");
           }

        }

    }
}
