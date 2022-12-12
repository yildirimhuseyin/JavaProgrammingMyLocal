package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {

    public static void main(String[] args) {

                     // Implicit casting


        byte a = 100;
        short b = a;  // (short)a         //  ** We can assign primitives to each other **
        int c = b;   // (int)b           // ** As long as we are assigning smaller primitives to larger(range) primitives it will be done by implicitvly**
        long d = c; //  (long)c         // double > float > long > int > short > byte
        float e = d;
        double f = e;


        System.out.println("---------------------------------");

          //            "Explicit Casting"

        // Larger primitive type cannot be directly assigned to smaller primitives.( needed to be cast ed manually


         int x = 55;
         short y = (short)x; // "EXPLİCİT CASTİNG"this is how we can assign bigger to smaller

        System.out.println( y +  " : "+ x );

        long j = 1000000;
        short k = (short)j;

        System.out.println(j+" : "+k);

        double l = 2.5;
        float m = (float)l;

        double n = 10.8;
        int s = (int)n;
        System.out.println( s+ " : "+n);

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1+ " : "+s1);

        float f1 = 30.4F;
        long l1 = (long) f1;

        System.out.println(f1+ " : " + l1);







    }
}
