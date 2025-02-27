package com.designprinciples.srp.models;


// BAD SRP
//class User {
//    private String name;
//    private String email;
//
//    public User(String name, String email) {
//        this.name = name;
//        this.email = email;
//    }
//
//    public String getName() { return name; }
//    public String getEmail() { return email; }
//
//    // This method violates SRP because User should not handle report generation.
//    public void generateReport() {
//        System.out.println("Generating report for user: " + name);
//    }
//}


// GOOD SRP

// Class responsible for user data
class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
}

// Separate class for report generation
class ReportGenerator {
    public void generateUserReport(User user) {
        System.out.println("Generating report for user: " + user.getName());
    }
}



// What's Wrong here? ->  The User class should not handle report generation.
// It should have a separate class for report generation.
// If we need to change how reports are generated (e.g., switch from text to PDF), we will modify the User class, which should have nothing to do with reports.


// How to Fix? ->  Create a separate class for report generation.
// Move the report generation logic to a separate class.
// The User class should only handle user information and authentication.


