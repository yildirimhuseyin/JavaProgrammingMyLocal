package day25_CustomMethods_OverLoading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {


        int[] arr1 = {1,2,3,4,5,6};
          ArraysUtility.printEachElement(arr1);

        System.out.println("------------------------------------------------------");

          String[] arr2 = {"Hasan","Hüseyin","Yusuf"};
          ArraysUtility.printEach(arr2);

        System.out.println("------------------------------------------------------");

        char[] ch = {'A','B','C','D'};
        ArraysUtility.printEach(ch);

        System.out.println("------------------------------------------------------");

        double[] db = {5.9,9.6,5,8,3.1,2.6};
        ArraysUtility.printEach(db);

        System.out.println("------------------------------------------------------");

        int[] arr3 = {1,2,10,4,5,6};

        int max1 = ArraysUtility.maxNumberFromArray(arr3);
        System.out.println("max1 = " + max1);

        System.out.println("------------------------------------------------------");

        double[] arr4 = {5.9,9.6,5,8,3.1,2.6};

         double max2 = ArraysUtility.minNumberFromArray(arr4);

        System.out.println("max2 = " + max2);

        System.out.println("------------------------------------------------------");

        int[] a1 = {1,2,3,4,6,7,5,8};
        boolean r1 = ArraysUtility.contains(a1,8);

        System.out.println("r1 = " + r1);

        System.out.println("------------------------------------------------------");
        char[] ch1 = {'A','B','C','D','F'};

        boolean t1 = ArraysUtility.contains(ch1,'F');

        System.out.println("t1 = " + t1);
        System.out.println("------------------------------------------------------");

        String[] ar1 = {"Hasan","Hüseyin","Yusuf"};

        boolean t2 = ArraysUtility.contains(ar1,"Hasan");
        System.out.println("t2 = " + t2);

        System.out.println("------------------------------------------------------");

        double[] ar2 = {5.9,9.6,5,8,3.1,2.6};
        boolean t3 = ArraysUtility.contains(ar2,3.8);
        System.out.println("t3 = " + t3);





    }



}
