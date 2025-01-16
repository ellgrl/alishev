package day6;

public class Day6_1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("red");
        car.setYear(2020);
        car.setModel("Ford");

        Motorbike motorbike = new Motorbike(2011, "jaguar", "gold" );

        car.info();
        motorbike.info();

        System.out.println(car.yearDefference(2025)); ;
        System.out.println(motorbike.yearDefference(2025)); ;

    }
}
