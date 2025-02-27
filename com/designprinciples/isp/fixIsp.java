package com.designprinciples.isp;

// step1: create seprate interfaces

interface workable{
    public void work();
}
interface eatable{
    public void eat();
}

class Programmer1 implements workable, eatable{
    public void work(){
        System.out.println("Coding...");
    }
    public void eat(){
        System.out.println("Eating...");
    }
}


class Robot1 implements workable{
    public void work(){
        System.out.println("Working...");
    }
}


public class fixIsp {
}
