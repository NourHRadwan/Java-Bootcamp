package com.company.OOP.Inhertance.Practice1;

public class Triangle extends Shape {
    public Triangle(int height, int width) {
        super(height, width);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public double getArea() {
        return 0.5 * getHeight() * getWidth();
    }
}
