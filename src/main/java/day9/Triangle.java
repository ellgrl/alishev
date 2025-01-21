package day9;

import java.awt.*;

public class Triangle extends Figure {
    private double a, b, c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return Math.sqrt((perimeter() / 2) * ((perimeter()/2) - a) * ((perimeter()/2) - b) * ((perimeter()/2) - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
