package com.company.OOP.Inhertance;

public class Accountant extends Employee{


    private boolean cmaCertified;

    Accountant(int id, String name, double salary, boolean cmaCertified)
    {
        super(id, name, salary);
        this.cmaCertified = cmaCertified;
    }

    public boolean isCmaCertified() {
        return cmaCertified;
    }

    public void setCmaCertified(boolean cmaCertified) {
        this.cmaCertified = cmaCertified;
    }


    public void View()
    {
        super.view();
        System.out.println("cmaCertified = " + cmaCertified);
        System.out.println("---------------------------------");
    }


}
