package com.company.OOP.Inhertance;

public class Accountant {

    private int id;
    private String name;
    private double salary;
    private boolean cmaCertified;

    Accountant(int id, String name, double salary, boolean cmaCertified)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.cmaCertified = cmaCertified;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCmaCertified(boolean cmaCertified) {
        this.cmaCertified = cmaCertified;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void View()
    {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("salary = " + salary);
        System.out.println("cmaCertified = " + cmaCertified);
    }
}
