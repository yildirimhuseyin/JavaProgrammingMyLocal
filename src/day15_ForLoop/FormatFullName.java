package day15_ForLoop;

import java.util.Scanner;

/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */
public class FormatFullName {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name and last name: ");

        String firstName = scan.next();
        String lastName = scan.next();


       // firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase(); First way of doing this

        firstName = ("" +firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();

       lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();


        System.out.println(firstName+" "+ lastName );



scan.close();

    }
}
