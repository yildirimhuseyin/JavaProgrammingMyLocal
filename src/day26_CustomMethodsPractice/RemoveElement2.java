package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class RemoveElement2 {


    public static void main(String[] args) {




    }

    public static int[] removeElement(int[] array,int index){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid index:"+ index);
            System.exit(0);
        }

        int[] result = {};
        for (int i = 0; i <array.length ; i++) {
            if (i != i ){
                result= ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
    }

}
