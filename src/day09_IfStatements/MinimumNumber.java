package day09_IfStatements;
/*
1. Maximum number between two different numbers
 */
public class MinimumNumber {




    public static void main(String[] args) {


        int num1 = 56,
                num2 = 87;

        boolean minimumNumber = num1<num2;

        if (minimumNumber){

            System.out.println(num1 + " is the minimum number");
        } else {
            System.out.println(num2 + " is the minimum number");
        }




    }
}
