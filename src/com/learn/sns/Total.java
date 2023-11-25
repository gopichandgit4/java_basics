package com.learn.sns;

public class Total {
    public static void main (String[] args){
        int n = 5;
        int m = 10;
        Helper g = new Helper();
        int s = g.num(n,m);
        System.out.println("Total = " + s);
    }
}
