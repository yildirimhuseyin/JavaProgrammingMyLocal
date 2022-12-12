package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

       // System.out.println("Enter true or false");

        // boolean result = input.nextBoolean();

        System.out.println("Enter your full name: ");
        String name = input.next(); // "next" only reads input until to the space


        System.out.println("name = " + name);


        input.close();
    }


}
