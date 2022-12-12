package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // print each integer of an integer array in separate lines
    public static void printEachElement(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }

    // print each double of a double array in separate lines
    public static void printEach(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    // print each char of a char array in separate lines
    public static void printEach(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    // print each String of a String array in separate lines
    public static void printEach(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }



    // return a max number from integer array
    public static int maxNumberFromArray(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];

    }

    // return a max number from double array
    public static double maxNumberFromArray(double[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];

    }

    // return a min number from integer array
    public static int minNumberFromArray(int[] arr){
        Arrays.sort(arr);
        return arr[0];

    }

    // return a min number from double array
    public static double minNumberFromArray(double[] arr){
        Arrays.sort(arr);
        return arr[0];

    }
    


    // check if the given integer is contained in the given array, return boolean
    public static boolean contains(int[] array, int element ){
        
        boolean result = false;

        for (int each : array) {
            
            if (each == element){
                result = true;
            }
        }
        
        return result;
    }

    // check if the given double is contained in the given array, return boolean
    public static boolean contains(double[] array, double element ){

        boolean result = false;

        for (double each : array) {

            if (each == element){
                result = true;
            }
        }

        return result;
    }

    // check if the given char is contained in the given array, return boolean
    public static boolean contains(char[] array, char element ){

        boolean result = false;

        for (char each : array) {

            if (each == element){
                result = true;
            }
        }

        return result;
    }

    // check if the given String is contained in the given array, return boolean
    public static boolean contains(String[] array, String element ){

        boolean result = false;

        for (String each : array) {

            if (each == element){
                result = true;
            }
        }

        return result;
    }




    // adds given integer to array, return a new array
    public static int [] addElement(int [] array, int number ){

        int[] result = new int[array.length + 1];

        for (int i = 0, j = 0; i < array.length ; i++,j++) {
            result[j]= array[i];
        }
        result[result.length-1] = number;

        return result;

    }

    // adds given String to array, return a new array
    public static double [] addElement(double [] array, double number ){

        double[] result = new double[array.length + 1];

        for (int i = 0, j = 0; i < array.length ; i++,j++) {
            result[j]= array[i];
        }
        result[result.length-1] = number;

        return result;

    }

    // adds given String to array, return a new array
    public static String [] addElement(String [] str, String str2){

        String[] result = new String[str.length+1];
        int i = 0;
        for (String each : str) {
            result[i++] = each;
        }
        result[i] = str2;

        return result;
    }

    // adds given char to array, return a new array
    public static char [] addElement(char [] ch, char ch1) {

        char[] result = new char[ch.length+1];
        int i = 0;
        for (char each : ch) {
            result[i++] = each;
        }
        result[result.length-1] = ch1;

        return result;
    }





    // returns frequency of given element from given array
    public static int frequencyOfElement(int[] array,int element ){


        int frequency = 0;
        for (int each : array) {
            if (each == element){
                frequency++;
            }
        }

        return frequency;

    }

    // returns frequency of given element from given array
    public static int frequencyOfElement(double [] array,double element ){


        int frequency = 0;
        for (double each : array) {
            if (each == element){
                frequency++;
            }
        }

        return frequency;

    }

    // returns frequency of given element from given array
    public static int frequencyOfElement(String [] array,String element ){


        int frequency = 0;
        for (String each : array) {
            if (each.equals(element) ){
                frequency++;
            }
        }

        return frequency;

    }

    // returns frequency of given element from given array
    public static int frequencyOfElement(char [] array,char element ){


        int frequency = 0;
        for (char each : array) {
            if (each == element ){
                frequency++;
            }
        }

        return frequency;

    }




    // returns the unique elements of the array as a new array
    public static int [] uniqueElements(int [] array){

        int[] result = {};

        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is one, the elements is unique
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static double [] uniqueElements(double [] array){

        double[] result = {};

        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is one, the elements is unique
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static char [] uniqueElements(char [] array){

        char[] result = {};

        for (char each : array) {

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is one, the elements is unique
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static String [] uniqueElements(String [] array){

        String[] result = {};

        for (String each : array) {

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is one, the elements is unique
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }




    // removes the index from the array, returns new array
    public static int[] removeElements(int array[], int index){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid index:"+ index);
            System.exit(0);
        }

        int [] result = new int[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length;i++) {
            if (i == index){ // if the element of array matching with the element at given index
                continue; // skip
            }
            result[j++] = array[i];

        }
        return result;
    }

    // removes the index from the array, returns new array
    public static double[] removeElements(double array[], int index){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid index:"+ index);
            System.exit(0);
        }

        double [] result = new double[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length;i++) {
            if (i == index){ // if the element of array matching with the element at given index
                continue; // skip
            }
            result[j++] = array[i];

        }
        return result;
    }

    // removes the index from the array, returns new array
    public static String[] removeElements(String array[], int index){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid index:"+ index);
            System.exit(0);
        }

        String [] result = new String[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length;i++) {
            if (i == index){ // if the element of array matching with the element at given index
                continue; // skip
            }
            result[j++] = array[i];

        }
        return result;
    }

    // removes the index from the array, returns new array
    public static char[] removeElements(char array[], int index){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid index:"+ index);
            System.exit(0);
        }

        char [] result = new char[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length;i++) {
            if (i == index){ // if the element of array matching with the element at given index
                continue; // skip
            }
            result[j++] = array[i];

        }
        return result;
    }




    // merge two arrays, return new array
    public static int[] merge(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length+ arr2.length];

        int i = 0;

        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    // merge two arrays, return new array
    public static double [] merge(double[] arr1, double[] arr2){

        double[] result = new double[arr1.length+ arr2.length];

        int i = 0;

        for (double each : arr1) {
            result[i++] = each;
        }

        for (double each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    // merge two arrays, return new array
    public static char[] merge(char[] arr1, char[] arr2){

        char[] result = new char[arr1.length+ arr2.length];

        int i = 0;

        for (char each : arr1) {
            result[i++] = each;
        }

        for (char each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    // merge two arrays, return new array
    public static String[] merge(String[] arr1, String[] arr2){

        String[] result = new String[arr1.length+ arr2.length];

        int i = 0;

        for (String each : arr1) {
            result[i++] = each;
        }

        for (String each : arr2) {
            result[i++] = each;
        }
        return result;
    }



    // reverses given array,returns as a new array
    public static int[] reverse( int[] array){

        int[] result = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    // reverses given array,returns as a new array
    public static double[] reverse( double[] array){

        double[] result = new double[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    // reverses given array,returns as a new array
    public static char[] reverse( char[] array){

        char[] result = new char[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    // reverses given array,returns as a new array
    public static String[] reverse( String[] array){

        String[] result = new String[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }


    //replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int element){

        if (index<0 || index> array.length-1){
            System.out.println("Invalid index: "+ index);
            System.exit(0);
        }

        array[index] = element;
        return array;

    }

    //replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double element){

        if (index<0 || index> array.length-1){
            System.out.println("Invalid index: "+ index);
            System.exit(0);
        }

        array[index] = element;
        return array;

    }

    //replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char element){

        if (index<0 || index> array.length-1){
            System.out.println("Invalid index: "+ index);
            System.exit(0);
        }

        array[index] = element;
        return array;

    }

    //replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String element){

        if (index<0 || index> array.length-1){
            System.out.println("Invalid index: "+ index);
            System.exit(0);
        }

        array[index] = element;
        return array;

    }



    // replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldElement, int newElement){


        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldElement){
                array[i] = newElement;
            }

        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldElement, double newElement){


        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldElement){
                array[i] = newElement;
            }

        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldElement, char newElement){


        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldElement){
                array[i] = newElement;
            }

        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldElement, String newElement){


        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(oldElement) ){
                array[i] = newElement;
            }

        }
        return array;
    }


    // removes the duplicates from given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};


        for (int each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }


        return result;

    }

    // removes the duplicates from given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};


        for (double each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }


        return result;

    }

    // removes the duplicates from given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};


        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }


        return result;

    }

    // removes the duplicates from given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};


        for (String each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }


        return result;

    }



}
