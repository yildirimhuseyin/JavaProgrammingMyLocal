package day12_Scanner;

import java.util.Scanner;

/*

1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )
3. Enter your street name ( nextLine() )
4. Enter your city name ( nextLine() )
5. Enter your State ( next() )
6. Enter your zip code ( next() )
 */
public class ShippingAddress{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
       String name = input.nextLine();

        System.out.println("Enter your building number: ");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter your street name: ");
       String streetName = input.nextLine();

        System.out.println("Enter your city name:");
        String cityName = input.nextLine();

        System.out.println("Enter your State:");
        String state = input.next();
        input.nextLine();
        System.out.println("Enter your zip code:");
        String zip = input.next();

        input.nextLine();

        System.out.println("Enter your country");
        String country = input.nextLine();






        System.out.println(name+ "\n" + buildingNumber + " " + streetName +" "+ "\n" + cityName+ " " + state+" "+ zip+ "\n"+ country );


        input.close();

    }

}
