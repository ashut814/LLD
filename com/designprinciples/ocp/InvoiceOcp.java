package com.designprinciples.ocp;
// OCP Violation ->

class InvoiceOcp {
    private double amount;
    private String customerType; // Can be "Regular" or "Premium"

    public InvoiceOcp(double amount, String customerType) {
        this.amount = amount;
        this.customerType = customerType;
    }

    public double calculateDiscount() {
        if (customerType.equals("Regular")) {
            return amount * 0.1; // 10% discount
        } else if (customerType.equals("Premium")) {
            return amount * 0.2; // 20% discount
        }
        return 0;
    }
}

// What’s Wrong Here? (OCP Violation)
//- The Invoice class is tightly coupled to the discount calculation logic.
//- If we want to add a new discount type, we need to modify the Invoice class to add a new condition.
//This violates OCP because we are modifying the class whenever we add new behavior.
//It makes the class harder to maintain and test.




//The Open/Closed Principle states that once a class is developed and tested, it should not be modified to add new functionality. Instead, you should be able to extend it to introduce new behavior.

// Why is this Important? ->

//✅ Prevents breaking existing code when adding new features.
//✅ Encourages scalability by allowing extension instead of modification.
//✅ Makes code more maintainable since old code remains untouched