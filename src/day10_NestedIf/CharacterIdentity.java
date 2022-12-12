package day10_NestedIf;
/*
4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character
		Ex:
			ch = '@'
		output:
			Special Character
		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */
public class CharacterIdentity {


    public static void main(String[] args) {


        char ch = 'd';

        if (48<=ch && ch<= 57) {
            System.out.println("Digit");
        } else if ((ch>=65 && ch<=90) || (ch>=97 && ch<= 122)) {
            System.out.println("Alphabetic");
        }else {
            System.out.println("special Character");
        }



    }




}
