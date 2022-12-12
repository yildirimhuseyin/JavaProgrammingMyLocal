package day16_ForLoopStringStringPractice;
/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */
public class Reverse {


    public static void main(String[] args) {
        String str = "Hacel obasını, engin mi sandın? Ayağında putini var engin mi sandın?";
        //index:      0123456789

        String result = "";  // contain the reversed version of str
        //noopS nedooW

        /*
        result += str.charAt(11); //n
        result += str.charAt(10); //o
        result += str.charAt(9); //o
        result += str.charAt(8); //p
        result += str.charAt(7); //S
        result += str.charAt(6); //' '
        result += str.charAt(5); //n
        result += str.charAt(4); //e
        result += str.charAt(3); //d
        result += str.charAt(2); //o
        result += str.charAt(1); //o
        result += str.charAt(0); //W
*/

        for (int i = str.length()-1; i >=0 ; --i) {

            result += str.charAt(i);
        }
        //
        System.out.println(result);

    }

}

