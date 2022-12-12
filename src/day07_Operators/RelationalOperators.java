package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // >, >=, <, <=

        boolean result = 200 > 40; // true

        System.out.println("result = " + result);

        boolean result2 = 300 >= 150; // true

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100; // true

        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500; // false

        System.out.println("result4 = " + result4);

        boolean result5 = 100 < 120; // true

        System.out.println("result5 = " + result5);
        boolean result6 = 200 < 180; // false

        System.out.println("result6 = " + result6);

        int score = 75;
        boolean isPassed = score <= 59; // false

        System.out.println("isPassed = " + isPassed);

        boolean result7 = 45<=60; //true

        System.out.println("result7 = " + result7);

        System.out.println("-------------------------------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x == y; // false
        System.out.println("equal = " + equal);

        boolean rusult9 = "Muhtar" == " Good Guy"; // false
        System.out.println("rusult9 = " + rusult9);

        boolean result8 = 'A'=='a'; // false
        System.out.println("result8 = " + result8);

        boolean result10 = "Java" == "Java"; // True
        System.out.println("result10 = " + result10);

        boolean result11 = 100 != 200.5; // true 100 is not equal to 200 this statement is true
        System.out.println("result11 = " + result11);

        boolean result12 = " java" != "break"; // true
        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300; // false ( 300 does not equal to 300) this statement is false
        System.out.println("result13 = " + result13);





    }
}
