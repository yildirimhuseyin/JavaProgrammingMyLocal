package utilities;

public class MathUtility {

    // calculates and returns sum of two integer
    public  static int sumOfTwoInteger(int num1,int num2){

        return num1+num2;

    }

    // calculates and returns sum of two decimal number
    public  static double sumOofTwoNumber(double num1,double num2){

        return num1+num2;

    }

    // calculates and returns subtractions of two integer
    public  static int subtractionOfTwoNumber(int num1, int num2){

        return num1-num2;

    }

    // calculates and returns subtractions of two decimal number
    public  static double subtractionOfTwoNumber (double num1,double num2){

        return num1-num2;

    }

    // calculates and returns multiplication of two integer
    public  static int multiplicationOfTwoNumber(int num1, int num2){

        return num1*num2;

    }

    // calculates and returns multiplication of two decimal number
    public  static double multiplicationOfTwoNumber (double num1,double num2){

        return num1*num2;

    }

    // calculates and returns division of two integer
    public  static int divisionOfTwoNumber(int num1, int num2){

        return num1/num2;

    }

    // calculates and returns division of two decimal number
    public  static double divisionOfTwoNumber (double num1,double num2){

        return num1/num2;

    }

    // checks if a number is even or not 
    public static void isEven(int number){
        
        boolean isEven = false;
        
        if (number%2 == 0){
            isEven = true;
        }
        System.out.println(isEven);
    }
    
    // checks if a number is odd or not 
    public static void isOdd(int number){

        boolean isOdd = false;

        if (number%2 != 0){
            isOdd = true;
        }
        System.out.println(isOdd);
    }
    
    
    // finds max number from two integer  
    public static int maxNumber(int num1, int num2){
        int maxNumber = num1;

        if (num1<num2){
            maxNumber= num2;
        }
        return maxNumber;
    }

    // finds max number from two decimal  
    public static double maxNumber(double num1, double num2){
        double maxNumber = num1;

        if (num1<num2){
            maxNumber= num2;
        }
        return maxNumber;
    }


    // finds min number from two integer
    public static int minNumber(int num1, int num2){
        int minNumber = num2;

        if (num1<num2){
            minNumber= num1;
        }
        return minNumber;
    }

    // finds min number from two decimal
    public static double minNumber(double num1, double num2){
        double minNumber = num2;

        if (num1<num2){
            minNumber= num1;
        }
        return minNumber;
    }


    // calculates square of given int and returns as a new integer
    public static int squareOfInt(int number){

        return number*number;
    }

    // calculates square of given decimal and returns as a new decimal
    public static double squareOfDecimal(double number){

        return number*number;
    }


    // calculates cube of given int and returns as a new integer
    public static int cubeOfInt(int number){

        return number*number*number;
    }

    // calculates cube of given decimal and returns as a new decimal
    public static double cubeOfDecimal(double number){

        return number*number*number;
    }


}
