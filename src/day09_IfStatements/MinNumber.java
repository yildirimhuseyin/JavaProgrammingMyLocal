package day09_IfStatements;

/*
1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number

            possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal
 */
public class MinNumber {


    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;

        boolean num1IsMin = num2>num1;
        boolean num2ISMin = num1>num2;
        boolean num1EqualNum2 = num1==num2;

        if (num1IsMin){ // if num1 is the minimum number

            System.out.println(num1+ " is minimum number");

        }

        if (num2ISMin){ // if num2 is the minimum number

            System.out.println(num2+ " is minimum number");
        }

        if (num1EqualNum2){ // If they are equal

            System.out.println(num1+" is equal to num "+ num2);
        }
    }
}
