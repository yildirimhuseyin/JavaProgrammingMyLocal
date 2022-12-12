package day18_Nested_Loop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your first number:");
            int firstNumber = scan.nextInt();

            System.out.println("Enter your second number:");
            int secondNumber = scan.nextInt();

            System.out.println("Addition = " + (firstNumber + secondNumber));


            System.out.println("Would you like to continue?");

            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no")) ){
                System.err.println("invalid entry! Please re-enter: ");
                a = scan.next().toLowerCase();
            }
            if (a.equals("no")) {
                break;
            }
        }

    }


}
