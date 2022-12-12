package day21_ForEachLoop;

public class MaxNumber {


    public static void main(String[] args) {

        int[] numbers = {10, 5, 20, 1, 4,0 };

        int max = numbers[0];
/*
        for (int i = 0; i < numbers.length; i++) { // if there is element in the array that's greater than the current max number

            if (numbers[i]> max){
                max = numbers[i];
            }
        }

        System.out.println(max);
 */

        for (int each : numbers) {
            if (each > max) {
                max = each;
            }
        }

        System.out.println("max = " + max);

    }
}
