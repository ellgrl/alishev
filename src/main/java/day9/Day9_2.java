package day9;

import java.awt.*;

public class Day9_2 {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }
        public static double calculateRedPerimeter (Figure[]figures){
            double sum = 0;

            for (Figure figure : figures) {
                if (figure.getColor().equals("Red")) {
                    sum += figure.perimeter();
                }
            }
            return sum;
        }

        public static double calculateRedArea (Figure[]figures){
            double sum = 0;

            for (Figure figure : figures) {
                if (figure.getColor().equals("Red")) {
                    sum += figure.area();
                }
            }
            return sum;
        }

    }

