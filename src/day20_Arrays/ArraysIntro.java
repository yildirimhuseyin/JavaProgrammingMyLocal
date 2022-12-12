package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {


    public static void main(String[] args) {

        // create a variable that's capable enough 5 names

        String [] myGroups = new String[5];
        myGroups[0] = "Gunay";
        myGroups[1] = "Neira";
        myGroups[2] = "Suat";
        myGroups[3] = "Hulya";
        myGroups[4] = "Mikael";

        //myGroups[5] = "Muhtar";


        System.out.println(myGroups); // hashcode
        System.out.println(Arrays.toString(myGroups)); // [ "Gunay", "Neira", "Suat", "Hulya", "Mikael"]


        System.out.println("--------------------------------------------------------------");


        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 4;

        if (number<1 || number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]);

        System.out.println("--------------------------------------------------------------");

        String[] month = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
/*
            This is first solutions
        System.out.println(month[0]);
        System.out.println(month[1]);
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[11]);
 */
        for (int i = 0; i < month.length ; i++) { // i: represents index numbers starting from 0

            System.out.println(month[i]);

        }


        System.out.println("--------------------------------------------------------------");


        for (int i = month.length-1; i >=0 ; i--) { // i: represents index number of index number starting from last index
            System.out.println(month[i]);
        }

    }
}
