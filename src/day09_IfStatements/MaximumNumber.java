package day09_IfStatements;
/*
1. Maximum number between two different numbers
 */
public class MaximumNumber {
    public static void main(String[] args) {


        int num1 = 65,
                num2 = 96;

        boolean maximumNumber= num1<num2;


        if (maximumNumber){

            System.out.println(num2+" is the maximum number");

        }
        else{
            System.out.println(num1+ " is the maximum number");
        }



    }
}
