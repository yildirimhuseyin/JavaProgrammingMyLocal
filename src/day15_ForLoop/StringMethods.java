package day15_ForLoop;

public class StringMethods {


    public static void main(String[] args) {

        // isEmpty(): check the String if it  is this String empty or not
        String str = "    ";

        boolean r = str.isEmpty();

        System.out.println(r);
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        // isEmpty(): check the String if there is only blanks in the  String  or not

        boolean r1 = str.isBlank();

        System.out.println(r1);

        System.out.println("---------------------------------------------------");

        String str2 = "Cydeo       ";
        System.out.println(str2.isBlank());// False because there is letters in the String

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        // equals(), equalsIgnoreCase() : one is care about case other does not

        String s1 = "CYDEO";
        String s2 = "cydeo";


        System.out.println(s1.equals(s2));// false because care equals() methods care about case

        System.out.println(s1.equalsIgnoreCase(s2));// true because care equalsIgnoreCase() methods does not care about case

        System.out.println("Yes".equalsIgnoreCase("YEs"));//true


        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        // contains : if string contains given String or not ( be careful about case sensitivity )


        String sentence = "My favorite programming Language is Java";

        boolean hasCSharp = sentence.contains("C#");// false
        boolean hasJava = sentence.contains("Java"); // true
        boolean hasJava2 = sentence.contains("java"); // false because it is written via lowercase
        boolean hasJava3 = sentence.toLowerCase().contains("java"); // now it iis true because we call it all lower case


        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("---------------------------------------------------");

        String input1 = "I love jAvA";
        String input2 = "Java";


        System.out.println(input1.equals(input2));// false because it compares all string
        System.out.println(input1.equalsIgnoreCase(input2)); // false because index number of string is different

        System.out.println(input1.contains("Java")); // false

        System.out.println(input1.toLowerCase().contains("java")); // true ignore case sensitivity
        System.out.println(input1.toUpperCase().contains("JAVA"));// true ignore case sensitivity


        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        //

        String a =  "Wooden Spoon";

        boolean x = a.startsWith("Woo");// true
        boolean y = a.endsWith("Spoon"); // true
        boolean z = a.toLowerCase().startsWith("woooden"); // in order to ignore case sensitivity we firsts create lower case or upper case of String and compare with lower or upper case methods


        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
