package day11_Switch_Scanner;


import java.util.Scanner;

public class ScannerIntro {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer: ");

        int num1 = input.nextInt();

        System.out.println(num1);

        System.out.println("Enter the decimal: ");

        double num2 = input.nextDouble();

        System.out.println(num2);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: "+ (num2+num1));

        input.close(); // close the scanner, after this scanner cannot be used anymore

/**
        System.out.println("Enter a integer: ");

        int num3 = input.nextInt();
        System.out.println(num3);

*/

    }
}
