package day08_IfStatments;

public class SingleIfStatementsIntro {


    public static void main(String[] args) {



        int number = 300;


        boolean evenNumber = number%2 == 0;


        if(evenNumber){ // even number
            System.out.println(number+ " is even number");
        }

        if(!evenNumber) { // odd number

            System.out.println(number + " not even number ");
        }

            System.out.println("-------------------------------------------------");

            int number2 = 200;

            // positive
            if(number2>0){ // if number2 is greater than zzero then number 2 is positive
                System.out.println( number2 + " is positive");
            }
            // negative
            if(number2<0){ // if number2 is less than zero, then it is negative

                System.out.println( number2 + " is negative");

            }
            // zero
            if (number2==0){

                System.out.println( number + " is zero");



            }


        }
    }

