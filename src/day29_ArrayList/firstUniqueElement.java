package day29_ArrayList;

import java.util.ArrayList;

/*
Warm up task:
1. Write a program that can return the first unique elements from an arraylist

			Do not use indexOf & lastIndexOf methods

 */
public class firstUniqueElement {


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);


        for (Integer each : list) {

            int counter = 0;

            for (Integer elements : list) {
                if (each ==elements ){
                    counter++;
                }
            }


            if (counter <= 1){
                System.out.println(each);
                break;
            }
        }


            /*
        for (Integer each : list) {

            if (list.indexOf(each) == list.lastIndexOf(each)){
                System.out.println(each);
                break;
            }

        }
 */




    }
}
