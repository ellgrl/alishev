package day1;

public class day1_5 {
    public static void main(String[] args) {
        int year = 1980;

        for (int i = 1; year < 2020; i++) {
            year = year + 4;
            System.out.println("Олимпиада " + year + " года");
        }
    }
}

