package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;

    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;


    public Circle(double radius){ // Constructor block helps us to set the value of instance variable;

        this.radius = radius;
      //   pi = 3.14; // We CANNOT set static variable with in constructor block
    }

    static { // we are using static block in order to set static variables

       // radius = 23; // we cannot set instance variable with in static block

        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

    }

/*
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }

 */


}
