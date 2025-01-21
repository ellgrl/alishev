package day9;

import java.awt.*;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
    };

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
