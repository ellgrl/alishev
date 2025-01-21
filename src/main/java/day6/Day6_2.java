package day6;

public class Day6_2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing",2001, 39, 50000);

        airplane.setYear(2005);
        airplane.setLength(44);

        airplane.fillUp(990);
        airplane.fillUp(1500);

        airplane.info();

    }
}
