package day21_ForEachLoop;

public class ForEachLoopIntro {


    public static void main(String[] args) {


        int[] numbers = {10,20,30,40,50,60,70};
        //index:         0  1  2  3  4  5  6


        for (int i = 0; i < numbers.length; i++) { // i: indexes of the array
            int eachElement = numbers[i]; // we are getting each element from the array and assingning to each elemetn then printing it
            System.out.println(eachElement);
        }

        System.out.println("---------------------------------------------------------------");

        for (int each : numbers){ // gives us every element of array starting from beginning to the ending
            System.out.println(each); // each: elements of the array
        }



    }
}
