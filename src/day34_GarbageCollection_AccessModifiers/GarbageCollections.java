package day34_GarbageCollection_AccessModifiers;


import day30_CostumClass.Dog;
import day31_Costructors.Student;
import day32_Consturctor.Car;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollections {

    public static void main(String[] args) {
/*
        // int a = null;
           String str = "";

        System.err.println(str.toUpperCase());
 */
        String str = "Wooden Spoon"; // after line 13, "Wooden Spoon" will be eligible for garbage collection
        str = null; // we are assigning str the null it is being usefull for the garbage collections

        System.out.println(str);


        System.out.println("-------------------------------------------------");

        Car car1 = new Car("Toyota");

        car1 = null;

        System.out.println(car1);

        System.out.println("-------------------------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

         dog1 = new Dog();
         dog1.name = "Max";

        System.out.println(dog1);

        System.out.println("-------------------------------------------------");


        String language = "Python"; // Python eligible for the garbage collector
        language = "Java";

        System.out.println(language);

        System.out.println("-------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(100,200,300));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2); //  == true // they are the same object

        System.out.println("-------------------------------------------------");

        Student student1 = new Student("Tahir", 30,'M','B',14);

        student1.grade = 'A';


        Student student2 = student1;

        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("-------------------------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");


        ArrayList<String> l2 = l1;
        l2.add("Python");

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
    }


}
