package day16_ForLoopStringStringPractice;
/*
3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2
 */
public class UniqueCharacters {


    public static void main(String[] args) {


        String str = "aaabccc";
        //            0123456
        String unique = "";

        for (int i = 0; i < str.length() ; i++) { // i: index number of char str ( starting from 0 )


            char ch = str.charAt(i);
                 // index :              index:
            if (str.indexOf(ch) == str.lastIndexOf(ch)){ // if the last and first i index number of str is same, then str is unique
                unique += ch;
            }
        }


        System.out.println("unique = " + unique);




    }
}
