package day11_Switch_Scanner;
/*
	2. Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary
 */
public class NumberToWords {


    public static void main(String[] args) {


        int number = 5;



        String result =  (0<=number && number<=9)?

               (number==0)? "Zero" :(number==1)? "One" :(number==2)? "Two" :(number==3)? "Three" :(number==4)? "Four" :(number==5)? "Five"
                :(number==6)? "Six":(number==7)? "Seven" :(number==8)? "Eight" : "Nine"

                : "invalid number";

        System.out.println(result);

    }
}
