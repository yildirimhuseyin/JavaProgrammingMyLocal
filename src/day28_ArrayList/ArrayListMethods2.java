package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        // remove method continue

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        /*
        int num = 1;
        list.remove(num);
         */

        Integer num = 200;
       boolean r = list.remove(num);
        System.out.println(list);
        System.out.println(r);


        System.out.println("--------------------------------------------------------------------------------");
        //clear method: removes all the element from ArrayList


        list.clear();

        System.out.println(list.size());
        System.out.println(list);

        System.out.println("--------------------------------------------------------------------------------");


        ArrayList<Character> characters = new ArrayList<>();
        // indexOf(object) methods: finds first index of given object
        // lastIndexOf(object) methods: finds last index of given object
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');//index: 0
        int b = characters.lastIndexOf('A');// index: 0

        System.out.println("--------------------------------------------------------------------------------");
        // contains method: check if list contains given object or not and at the and it returns a boolean

        boolean r2 = characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println(r2);
        System.out.println(r3);


        System.out.println("--------------------------------------------------------------------------------");
        // equals() method: check every element in the same index  of two arrayList and returns boolean

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(100);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);


        System.out.println(list1 == list2); // false // we cannot use it like this as in the String
        System.out.println(list1.equals(list2));// true

        System.out.println("--------------------------------------------------------------------------------");
        // isEmpty() method: checks if the given array does not have any element or not


        list1.clear();
       boolean r4 = list1.isEmpty();

        System.out.println("r4 = " + r4);

        System.out.println("--------------------------------------------------------------------------------");
        // Bulk Operation: Collection type
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        System.out.println("numbers = " + numbers);








    }







}
