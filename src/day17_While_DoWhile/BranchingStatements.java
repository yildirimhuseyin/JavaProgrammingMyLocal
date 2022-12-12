package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {


    public static void main(String[] args) {


        for (char i = 'A'; i < 'Z'; i++) {

            System.out.print(i);
            if (i == 'F'){ // exits the loop

                break;

            }


        }


        System.out.println(); // to make new line after the print statement
        Scanner scan = new Scanner(System.in);




        System.out.println("------------------------------");

        while (true){
            System.out.println("Enter a number: ");
           int num = scan.nextInt();


           if (num<0){
               break;
           }



        }


        scan.close();
    }
}
