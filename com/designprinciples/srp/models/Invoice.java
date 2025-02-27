package com.designprinciples.srp.models;

//class Invoice {
//    private String productName;
//    private int quantity;
//    private double price;
//
//    public Invoice(String productName, int quantity, double price) {
//        this.productName = productName;
//        this.quantity = quantity;
//        this.price = price;
//    }
//
//    // This method calculates the total price (Logical Responsibility 1)
//    public double calculateTotal() {
//        return quantity * price;
//    }
//
//    // This method prints the invoice (Logical Responsibility 2)
//    public void printInvoice() {
//        System.out.println("Invoice: " + productName + ", Quantity: " + quantity + ", Total: " + calculateTotal());
//    }
//
//    // This method saves the invoice to a database (Logical Responsibility 3)
//    public void saveToDatabase() {
//        System.out.println("Saving invoice for " + productName + " to database.");
//    }
//}


// GOOD SRP

// Class responsible for invoice data
class Invoice {
    private String productName;
    private int quantity;
    private double price;

    public Invoice(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public double calculateTotal() {
        return quantity * price;
    }

    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}

// Class responsible for printing invoices
class InvoicePrinter {
    public void printInvoice(Invoice invoice) {
        System.out.println("Invoice: " + invoice.getProductName() +
                ", Quantity: " + invoice.getQuantity() +
                ", Total: " + invoice.calculateTotal());
    }
}

// Class responsible for database operations
class InvoiceRepository {
    public void saveToDatabase(Invoice invoice) {
        System.out.println("Saving invoice for " + invoice.getProductName() + " to database.");
    }
}


