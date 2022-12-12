package day20_Arrays;

public class MinNumberOfArray {


    public static void main(String[] args) {

        int[] numbers = {100, 500, 30, 10, 40 ,600 , 80, -90 };
        int min = numbers[0];


        for (int i = 0; i < numbers.length; i++) { // i: 1,2,2,4,5....
            if (numbers[i]<min){ // if there is a element in the array that's smaller
                min = numbers[i]; // smaller number will be assigned to the variable min
            }
        }

        System.out.println(min);



    }
}
