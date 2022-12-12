package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {


        int[] arr = {1,1,2,3,3,4,5,5,6,7,7,7};

        int[] unique = uniqueElements(arr);

        System.out.println(Arrays.toString(unique));

        double[] array = {1.5,2.5,1.5,3.5,4.5,4.5,5.5,5.5};

        double[] unique1 = uniqueElements(array);

        System.out.println(Arrays.toString(unique1));



    }

    // returns the unique elements of the array as a new array
    public static int [] uniqueElements(int [] array){

        int[] result = {};

        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is one, the elements is unique
               result = ArraysUtility.addElement(result,each);
            }

        }
       return result;
    }

    // returns the unique elements of the array as a new array
    public static double [] uniqueElements(double [] array){

        double[] result = {};

        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is one, the elements is unique
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static char [] uniqueElements(char [] array){

        char[] result = {};

        for (char each : array) {

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is one, the elements is unique
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static String [] uniqueElements(String [] array){

        String[] result = {};

        for (String each : array) {

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is one, the elements is unique
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

}
