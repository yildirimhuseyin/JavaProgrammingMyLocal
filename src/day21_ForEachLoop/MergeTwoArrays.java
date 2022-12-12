package day21_ForEachLoop;

import java.util.Arrays;

/*
Task
  1. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}

 */
public class MergeTwoArrays {


    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};

        int[] arr3 = new int[arr1.length+arr2.length];

        int i = 0;
        for (int each : arr1) { // after this loops finish executing then compiler goes to the second loop
            arr3[i++] = each;
        }

        for (int each : arr2) {
            arr3[i++] = each;
        }


        System.out.println(Arrays.toString(arr3));


        System.out.println("---------------------------------------------");


        char[] ch1 = {'A','B', 'C'};
        char[] ch2 = {'D','E','F','G', 'H'};

        char[] chars = new char[ch1.length+ ch2.length];

        int j =0;
        for (char each : ch1) {
            chars[j] = each;
            j++;
        }

        for (char each : ch2) {
            chars[j] = each;
            j++;
        }

        System.out.println(Arrays.toString(chars));



    }
}
