package com.company;

public class Main {

    public static void main(String[] args) {

        FixedSalaryWorker FixedSalaryWorker = new FixedSalaryWorker("Петро", 7500);
        HourlyWageWorker HourlyWageWorker = new HourlyWageWorker("Василь", 160, 39);

        FixedSalaryWorker.salary();
        HourlyWageWorker.salary();
    }
}
