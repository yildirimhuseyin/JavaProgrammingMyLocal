package day03_EscapeSequences;
/*
Escape Sequences MUST be given with a double quote

       \n: stars a new line
       \t: paragraph space(TAB)
       \\: single back slash
       \": double quote


 */
public class EscapeSequences {

    public static void main(String[] args) {



        System.out.println("Java\nPython\nC#"); // \n: started a nwe line like this example

        System.out.println("--------------------------------------------------");

        System.out.println("Hello Cydeo, \nHow are you today? \nIt's nice to see you all. \nWhat class do we have next week?"); // Example for "\n" sequences

        System.out.println("------------------------------------------------------");

        System.out.println("\tJava is a cool programming language");

        System.out.println("------------------------------------------------------");

        System.out.println("/ \\"); // in order to create one backward slash, e have to give two backward slash

        System.out.println("------------------------------------------------------");

        System.out.println("My favorite Tv show is \"Game of Thrones\""); // in order to create double quote(") we have to use this \" Sequence


    }


}
