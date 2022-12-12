package day14_String;

public class StringMethods3_Substring {


    public static void main(String[] args) {
        // substring(beginningIndex , endingIndex): creates substring starting from the given beginning index
        // till the given ending index (ending index is excluded)

        String word = "Cydeo school";
        //             012345
        String brand = word.substring(0, 4+1);

        System.out.println("brand = " + brand);


        String str1 = word.substring(6); // start from 6 till to the end of string
        System.out.println("str1 = " + str1);


        System.out.println("-------------------------------------");

        String word2 = "Python C# Ruby";

        String s1 = word2.substring(0, word2.indexOf(" ")) ; // "Python"

        String s2 = word2.substring( word2.indexOf(" ")+1 ,word2.lastIndexOf(" ") ) ; // "C#"

        String s3 = word2.substring( word2.lastIndexOf(" ") +1 ); // "Ruby"


        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);





    }
}
