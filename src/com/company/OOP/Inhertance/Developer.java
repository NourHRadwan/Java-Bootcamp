package com.company.OOP.Inhertance;


public class Developer extends Employee{

    private String framework;

    public Developer(int id, String name, double salary, String framework) {
        super(id, name, salary); // Call the superclass constructor
        this.framework = framework;
    }

    public void setFrameWork(String frameWork) {
        framework = frameWork;
    }


    public String getFrameWork() {
        return framework;
    }

    public void view()
    {
        super.view();
        System.out.println("FrameWork = " + framework);
        System.out.println("---------------------------------");
    }



}
