package day11_Switch_Scanner;

public class DaysInWeek {


    public static void main(String[] args) {

        // long number = 9L;
        // float number = 9F            // we cannot use switch wth those data type
        // double number = 9D;
        // boolean number = true

        int number =3;





/**
        if(number==1){

            System.out.println("Monday");

        }
 */

        switch (number){
            case 1: // exist the switch after executing the case block
                System.out.println("Monday");
                break;
            case 2: // exist the switch after executing the case block
                System.out.println("Tuesday");
                break;
            case 3: // exist the switch after executing the case block
                System.out.println("Wednesday");
                break;
            case 4: // exist the switch after executing the case block
                System.out.println("Thursday");
                break;
            case 5: // exist the switch after executing the case block
                System.out.println("Friday");
                break;
            case 6: // exist the switch after executing the case block
                System.out.println("Saturday");
                break;
            case 7: // exist the switch after executing the case block
                System.out.println("Sunday");
                break;
            default: // we do not need to give break statement after the default
                System.out.println("number is not valid");
        }





    }
}
