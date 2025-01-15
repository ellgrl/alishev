import java.util.Scanner;

public class Day2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = 0;

        if (x > -3 && x < 5) {
            y = (x + 3)*(x*x - 2);
            System.out.println("x = " + x + ", y = " + y);
        } else if (x >= 5) {
            y = (x*x - 10)/(x + 7);
            System.out.println("x = " + x + ", y = " + y);
        } else {
            y = 420;
            System.out.println("x = " + x + ", y = " + y);
        }

    }
}
