package day16_ForLoopStringStringPractice;
/*
"Java" ==> "avaJ" ==> false (not palindrome)
"Anna" ==> "annA= ==> true ( palindrome)

 "Level"
 "Racecar
 Dad
 Mom
 ....

 */
public class Palindrome {


    public static void main(String[] args) {

        String word = "Level";


        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {

            reversed += word.charAt(i);

        }

        boolean isReserved = word.equalsIgnoreCase(reversed);

        System.out.println(isReserved);



    }
}


