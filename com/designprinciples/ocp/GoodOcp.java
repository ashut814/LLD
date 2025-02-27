package com.designprinciples.ocp;


// Instead of modifying Invoice when adding new discount types, we should extend it by using polymorphism.
// We will create an abstract class DiscountStrategy, and each customer type will have its own discount logic in separate classes.

// Step 1: Define an abstract class for discount strategy

abstract  class DiscountStrategy {
    public abstract double calculateDiscount(double amount);
}


// Step 2: Create concrete classes for different discount strategies
class RegularDiscountStrategy extends DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.1; // 10% discount
    }
}

class PremiumDiscountStrategy extends DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.2; // 20% discount
    }
}

class VipDiscountStrategy extends DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.3; // 30% discount
    }
}


public class GoodOcp {
    private double amount;
    private DiscountStrategy discountStrategy;

    public GoodOcp(double amount, DiscountStrategy discountStrategy) {
        this.amount = amount;
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount() {
        return discountStrategy.calculateDiscount(amount);
    }

}
