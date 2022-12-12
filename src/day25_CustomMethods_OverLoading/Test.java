package day25_CustomMethods_OverLoading;


import utilities.StringUtility;

public class Test {


    public static void main(String[] args) {

        String str ="Java Programing Language";
        StringUtility.printEachChar(str);

        System.out.println("-------------------------------------------");

        String str2 = "Cydeo School";
        String reverse = StringUtility.reverse(str2);
        System.out.println("reverse = " + reverse);

        System.out.println("-------------------------------------------");

        String word = "Java";

        boolean isPalindrome = StringUtility.isPalindrome(word);
        System.out.println("isPalindrome = " + isPalindrome);

        System.out.println("-------------------------------------------");

        String [] names = {"Anna", "Java", "Python","Racecar","Mom","Cydeo"};

        int counter = 0;

        for (String each : names) {

            if (StringUtility.isPalindrome(each)){
                counter++;
            }
        }

        System.out.println("counter = " + counter);

        System.out.println("-------------------------------------------");

        String s2 = "aaaaaabbbbbbcccc";

        String removeDuplicates = StringUtility.removeDuplicates(s2);

        System.out.println("removeDuplicates = " + removeDuplicates);
    }






}
