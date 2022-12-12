package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {


    public static void main(String[] args) {


        int[] arr = {1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4};

        arr = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));


        System.out.println("-----------------------------------------");

        String[] words = {"Java", "Java", "Python", "C#", "Java", "Java"};

        words = removeDuplicates(words);

        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------------------");


        char[] ch = {'A','A','B','B','C','C'};

        ch= removeDuplicates(ch);

        System.out.println(Arrays.toString(ch));

        System.out.println("-----------------------------------------");

        double[] nums = {1.5,1.5,2.5,2.5,3.5,3.5};

        nums= removeDuplicates(nums);

        System.out.println(Arrays.toString(nums));


        System.out.println("-----------------------------------------");

        int[] numbers = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5};

        // numbers = Arrays.stream(numbers).distinct().toArray();

        // System.out.println(Arrays.toString(numbers));


    }

    // removes the duplicates from given array, returns the new array
    public static int[] removeDuplicates(int[] array) {

        int[] result = {};


        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }


        return result;

    }

    // removes the duplicates from given array, returns the new array
    public static double[] removeDuplicates(double[] array) {

        double[] result = {};


        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }


        return result;

    }

    // removes the duplicates from given array, returns the new array
    public static char[] removeDuplicates(char[] array) {

        char[] result = {};


        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }


        return result;

    }

    // removes the duplicates from given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};//{1,

        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

}