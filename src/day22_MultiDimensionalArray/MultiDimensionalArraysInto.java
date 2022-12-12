package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysInto {


    public static void main(String[] args) {
        String [] group1 = {"John", "Joes", "James"};
        String [] group2 = {"Aaron", "Shay", "Breanna"};
        String [] group3 = {"Cassandra", "Tahir", "Aygun"};


        String[][] groups = new String[3][];// index: 0,1,2

        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

     //   System.out.println(Arrays.toString(groups));//  toStringMethods() is for single dimensional arrays // hashCode
        System.out.println(Arrays.deepToString(groups));


        System.out.println("---------------------------------------------------------------------------");

        /*
        {1,2,3};
        {4,5,6,7};
        {8,9,10,11,12};
         */

        int[][] arr2D = { {1,2,3},{4,5,6,7},{8,9,10,11,12} };
//indexnumber elements:    0 1 3   0 1 2 3   0 1 2   3  4
//      index of array:      0       1           2

        System.out.println(Arrays.deepToString(arr2D));

        // {4,5,6,7} get this one >>>

        System.out.println(Arrays.toString(arr2D[1]));

        // 11 get this one >>>>

        System.out.println(arr2D[2][3]);


    }
}
/*
String [] group1 = {"John", "Joes", " James"};
String [] group2 = {"John", "Joes", " James"};
String [] group3 = {"John", "Joes", " James"};

 */