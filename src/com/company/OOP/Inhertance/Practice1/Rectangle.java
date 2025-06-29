package com.company.OOP.Inhertance.Practice1;

public class Rectangle extends Shape {

    public Rectangle(int height, int width) {
        super(height, width);
    }

    @Override
    public double CalculateArea() {
        return getHeight() * getWidth();
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}