package day29_ArrayList;

import java.util.ArrayList;

public class Test {


    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        int a =1;

        list1.add(2,4);

        System.out.println(list1);

    }
}
