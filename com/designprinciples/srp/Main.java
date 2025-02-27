package com.designprinciples.srp;

import com.designprinciples.srp.models.Employee;
import com.designprinciples.srp.services.SalaryCalculator;
import com.designprinciples.srp.repositories.EmployeeRepository;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 50000);
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        EmployeeRepository employeeRepository = new EmployeeRepository();

        double updatedSalary = salaryCalculator.calculateSalary(emp);
        System.out.println("Updated Salary: " + updatedSalary);

        employeeRepository.saveToDatabase(emp);
    }
}
