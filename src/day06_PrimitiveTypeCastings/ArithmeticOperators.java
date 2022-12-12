package day06_PrimitiveTypeCastings;
/*
+:  Additions
-: Subtract
*: Multiplication
/: Division

         Integer/Integer =====> Integer
         Decimal/Integer =====> Decimal
         Integer/Decimal =====> Decimal
         Decimal/Decimal =====> Decimal

%: Remainder
       in math:
       10/4 = 2.5
       100/3 = 33.333333..

       in java
       10/4 = 2
       10.0/4 = 2.5
       100/3 = 33

 */
public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("12" + 1 ); // 121, Concatenation


        System.out.println(10 +20); // 30, Addition
        System.out.println(100-50); // 50 ,Subtraction
        System.out.println(10*6); // 60,Multiplications


        System.out.println(100/3); // 33
        System.out.println(10.0/4);// 2.5
        System.out.println(10/4.0);//2.5
        System.out.println(10/5d); // 2.5


        int a = 100;
        double b = a/6;
        System.out.println(b);

        double c = a/6.0; // 16.66666...
        System.out.println(c);







    }

}
