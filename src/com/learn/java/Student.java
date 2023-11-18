package com.learn.java;

public class Student {
    int id ;
    String name ;
    int age;
    Address addr;

    public Student(){

    }
    public Student(int id, String name, int age, Address addr)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addr = addr;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addr=" + addr +
                '}';
    }
}