package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {


    public static void main(String[] args) {


        // oddOrEven();// the methods demand additional information to complete its task

        oddOrEven(10);
        ageOfPerson(1995);

        printNumbers(0,50);

    }




    // create a functions that can check if a number is odd or  even number
    public static void oddOrEven(int number ){ // 10
    if (number%2 == 0){
        System.out.println(number+ " is even number");
    }else {
        System.out.println(number+ " is odd numbers");
    }


    }

    // create  function that can display the age of the person

    public static void ageOfPerson(int birthYear){

        int age = 2022- birthYear;

        System.out.println("Your age is "+ age);


    }



    public static void printNumbers(int x, int y){

        for (int i = x; i<= y; i++ ){
            System.out.println(i);
        }


    }



}
