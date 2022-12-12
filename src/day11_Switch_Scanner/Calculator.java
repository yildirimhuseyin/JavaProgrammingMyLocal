package day11_Switch_Scanner;
/*
Given two double variables n1, n2 and a char variable named operator.
use switch statement to calculate the result of n1 & n2 based on the given operator
		Valid operators are: -, +, *, /
		            @
 */
public class Calculator {


    public static void main(String[] args) {

        double n1 = 10,
                n2 = 20;

        char operator = '*';

        boolean valid = operator== '+'|| operator == '-' || operator == '*' || operator == '/';

        if (valid){ // this is the preconditions

            switch (operator){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                default:
                    System.out.println(n1/n2);

            }

        }else{ // And this is the else of the pre-conditions.
            System.out.println("Invalid operator:"+ operator);
        }






    }
}
