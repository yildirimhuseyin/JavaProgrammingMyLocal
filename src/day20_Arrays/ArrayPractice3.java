package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length = scan.nextInt();// 5
        if (length<=0){
            System.out.println("Invalid entry");
            System.exit(0);
        }

        int[] numbers = new int[length]; // [10,20,0,0,50] // array needs to have enough capacity to contain all the element that user going to enter

        for (int i = 0; i <length ; i++) { // i: 0, 1 ....

            System.out.println("Enter a number");
             numbers[i]= scan.nextInt();//5// 10, 20. . . 50 // each input user provided during the execution of the loop
        }
        System.out.println(Arrays.toString(numbers));


            scan.close();

    }
}
