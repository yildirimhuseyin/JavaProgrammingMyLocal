package day20_Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number

 */
public class AverageNumber {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many number would you like to enter?");
        int num = scan.nextInt();

        int [] numbers = new int[num];
        double sum = 0;


        for (int i = 0; i < num; i++) {
            System.out.println("enter a number");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }

        double averageNumber = sum/num;

        System.out.println("averageNumber = " + averageNumber);

        scan.close();
    }
}
