package com.company.OOP.Inhertance.Practice1;

public class Triangle extends Shape implements Calculator {
    public Triangle(int height, int width) {
        super(height, width);
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
    }

    @Override
    public double CalculateArea() {
        return 0.5 * getHeight() * getWidth();
    }


    @Override
    public void calcula() {
        System.out.println("Implement Calculator");
    }
}
