package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {


    public static void main(String[] args) {
        //

        char[] letters = new char[26];
       /*
        letters[0] = 'A';
        letters[1] = 'B';
        .........
        */

        /*
        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length ; i++, j++) {
            letters[j] = (char) i;
        }
        System.out.println(Arrays.toString(letters)); // [A-Z]
         */

        char ch = 'A';
        for (int i = 0; i < letters.length ; i++) {
            letters[i] = ch;
            ch++;
        }

        System.out.println("-------------------------------------------");

        char [] letters2 = new char[26]; // [Z-A]

        char ch1 = 'Z';

        for (int i = letters2.length-1; i >=0 ; i--) {
            letters2[i] = ch1;
            ch1--;
        }
        System.out.println(Arrays.toString(letters2));

    }
}
