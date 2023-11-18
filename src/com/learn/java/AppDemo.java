package com.learn.java;
import com.learn.java.Student;
import com.learn.java.Address;

import java.util.ArrayList;

public class AppDemo {

    public static void main (String[] args){
        MaxAgeWrapper maxAgeWrapper=new MaxAgeWrapper();
        Address addr1 = new Address("Gandhinagar", "Ongole", "Andhra", 523002);
        Address addr2 = new Address("Pragathinagar", "Ongole", "Andhra", 523001);
        Address addr3 = new Address("MM Road", "Ongole", "Andhra", 523002);

        Student s1 = new Student(1, "Hrithika", 9, addr1);
        Student s2 = new Student(2, "Chetan", 12, addr2);
        Student s3 = new Student(3, "Gopi", 24, addr3);
        Student s4 = new Student(4, "ABC", 26, addr2);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        for(Student stu:studentList) {
            maxAgeWrapper.insert(stu.getAge());
            System.out.println(stu);
        }
        System.out.println("maz age is:"+maxAgeWrapper.getMaxAge());
        System.out.println("no of students are:"+maxAgeWrapper.getElementsSize());
    }
}
