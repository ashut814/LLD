package com.designprinciples.srp.repositories;

import com.designprinciples.srp.models.Employee;

public class EmployeeRepository {
    public void saveToDatabase(Employee employee) {
        System.out.println("Saving employee: " + employee.getName() + " to database...");
    }
}
