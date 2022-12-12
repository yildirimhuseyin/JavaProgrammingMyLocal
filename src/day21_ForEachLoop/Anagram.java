package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {


    public static void main(String[] args) {
// Anagram: String has same characters or not

        String str1 = "acdb";
        String str2 = "dbca";


        // write a program that can check if str1 & str2 are build out same characters

        char[] str1Loop = str1.toCharArray();
        char[] str2Loop = str2.toCharArray();

        Arrays.sort(str1Loop);
        Arrays.sort(str2Loop);

        boolean isAnagram = Arrays.equals(str1Loop,str2Loop);


        System.out.println("is anagram = " + isAnagram);



    }
}
