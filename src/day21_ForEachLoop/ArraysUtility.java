package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {


    public static void main(String[] args) {

        // toString() methods: converts string object(single dimensional) to string, returns string

        int[] nums = {1,2,3,4,5};

        System.out.println(nums); // Hashcode
        System.out.println(Arrays.toString(nums)); // "{1,2,3,4,5}"

        System.out.println(nums[0]); // this is an element and we don't need toString() methods to print it because it is an int

/*
        String str = "Java";
        System.out.println(str);
        System.out.println(str.toString());
 */

        // sort() methods: sorts the array in ascending order
        // ascending order : smallest to largest

        System.out.println("-----------------------------------------------------------------------");
        int[] scores = {95, 100, 55, 65, 85, 85, 78,};

        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);// {55,......100}

        System.out.println(Arrays.toString(scores));

        System.out.println("Min score: "+ scores[0]);
        System.out.println("Max score: "+ scores[scores.length-1]);


        String[] names  = {"Gunay", "Anna", "Zulal", "Ahmet0", "Maria", "Sinem"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));


        String[] words = {"Anna", "ANNA"};

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));

        System.out.println("----------------------------------------------------------------------------");

        //  equals(array1,array2): // compares if two array equals or not


        int [] arr1 = {1,2,3};
        int [] arr2 = {1,3,2};

        boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println(r1);

        Arrays.sort(arr1); // first we are sorting it to make it in same line
        Arrays.sort(arr2);

        Boolean r2 = Arrays.equals(arr1,arr2);

        System.out.println(r2);

        System.out.println("-----------------------------------------------------------------------");
        // anagram: two word that is written with same letter For ex. heart == earth
        // "acb" , "bac"
        char[] ch1 = {'a','c','b'};
        char[] ch2 = {'b','a','c'};

        Arrays.sort(ch1);// {'a', 'b', 'C'}
        Arrays.sort(ch2);// {'a', 'b', 'C'}

        boolean anagram = Arrays.equals(ch2,ch1);

        System.out.println(anagram);



        // copyOf(array, newLength) methods: it will copies arrays





    }
}
