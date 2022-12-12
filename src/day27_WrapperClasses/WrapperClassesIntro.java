package day27_WrapperClasses;

public class WrapperClassesIntro {


    public static void main(String[] args) {

        int num1 = 200;

        Integer n1 = num1; // autoboxing

        int num2 = n1; // unboxing

        System.out.println("num2 = " + num2);
        System.out.println("------------------------------------------------------------------");

        Integer integerValue = 100;

        long longValue = integerValue;
        System.out.println("longValue = " + longValue);

        Byte b1 = 25;

        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("a4 = " + a4);


        System.out.println("------------------------------------------------------------------");

        int num3 = 200;
        // Long l2 = num3
        Integer num4 = num3;

        System.out.println("num4 = " + num4);

        System.out.println("------------------------------------------------------------------");

        Integer z = 900;
        Integer y = z;

        System.out.println("y = " + y);

        System.out.println("------------------------------------------------------------------");



    }
}
