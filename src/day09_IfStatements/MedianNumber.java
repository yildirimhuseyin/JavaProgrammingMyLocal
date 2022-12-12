package day09_IfStatements;
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
 */
public class MedianNumber {
    public static void main(String[] args) {



    int a = 10,
            b = 15,
            c = 20;
         // if we have tree different number, One must be a minimum, one must be maximum and one must be median number
    boolean aIsMedianNumber = (b<a && a<c) || (c<a && a<b);
         /*
        in order for a be the median number
             1- If c is the maximum number & b is the minimum number, then a is the median number
             2- If b is the maximum number & c is the minimum number, then a is the median number

         */

    boolean bIsMedianNumber = (a<b && b<c)|| ( c<b && b<a);
         /*
     in order for b be the median number:
          1- If a is the maximum number & c is the minimum number, then b is the median number
          2- If c is the maximum number & a is the minimum number, then b is the median number


     */
    boolean cIsMedianNumber = !bIsMedianNumber && !aIsMedianNumber; //  a<c && c<b || (  b<c && c<a); same thing
         /*
        in order for c be the median number:
          1- If a is the maximum number & b is the minimum number, then c is the median number
          2- If b is the maximum number & a is the minimum number, then c is the median number

         */

        if (aIsMedianNumber){ // if a is median number

            System.out.println( a+ " is the median number");

        }

        if (bIsMedianNumber){ // if b is median number

            System.out.println(b+ " is the median number");

        }

        if (cIsMedianNumber){ // if c is median number

            System.out.println(c+ " is the median number");

        }


    }

}
