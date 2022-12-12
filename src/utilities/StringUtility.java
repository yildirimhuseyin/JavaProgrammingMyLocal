package utilities;

import java.util.Arrays;

public class StringUtility {


    // Prints each character of given string
    public static void printEachChar(String srt){

        for (int i = 0; i <srt.length() ; i++) {
            char ch = srt.charAt(i);
            System.out.println(ch);
        }

    }

    //Reverses any given String and returns the reserve string
    public static String reverse(String str){

        String result ="";
        for (int i = str.length()-1; i >=0 ; i--) {

            result += str.charAt(i);

        }

        return result;

    }

    // Checks if the given string is a palindrome, return boolean
    public static boolean isPalindrome(String str){

         return str.equalsIgnoreCase(reverse(str));

    }

    // Checks given string is anagram, returns boolean
    public static boolean anagram(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }

    // Removes duplicates from given string, returns String
    public static String removeDuplicates(String str){ // "aaaaaaabbbbbcccccc" =======> "abc"

        String result = "";

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (!result.contains(""+ch)){
                result += ch;
            }
        }

        return result;


    }

}
