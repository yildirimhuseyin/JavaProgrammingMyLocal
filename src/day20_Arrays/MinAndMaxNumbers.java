package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
1. create an array that has the numbers 1 to 100
	2. create an array that has the numbers 100 to 1
	3. Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number
 */
public class MinAndMaxNumbers {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {

            System.out.println("Enter a number:");
            nums[i] =  scan.nextInt();  // each user entered input will be assigned to the indexes of the array numbers
        }

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max = nums[i];
            }

            if (nums[i]<min){
                min = nums[i];
            }
        }

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("max = " + max);
        System.out.println("min = " + min);


        scan.close();

    }
}
