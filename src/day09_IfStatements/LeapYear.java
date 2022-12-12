package day09_IfStatements;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;

        boolean isLeapyear = 2000 % 4 == 4;


        if(isLeapyear){
            System.out.println("Year " + year + " leap year");
        }

        if (isLeapyear){
            System.out.println("Year " + year + " is not a leap year");

        }

        System.out.println("-------------------------------------------------"
        );
                                  // both of them can b use for the condition but using if & else better for compiler

        if (isLeapyear) {
            System.out.println("Year " + year + " leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }

    }
}
