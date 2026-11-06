package com.tuf;

//example of single responsibility principle
class SalaryCalculator {
    public double calculateSalary(double baseSalary, double bonus) {
        return baseSalary + bonus;
    }
}

class ReportGenerator {
    public void generateReport(double salary) {
        System.out.println("Salary Report: " + salary);
    }
}

public class SRP {
    public static void main(String[] args) {
        SalaryCalculator sc = new SalaryCalculator();
        double salary = sc.calculateSalary(50000, 5000);

        ReportGenerator rg = new ReportGenerator();
        rg.generateReport(salary);
    }
}
