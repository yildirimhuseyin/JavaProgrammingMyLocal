package day04_Variables;
/*

 Create a class named Rectangle, write a program that can calculate the area & perimeter of any given square

						side
						area = side * side;            // the things that is necessary is only those info
						perimeter = 4 * side
 */
public class Rectangle {

    public static void main(String[] args) {

                         // lenght, width, area, perimeter
       double lenght = 10.5;
       double width = 5.5;

       double area = lenght * width;
       double perimeter = 2 * ( width + lenght);

        System.out.println("width = " + width);
        System.out.println("lenght = " + lenght);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);




    }


}
