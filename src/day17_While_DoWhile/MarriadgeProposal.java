package day17_While_DoWhile;

import java.util.Scanner;

/*
1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
 */
public class MarriadgeProposal {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me? yes/no");
        String answer = scan.next().toLowerCase();


        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Congrats.");
        } else {
            while (!(answer.equals("no") || (answer.equals("yes")))) {

                System.out.println("Invalid answer, please re-enter");
                System.out.println("Will you marry me? yes/no");
                answer = scan.next();

            }


            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Goodbye");
            }
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Congrats.");


                scan.close();


            }

        }
    }
}
