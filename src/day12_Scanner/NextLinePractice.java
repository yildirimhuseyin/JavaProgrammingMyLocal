package day12_Scanner;

import java.util.Scanner;

/*
  1. Ask user to enter the age
  2. Ask user to enter full name
 */
public class NextLinePractice {



    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = input.nextInt(); // 19

        input.nextLine();// Enter

        System.out.println("Enter your full name: ");
       String name = input.nextLine();

        System.out.println("Enter your GPA: ");
        double gpa = input.nextDouble();

        input.nextLine(); // Enter

        System.out.println("Enter School name: ");
       String schoolName = input.nextLine();


        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

        input.close();

    }



}
