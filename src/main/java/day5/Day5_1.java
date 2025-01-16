package day5;

import java.awt.*;

public class Day5_1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("tesla");
        car.setColor("white");
        car.setYear(2006);
        System.out.println("Car color: " + car.getColor() + " Car year: " + car.getYear() + " Model : " + car.getModel());

    }
}
