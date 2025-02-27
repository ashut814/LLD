package com.designprinciples.isp;

interface worker {
    void work();
    void eat();
}

class Programmer implements worker {
    public void work() {
        System.out.println("Coding...");
    }
    public void eat() {
        System.out.println("Eating...");
    }
}

class Robot implements worker {
    public void work() {
        System.out.println("Working...");
    }
    public void eat() {
        System.out.println("Eating...");
    }
}


public class violation {

}
