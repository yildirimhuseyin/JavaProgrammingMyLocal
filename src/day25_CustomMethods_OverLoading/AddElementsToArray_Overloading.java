package day25_CustomMethods_OverLoading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {


    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6};//7
        numbers = addElement(numbers,7);

        char [] chars = {'A','B','C','D'}; // 'E'
        chars = addElement(chars,'E');

        String [] names = {"Hasan","Hüseyin", "Yusuf", "Sümeyye", "Zeynep","Fadime"};
        names = addElement(names,"Hüsnü");


        System.out.println("names = " + Arrays.toString(names));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("numbers = " + Arrays.toString(numbers));




    }


    // 1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int [] addElement(int [] array, int number ){

        int[] result = new int[array.length + 1];

        for (int i = 0, j = 0; i < array.length ; i++,j++) {
            result[j]= array[i];
        }
        result[result.length-1] = number;

        return result;

    }
    //  2. create a return method called addDouble that can add a double after the last index of a double array
    public static double [] addElement(double [] array, double number ){

        double[] result = new double[array.length + 1];

        for (int i = 0, j = 0; i < array.length ; i++,j++) {
            result[j]= array[i];
        }
        result[result.length-1] = number;

        return result;

    }
    //  3. create a return method called addString that can add a String after the last index of a String array
    public static String [] addElement(String [] str, String str2){

        String[] result = new String[str.length+1];
        int i = 0;
        for (String each : str) {
            result[i++] = each;
        }
        result[i] = str2;

        return result;
    }
    // 4. create a return method called addChar that can add a char after last index of a char array
    public static char [] addElement(char [] ch, char ch1) {

        char[] result = new char[ch.length+1];
        int i = 0;
        for (char each : ch) {
            result[i++] = each;
        }
        result[result.length-1] = ch1;

        return result;
    }




}
