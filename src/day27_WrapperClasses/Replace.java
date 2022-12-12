package day27_WrapperClasses;

import java.util.Arrays;

/*
1. Replace Task:
		1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


		1.2 Create the same functions for double arrays, char arrays, and String arrays


 */
public class Replace {


    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5};

        arr=  replace(arr,2,30);

        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------------------");

        String[] arr2 = {"Java", "Python", "C++", "Ruby"};

        arr2 = replace(arr2, 2, "C#");

        System.out.println(Arrays.toString(arr2));


    }

    // replaces given index from given array with given number
    public static int[] replace(int[] array, int index, int element){

        if (index<0 || index> array.length-1){
            System.out.println("Invalid index: "+ index);
            System.exit(0);
        }

        array[index] = element;
        return array;

    }


    // replaces given index from given array with given number
    public static double[] replace(double[] array, int index, double element){

        if (index<0 || index> array.length-1){
            System.out.println("Invalid index: "+ index);
            System.exit(0);
        }

        array[index] = element;
        return array;

    }

    // replaces given index from given array with given number
    public static char[] replace(char[] array, int index, char element){

        if (index<0 || index> array.length-1){
            System.out.println("Invalid index: "+ index);
            System.exit(0);
        }

        array[index] = element;
        return array;

    }

    // replaces given index from given array with given number
    public static String[] replace(String[] array, int index, String element){

        if (index<0 || index> array.length-1){
            System.out.println("Invalid index: "+ index);
            System.exit(0);
        }

        array[index] = element;
        return array;

    }


}
