package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {
        // replace(old Value,new Value) methods: returns new string by replacing All the old values with the given new value.
        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java","Python"); // "Python is fun, I love learning Python"


        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        System.out.println("-------------------------------------------------------");

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo","gmail"); // JohnSmith@gmail.com

        System.out.println("email = " + email);

        System.out.println("-------------------------------------------------------");

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python";
        String sentence2 = sentence.replace("Python",""); // Java Java   C# C# C++ C++
               sentence2 = sentence2.replace("   "," "); //  Java Java C# C# C++ C++

        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);

        System.out.println("-------------------------------------------------------");

        String s = "Dog Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog","Cat"); // "Cat ........"

        System.out.println("s = " + s);

        System.out.println("-------------------------------------------------------");

        String s1 = "C# is fun, C# is cool";
         s1 = s1.replace(" C#"," Java"); // it is only going to replace second because we put space before it

        System.out.println("s1 = " + s1);

        System.out.println("-------------------------------------------------------");

        String s3 = "Java";
        s3 = s3.replace("a","e"); // is is going to replace "a" to "e"

        System.out.println("s3 = " + s3);

        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        // replaceFirst(Old value,New value): returns new string by replacing  the FIRST matching old values with the given new value.


        String result = "Java Java Java";
        result = result.replaceFirst("Java","Python");// Going to replace only first matching

        System.out.println("result = " + result);

        System.out.println("-------------------------------------------------------");

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#","Java");

        System.out.println("result2 = " + result2);

        System.out.println("-------------------------------------------------------");

        String result3 = "Java";
        result3 = result3.replaceFirst("va","vo"); // "Java" will be replaced to "Javo"

        System.out.println("result3 = " + result3);












    }
}
