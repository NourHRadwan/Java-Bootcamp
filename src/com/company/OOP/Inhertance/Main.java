package com.company.OOP.Inhertance;

public class Main {

    public static void main(String[] args) {
        Developer[] developers = {
                new Developer(1, "D1", 5000.00, "IOS"),
                new Developer(2, "D2", 5000.00, "Flutter"),
                new Developer(3, "D3", 5000.00, "Java")
        };

        Accountant[] accountants = {
                new Accountant(1, "Acc1", 5000.00, true),
                new Accountant(1, "Acc2", 6000.00, false),
                new Accountant(1, "Acc3", 7000.00, true),
        };

        viewAllEmployee(accountants, developers);
    }

    public static void viewAllEmployee(Accountant accountant[], Developer developer[]) {
        for (Developer developer1 : developer) {
            developer1.view();
        }
        for (Accountant accountant1 : accountant) {
            accountant1.View();
        }
    }
}
