package com.designprinciples.lsp;

class Bird1 {
    public void fly() {
        System.out.println("I can fly");
    }
}

class Sparrow extends Bird1 {
    // Sparrow can fly so no issue here
}

class Penguin extends Bird1 {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly!");
    }
}


//What’s Wrong Here? (LSP Violation)
// - Penguin inherits fly() from Bird but cannot fulfill that behavior.
// - This breaks polymorphism → If we replace a Bird with a Penguin, the program might throw an exception.
// - Substituting a Penguin where a Bird is expected will cause unexpected failures.


public class LspViolation {

}
