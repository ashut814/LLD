package com.designprinciples.lsp;

// LSP Fix

// Step1: Define an abstract class for Bird

abstract class Bird {
   public abstract void makeSound();
}

// Step2: sepreate Interface Flyable

interface Flyable {
    void fly();
}

// Step3: Implment Classes Properly

class Sparrow1 extends Bird implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("Sparrow makes a chirping sound");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin1 extends Bird implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("Penguin makes a squeaking sound");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly!");
    }
}


//Why is This Better?
//        ✅ Now, Penguin does not inherit fly(), so it doesn’t break the behavior.
//        ✅ We can still treat Sparrow as a Bird, but we use Flyable for flying behavior.
//        ✅ LSP is followed because we can safely substitute any Bird without breaking the system.
