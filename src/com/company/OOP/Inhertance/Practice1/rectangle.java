package com.company.OOP.Inhertance.Practice1;

public class rectangle extends Shape{

    public rectangle(int height, int width) {
        super(height, width);
    }

    @Override
    public double getArea() {
        return getHeight()*getWidth();
    }

    @Override
    public void draw() {
        super.draw();
    }
}
