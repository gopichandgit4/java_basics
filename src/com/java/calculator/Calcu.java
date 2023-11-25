package com.java.calculator;

import java.io.*;
public class Calcu {
    public static void main (String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double value1;
        double value2;
        double result = 0;
        char operator;
        System.out.println("WELCOME TO BUFFER READER CALCULATOR");
        System.out.println("Enter the 1st Value");
        value1 = Integer.parseInt(input.readLine());
        System.out.println("Enter the 2nd value");
        value2 = Integer.parseInt(input.readLine());
        System.out.println("Enter the operation (+, -, *, /");
        operator = (char) System.in.read();


        if (operator == '+'){
            result = value1+value2;
        }
        else if (operator == '-'){
            result = value1-value2;
        }
        else if (operator == '*'){
            result = value1*value2;
        }
        else if (operator == '/'){
            result = value1/value2;
        }
        System.out.println("RESULT = "+ result);
    }
}
