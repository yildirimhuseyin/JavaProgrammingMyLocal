package day21_ForEachLoop;

import java.util.Arrays;

public class ReserveString {


    public static void main(String[] args) {


        int[] numbers = {10,20,30,40};
        //index:          0  1  2  3
        int[] reserved = new int[numbers.length]; // to make sure that array have enough capacity to contain all elements of array
/*               j            i
        reserved[0] = numbers[3];
        reserved[1] = numbers[2];
        reserved[2] = numbers[1];
        reserved[3] = numbers[0];

 */

        for (int i = numbers.length - 1,j =0; i >= 0; i--,j++) {
            reserved[j] = numbers[i];

        }

        System.out.println(Arrays.toString(reserved));
    }
}
