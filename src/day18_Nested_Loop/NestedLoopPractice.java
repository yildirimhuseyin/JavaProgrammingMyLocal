package day18_Nested_Loop;

import java.util.Scanner;

public class NestedLoopPractice {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your age:");
            int age = scan.nextInt();

            while (!(age>=18 && age <= 120)){ // while the age is ınvalid

                System.err.println("Invalid entry, please re-enter your age");
                age = scan.nextInt();

            }

            System.out.println("Would you like to continue");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))){ // while answer ins not yes or no go to the inside
                System.err.println("Invalid entry, please re-enter your age");
                System.out.println("Would you like to continue");
                 answer = scan.next().toLowerCase();
            }

            if (answer.equals("no")){
                break;
            }


        }

        scan.close();
    }
}
