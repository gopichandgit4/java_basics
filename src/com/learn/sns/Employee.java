package com.learn.sns;

import javax.sound.midi.Soundbank;

public class Employee {

    public static void main (String[] args){
        Employee employee = new Employee();
        employee.greet("Gopi");
        employee.sayBye();
        System.out.println(getEmployeess());

    }
    static {
        System.out.println("Hello Employee");
    }
    public void greet(String name){
        System.out.println("hello "+ name);
    }
    public void sayBye(){
        System.out.println("Im Resigning");

    }
    public static String getEmployeess(){
        Employee employee = new Employee();
        employee.sayBye();
        System.out.println("Im Employee");
        return ("yep");
    }
    static String emp = getEmployeess();


}
