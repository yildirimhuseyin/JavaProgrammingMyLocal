package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {


    public static void main(String[] args) {

        /*
        {1,2,3,4,5,6}
        {2,4,6,8,10,12}
        */
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {

            list.set(i, list.get(i)*2);

        }
        System.out.println(list);

        System.out.println("----------------------------------------------");
        // remove(index): Removes elements from given index and size of ArrayList decrease by 1
        // remove(object): Removes given object from ArrayList and ArrayList decreased by 1
        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(1);
        System.out.println(employees);

        employees.remove(employees.size()-1); // removes last element from array list
        System.out.println(employees);


       boolean r1 = employees.remove("Hulya");
        System.out.println(employees);

        boolean r2 = employees.remove("Neira");
        System.out.println(employees);


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


    }
}
