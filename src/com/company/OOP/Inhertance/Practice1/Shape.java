package com.company.OOP.Inhertance.Practice1;

// Height, width, getArea(), Draw)
//Rectangle (getArea(), Draw)
//Triangle

abstract class Shape {
    private int height;
    private int width;

    Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea() {
        return 0;
    }

    public void draw() {
        System.out.println("Invalid Shape");
    }


}
