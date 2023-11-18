package com.learn.java;

public class MaxAgeWrapper {
    private  int maxAge;
    private int size;

    public  void insert(int age) {
        size++;
        if(age<=maxAge)
            return;
        maxAge=age;
    }

    public int getMaxAge() {
        return maxAge;
    }
    public int getElementsSize() {
        return size;

    }
}
