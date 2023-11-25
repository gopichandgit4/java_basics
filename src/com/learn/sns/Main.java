package com.learn.sns;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.age = 51;
        p2.age = 55;
        Person.age = 60;

        System.out.println("P1 age is " + p1);
        System.out.println("P2 age is " + p2);

    }
}
