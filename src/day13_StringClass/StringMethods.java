package day13_StringClass;

public class StringMethods {


    public static void main(String[] args) {

        // charAt(index number) method / char charName = nameOfString.charAt();

        String word = "Cydeo";
        // index:      01234

        char thirdChar = word.charAt(3);
        // length Methods

        System.out.println("thirdChar = " + thirdChar);
/*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);

*/
        System.out.println("-------------------------------------------------");

        // length Methods / Syntax = String nameOfString = nameOfStringThatCreatedBefore.Length();

        String s1 = "Batch 25 is the best batch. Java Programming Language";
        int totalChar = s1.length(); // give us total number of character / Syntax: int totalChar = stringNameThatAlreadyGiven

        System.out.println("totalChar = " + totalChar);

        char lastChar = s1.charAt(s1.length()-1); //  give us last character of String.

        System.out.println(lastChar);

        System.out.println("-------------------------------------------------");
         // toUpperCase and toLowerCase Methods / syntax: String nameOfString= NameOfStringThatCreatedBefore.toUpperCase(): OR toLowerCase;

        String str = "wooden spoon";
        str = str.toUpperCase();// Convert to this: "WOODEN SPOON"
        System.out.println(str);


        String s = "JAVA";
        s = s.toLowerCase(); // Convert to this: "java"
        System.out.println("s = " + s);

        String sentence = "Today is a great day to learn java programming language.";
        sentence=sentence.toUpperCase(); // Convert to this:"TODAY IS A GREAT DAY TO LEARN JAVA PROGRAMMING LANGUAGE."


        System.out.println(sentence);






    }



}
