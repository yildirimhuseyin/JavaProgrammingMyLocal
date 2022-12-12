package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {


    public static void main(String[] args) {


        int [] arr = {1,2,3,4,5};

        int[] reversed = reverse(arr);

        System.out.println(Arrays.toString(reversed));



    }
    // reverses given array,returns as a new array
    public static int[] reverse(int[] array){

        int[] result = {};

        for (int i = array.length-1; i >=0 ; i--) {

            result = ArraysUtility.addElement(result,array[i]);

        }
        return result;

    }


}
