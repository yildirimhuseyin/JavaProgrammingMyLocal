package day14_String;

public class EmailDomain_Substring {


    public static void main(String[] args) {


        String email = "Cydeo.School@gmail.com";
        String domain =email.substring(email.indexOf("@")+ 1,email.lastIndexOf("."));

        System.out.println("domain = " + domain);

        System.out.println("---------------------------------------------------------------");


        String str1 = "Java is fun, Java is cool, I love Java";


        String s1 = str1.substring(0,str1.indexOf(",")); // "Java is fun"

        System.out.println(s1);

        System.out.println("---------------------------------------------------------------");

        int beginingIndex = str1.indexOf(" J");
        int endingIndex = str1.lastIndexOf(",");
        String s2 = str1.substring(beginingIndex,endingIndex); // "Java is cool"

        System.out.println(s2);

        String s3 = str1.substring(str1.lastIndexOf("I")); // Substring "I love Java"
        System.out.println(s3);



    }
}
