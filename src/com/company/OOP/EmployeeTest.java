package com.company.OOP;

import java.time.LocalDate;

public class EmployeeTest {

        public static void main(String[] args) {

            //Employee objects

            com.company.OOP.Employee emp1 = new com.company.OOP.Employee("Nour", 100000, 2024, 10, 26);

            //Employee Array and fill it with employee objects
            com.company.OOP.Employee[] staff = new com.company.OOP.Employee[3];
            staff[0] = new com.company.OOP.Employee("Ahmed", 40000, 2023, 5, 10);
            staff[1] = new com.company.OOP.Employee("Mohamed", 50000, 2024, 5, 10);
            staff[2] = new com.company.OOP.Employee("Ahmed", 60000, 2025, 5, 10);


            //Raise Salary by 5%
            for(Employee e : staff)
            {
                e.raiseSalary(5);
            }

            //Print out information
            for (Employee e : staff)
            {
                System.out.println("Name: " + e.getName() + ", Salary" + e.getSalary() + ", Hire Date: " + e.getHireDay());
            }

        }
    }

    class Employee
    {

        //Consider the following very simplified version of the employee class
        //that might be used in writing a payroll system

        //instance field
        private String name;
        private double salary;
        private LocalDate hireDay;

        //Constructor
        public Employee(String n, double s, int year, int month, int day) {
            name = n;
            salary = s;
            hireDay = LocalDate.of(year, month, day);
        }

        // a method
        public String getName()
        {
            return name;
        }
        public double getSalary(){ return salary; }
        public LocalDate getHireDay()
        {
            return hireDay;
        }
        public void raiseSalary(double byPrecent)
        {
            double rise = salary + byPrecent / 100;
            salary += rise;
        }
    }


