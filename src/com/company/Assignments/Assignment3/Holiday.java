package com.company.Assignments.Assignment3;

public class Holiday {

    //instance fields

    private String name; //name of the holiday
    private int day; //the day of the month of the holiday
    private String month; // the month the holiday is in

    // a) Constructor
    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    // b) inSameMonth method
    public boolean inSameMonth(Holiday other) {
        if (other == null) {
            return false;
        } else {
            return this.month.equals(other.month);
        }
    }


    // c) avgDate method
    public static double avgDate(Holiday[] holidays) {
        if (holidays.length == 0) {
            return 0;
        }
        int sumOfDays = 0;
        for (Holiday holiday : holidays) {
            sumOfDays += holiday.day;
        }
        return (double) sumOfDays / holidays.length;
    }

    public void printFormat() {
        System.out.println("Holiday name: " + this.name + "\nHoliday Date:" + this.day + " " + this.month);
    }

    public static void main(String[] args) {

        // d) Creating a Holiday instance
        Holiday IndependenceDayHoliday = new Holiday("Independence Day", 4, "July");

        Holiday EidDayHoliday = new Holiday("Eid Day", 6, "June");
        Holiday ArafatHoliday = new Holiday("Arafat Day", 5, "June");

        Holiday[] holidays = {IndependenceDayHoliday, EidDayHoliday, ArafatHoliday};

        double averageDay = avgDate(holidays);
        System.out.println("Average day of holidays: " + averageDay);

        System.out.println("All the holidays are: ");
        for (Holiday holiday : holidays) {
            holiday.printFormat();
        }

    }

}
