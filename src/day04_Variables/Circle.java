package day04_Variables;

/*

Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI
 */

public class Circle {

    public static void main(String[] args) {



        double radius = 10;


        double PI = 3.14;
        double diameters = radius * 2;
        double perimeter = 2 * radius *PI;
        double area = diameters * PI;

        System.out.println("PI = " + PI);
        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }



}
