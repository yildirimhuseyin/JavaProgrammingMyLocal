package day15_ForLoop;

import java.awt.*;
import java.util.Scanner;

/*
Write a program that asks the user to enter  number for 5 times return the minimum number
 */
public class MaximumNumber {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int maximumNumber = -2147483648; // this is the minimum number that user can enter



        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();


            if (num>maximumNumber){ // if the user entered number greater than current maximum number entered number  will be assigned to the maximum number
                maximumNumber = num;

            }

        }

        System.out.println("maximumNumber = " + maximumNumber);

        scan.close();

    }
}
