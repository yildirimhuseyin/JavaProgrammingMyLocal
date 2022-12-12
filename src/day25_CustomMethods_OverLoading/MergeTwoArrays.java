package day25_CustomMethods_OverLoading;
/*
Task1:
	1. create a method that can merge two integer arrays.  		

	2. create a method that can merge two double arrays.  	

	3. create a method that can merge two char arrays.   		

	4. create a method that can merge two String arrays.  
 */
import java.util.Arrays;

public class MergeTwoArrays {


    public static void main(String[] args) {





    }




    public static int[] mergeArrays(int[] arr1, int [] arr2){

        int [] merged = new int[arr1.length+ arr2.length];

        int i = 0;
        for (int each : arr1) {
            merged[i++] = each;
        }

        for (int each : arr2) {
            merged[i++] = each;
        }

        return merged;

    }

    public static double[] mergeArrays(double[] arr1, double [] arr2){

        double [] merged = new double[arr1.length+ arr2.length];

        int i = 0;
        for (double each : arr1) {
            merged[i++] = each;
        }

        for (double each : arr2) {
            merged[i++] = each;
        }

        return merged;

    }

    public static String[] mergeArrays(String[] arr1, String [] arr2){

        String [] merged = new String[arr1.length+ arr2.length];

        int i = 0;
        for (String each : arr1) {
            merged[i++] = each;
        }

        for (String each : arr2) {
            merged[i++] = each;
        }

        return merged;

    }

    public static char[] mergeArrays(char[] arr1, char [] arr2){

        char [] merged = new char[arr1.length+ arr2.length];

        int i = 0;
        for (char each : arr1) {
            merged[i++] = each;
        }

        for (char each : arr2) {
            merged[i++] = each;
        }

        return merged;

    }
}
