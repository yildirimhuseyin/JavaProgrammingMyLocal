package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {


    public static void main(String[] args) {
        // sort() method: sorts elements from given ArrayList in ascending order
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println("list = " + list);

        System.out.println("---------------------------------------------------------------");
        // reverse(): reverses the elements from given ArrayList

        ArrayList<Character> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList('A','B','C','D','E'));

        Collections.reverse(list1);
        System.out.println("list1 = " + list1);


        System.out.println("---------------------------------------------------------------");
        // swap(): swaps elements from given Arraylist

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(10,20,30,40,50,60,70));

        Collections.swap(list2,4,1);
        System.out.println("list2 = " + list2);

        System.out.println("---------------------------------------------------------------");
        // max(): gets max number from given Collection
        // min(): gets min number from given Collection

       int max = Collections.max(list2);
       int min = Collections.min(list2);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("---------------------------------------------------------------");
        // replaceAll(): replace all element with given element
        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(10,10,20,30,40,10,10,10));
        Collections.replaceAll(list3,10,1000);

        System.out.println("list3 = " + list3);

        System.out.println("---------------------------------------------------------------");
        // frequency(): finds frequency of given elements

        int frequency = Collections.frequency(list3,1000);

        System.out.println("frequency = " + frequency);

        System.out.println("---------------------------------------------------------------");

        ArrayList<String> words = new ArrayList<>();

        words.addAll(Arrays.asList("Java","Java","Python","Python","Ruby","C#"));

        int countJava = Collections.frequency(words,"Java");
        int countPython = Collections.frequency(words,"Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);







    }
}
