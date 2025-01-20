package day8;

public class Day8_1 {
    public static void main(String[] args) {
        String numbers = "";

        long before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            numbers = numbers + i + " ";
        }

        long after = System.currentTimeMillis();
        System.out.println("Времени затрачено: " + (after - before));

        System.out.println(numbers);

        StringBuilder Numbers = new StringBuilder("");

        long before1 = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            Numbers.append(i + " ");
        }

        long after1 = System.currentTimeMillis();
        System.out.println("Времени затрачено: " + (after1 - before1));

        System.out.println(Numbers.toString());
    }
}
