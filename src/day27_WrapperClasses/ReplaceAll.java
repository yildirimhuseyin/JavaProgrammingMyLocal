package day27_WrapperClasses;

import java.util.Arrays;

/*
	2. RecplaceAll Task:
		2.1 Create a method named replaceAll that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
			Ex:
				arr = {10, 10, 20, 30, 40, 30, 30, 30};

				replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


		2.2 Create the same functions for double arrays, char arrays, and String arrays

 */
public class ReplaceAll {


    public static void main(String[] args) {

        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};

        arr = replaceAll(arr,30,300);


        System.out.println(Arrays.toString(arr));

        arr = replaceAll(arr, 300, 500);

        System.out.println(Arrays.toString(arr));

    }

    // replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldElement, int newElement){


        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldElement){
                array[i] = newElement;
            }

        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldElement, double newElement){


        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldElement){
                array[i] = newElement;
            }

        }
        return array;
    }


    // replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldElement, char newElement){


        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldElement){
                array[i] = newElement;
            }

        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldElement, String newElement){


        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(oldElement) ){
                array[i] = newElement;
            }

        }
        return array;
    }










}
