package day08_IfStatments;
/*
Write a program that can print the number of days in a month

			Ex:
				number = 1 ~ 12;

			output:
				31 Days


			Hints:
				Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
				Months that has 30 days: 4, 6, 9, 11
				Month that has 28 days: 2
 */
public class NumberOfDaysInAMont {

    public static void main(String[] args) {

        int  number = 1;

        boolean has28Days = number == 2; // for the mount has 28 days
        boolean has30Dasy = number == 4 || number == 6 || number == 9 || number == 11;// for the mount that has 30 days
        boolean has31Days = !has28Days&&!has30Dasy && number<=12; // For the mount that has 31 days

        if(has28Days){ // if the month has 28 days

            System.out.println("28 days");
        }
        if (has30Dasy){ // if the month has 30 days

            System.out.println("30 days");

        }
        if (has31Days){ // If the month has 31 days

            System.out.println("31 days");
        }



    }



}
