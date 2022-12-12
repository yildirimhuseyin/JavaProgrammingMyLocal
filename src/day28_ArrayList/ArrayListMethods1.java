package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------");
        // (array name).add method: adds elements to the arrayList

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);// 0
        numbers.add(20);// 1
        numbers.add(30);// 3
        numbers.add(40);// 4
        numbers.add(50);// 6
        numbers.add(60);// 7

        numbers.add(2,25); // add methods has inserting ability
        numbers.add(5,45); // index: 5

        System.out.println(numbers);


        System.out.println("--------------------------------------------------------------------");
        // size method: gives us the length of arrayList , like length methods in the String,

        System.out.println(numbers.size());

        int lastIndex = numbers.size()-1;

        System.out.println("lastIndex = " + lastIndex);

        System.out.println("--------------------------------------------------------------------");
        // get(index): gets element from given index

       int n1 = numbers.get(3);

        System.out.println("n1 = " + n1);

        System.out.println("--------------------------------------------------------");


        for (int i = 0; i <numbers.size() ; i++) { //We are getting every element from ArrayList

            System.out.println(numbers.get(i));

        }

        System.out.println("--------------------------------------------------------------------");
        // set(index, Data): replaces old elements with given data from given index



        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");


        list.set(2,"javaScript");
        list.set(3,"C++");
        System.out.println(list);


    }

}
