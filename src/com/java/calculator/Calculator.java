package com.java.calculator;
import java.util.Scanner;

public class Calculator {
    static {
        System.out.println("WELCOME TO CALCULATOR");
    }
    public static void main (String[] args){
        Scanner ct = new Scanner(System.in);
        System.out.println("Enter the 1st value");
        int a = ct.nextInt();
        System.out.println("Enter the 2st value");
        int b = ct.nextInt();
        System.out.println("Choose the Operation (+, -, *, /");
        char op = ct.next().charAt(0);
        solve(a, b, op);

    }
    public static int solve(int a, int b, char op){
        int ans = 0;
        if (op == '+'){
            ans = a+b;
        }
        else if (op == '-'){
            ans = a-b;
        }
        else if (op == '*'){
            ans = a*b;
        }
        else if (op == '/'){
            ans = a/b;
        }
        System.out.println("Result = " + ans);
        return ans;
    }
}
