package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {


    public static void main(String[] args) {

        // copyOf(array, newLength) methods: it will copy arrays

        String[] students = {"Elif","Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel" };

        String[] earlyBirds = Arrays.copyOf(students,5); // Copping from beginning to given index(given index gives us the length of new Array)

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers,5); // assigning to first 5(given number might change) elements to the array variable

        System.out.println("Numbers is: "+Arrays.toString(numbers));

        System.out.println("-------------------------------------------------------------------------");

        // copyOfRange(arrays,from number, to number(excluded) // we are getting an range of arrays from given arrays

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1,2,6+1);// If we want to end point we will add 1 to it

        System.out.println(Arrays.toString(ch2));

        System.out.println("-----------------------------------");
        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        //index:        0  1  2  3  4  5  6  7  8  9
        int[] result = Arrays.copyOfRange(scores,3,8 );


        System.out.println(Arrays.toString(result));

        System.out.println("-------------------------------------------------------------------");

        int[] result2 = Arrays.copyOfRange(scores,3,scores.length);

        System.out.println(Arrays.toString(result2));

    }
}
