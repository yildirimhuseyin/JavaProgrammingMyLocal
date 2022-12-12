package day18_Nested_Loop;

import java.util.Scanner;
/*
2. Write a program that asks user to enter a number , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps
 */
public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true){
            System.out.println("Enter a number:");
            int number = scan.nextInt();

            if (number%2 ==0 ){
                System.out.println(number +" is even number");
            }else{
                System.out.println(number +" is odd number");
            }

            System.out.println("Would you like to enter another number?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || (answer.equals("no")))){ // If the answer is invalid
                System.err.println("Invalid entry, Would you like to enter another number?");
                answer = scan.next().toLowerCase();

            }

            if (answer.equals("no")){
                break;
            }
        }


    }

}
