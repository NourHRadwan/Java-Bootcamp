package com.company.OOP.Inhertance;


// Developer: Id, name, Salary, Framework
// Accountant: Id, name, Salary, CmaCertified
public class Developer {
    private int id;
    private String name;
    private double salary;
    private String FrameWork;

    Developer(int id, String name, double salary, String framwork)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.FrameWork = framwork;
    }

    public void setFrameWork(String frameWork) {
        FrameWork = frameWork;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getFrameWork() {
        return FrameWork;
    }

    public String getName() {
        return name;
    }

    public void view()
    {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("salary = " + salary);
        System.out.println("FrameWork = " + FrameWork);
    }

}
