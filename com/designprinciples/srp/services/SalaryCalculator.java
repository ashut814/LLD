package com.designprinciples.srp.services;

import com.designprinciples.srp.models.Employee;

public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        return employee.getSalary() * 1.10; // Adding 10% bonus
    }
}
