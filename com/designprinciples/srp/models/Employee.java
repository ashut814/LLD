package com.designprinciples.srp.models;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }

//    public void saveToDatabase() {
//        System.out.println("Saving employee to database...");
//    }
//
//    public double calculateSalary() {
//        return salary * 1.10; // Adding 10% bonus
//    }
}




//A class should have only one reason to change.
//The Single Responsibility Principle states that a class should have only one job or responsibility. If a class has multiple responsibilities, then changes in one responsibility might affect the other. This leads to tightly coupled code, which is harder to maintain and extend.

//Why is SRP Important?

//- The Single Responsibility Principle is important because it helps in creating maintainable and testable code.
//- It also helps in separating concerns, making the code more modular and reusable.

//Less Coupling - The Single Responsibility Principle is important because it helps in creating loosely coupled code.

//More Cohesion - The Single Responsibility Principle is important because it helps in creating more cohesive code.

//More Testability - The Single Responsibility Principle is important because it helps in creating more testable code.

//More Reusability - The Single Responsibility Principle is important because it helps in creating more reusable code.

//More Maintainability - The Single Responsibility Principle is important because it helps in creating more maintainable code.

//More Readability - The Single Responsibility Principle is important because it helps in creating more readable code.

//More Efficiency - The Single Responsibility Principle is important because it helps in creating more efficient code.

