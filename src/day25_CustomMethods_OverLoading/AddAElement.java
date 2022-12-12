package day25_CustomMethods_OverLoading;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Task2:
		1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array
 */
public class AddAElement {


    public static void main(String[] args) {


       int [] addInteger=  addInteger(new int[] {1,2,3,4,},5);

        System.out.println("addInteger = " + Arrays.toString(addInteger));
        System.out.println("------------------------------------------------------------------------");

        double [] addDouble=  addDouble(new double[] {1.5,2.5,3.5,4,9},5.9);

        System.out.println("addDouble = " + Arrays.toString(addDouble));
        System.out.println("------------------------------------------------------------------------");

        String[] addString = addString(new String[]{"Hasan","Hüseyin", "Yusuf", "Sümeyye", "Zeynep","Fadime"},"Hüsnü");

        System.out.println("addString = " + Arrays.toString(addString));
        System.out.println("------------------------------------------------------------------------");

        char[] addChar = addChar(new char[]{'H','A','S','A'},'N');

        System.out.println("addChar = " + Arrays.toString(addChar));

    }
// 1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int [] addInteger(int [] array, int number ){

        int[] result = new int[array.length + 1];

        for (int i = 0, j = 0; i < array.length ; i++,j++) {
            result[j]= array[i];
        }
        result[result.length-1] = number;

        return result;

    }
//  2. create a return method called addDouble that can add a double after the last index of a double array
    public static double [] addDouble(double [] array, double number ){

        double[] result = new double[array.length + 1];

        for (int i = 0, j = 0; i < array.length ; i++,j++) {
            result[j]= array[i];
        }
        result[result.length-1] = number;

        return result;

    }
//  3. create a return method called addString that can add a String after the last index of a String array
    public static String [] addString(String [] str, String str2){

        String[] result = new String[str.length+1];
            int i = 0;
        for (String each : str) {
            result[i++] = each;
        }
        result[i] = str2;

        return result;
    }
// 4. create a return method called addChar that can add a char after last index of a char array
    public static char [] addChar(char [] ch, char ch1) {

        char[] result = new char[ch.length+1];
        int i = 0;
        for (char each : ch) {
            result[i++] = each;
        }
        result[result.length-1] = ch1;

        return result;
    }




}
