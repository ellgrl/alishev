package day9;

import java.awt.*;

public class Rectangle extends Figure {
    private double width, height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }
}
