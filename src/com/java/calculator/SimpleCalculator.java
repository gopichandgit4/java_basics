package com.java.calculator;
import javax.jws.soap.SOAPBinding;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double value1, value2, result;
        char operator;
        System.out.println("WELCOME TO CALCULATOR");
        System.out.println("Enter the 1st value");
        value1 = input.nextDouble();
        System.out.println("Enter the operator (+, -, *, /");
        operator = input.next().charAt(0);
        System.out.println("Enter the 2nd value");
        value2 = input.nextDouble();
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
            if (value2 != 0){
                result = value1/value2;
            }
            else {
                System.out.println("Error - divided by 0 is not allowed");
                return;
            }
        }
        else {
            System.out.println("Error invalid operation");
            return;
        }
        System.out.println("Result = "+ result);
    }
}