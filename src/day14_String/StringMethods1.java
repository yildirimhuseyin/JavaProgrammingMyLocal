package day14_String;

public class StringMethods1 {


    public static void main(String[] args) {

        //trim() methods: returns new String without the white spaces (unused spaces)( it will not remove space btw chars

        String str1 = "        batch     25        ";
         str1 = str1.trim(); // remove the  space "batch 25"

        System.out.println(str1);

        System.out.println("----------------------------------------------------------");

        // indexOf(): returns the index number of first occurred character. returns int Syntax: int Name = StringNameAlreadyGiven.indexOf(give char in double quote " ");
        // lastIndexOf(): returns the index number of last occurred character. returns int

        String str2 = "Cydeo School";
                   //  0123456789( index number starts with '0')
        int n1 = str2.indexOf("h"); // index number: 8

        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool"); // index number: 9

        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";

        int n3 =str3.indexOf("ammi");
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("g");
        System.out.println("n4 = " + n4);

        int n5 = str3.indexOf("g ");
        System.out.println("n5 = " + n5);

        int n6 = str3.indexOf("gua");
        System.out.println("n6 = " + n6);

        int n7 = str3.lastIndexOf("g"); // Last index of 'g' occurred in the string
        System.out.println("n7 = " + n7);

        System.out.println("---------------------------------------------------------------");

        String s = "Java Nova Cava Wawa Orange";

        int firstA = s.indexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        // int fourthA = s.lastIndexOf("av");
        // int forthA = s.indexOf("ava W");
        int fourthA =s.indexOf("Ca") +1;
        // int fifthA = s.lastIndexOf("va"+1);
        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("aw");
        // int seventhA = s.indexOf("a o");
        int seventhA = s.lastIndexOf("a ");
        int lastA = s.lastIndexOf("a");



        System.out.println("firstA = " + firstA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);
        System.out.println("lastA = " + lastA);



    }
}