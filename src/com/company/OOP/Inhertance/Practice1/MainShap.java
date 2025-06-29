package com.company.OOP.Inhertance.Practice1;

public class MainShap {
    public static void main(String[] args) {

        Triangle Tri1 = new Triangle(10, 12);
        Tri1.CalculateArea();
        Tri1.draw();
        Tri1.calcula();

        Rectangle Rec1 = new Rectangle(5,5);
        Rec1.draw();
        Rec1.CalculateArea();

        Shape e = new Rectangle(5, 10);
        System.out.println(e);


        Calculator cal = new Calculator() {
            @Override
            public void calcula() {
                System.out.println("-1");
            }
        };

        cal.calcula();
    }
}

interface Calculator{
    void calcula();
}
