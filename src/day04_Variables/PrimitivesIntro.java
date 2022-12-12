package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {



            byte age = 38;                // age: 38 years old

                                          //Weight: 160 Pounds byte weight = 160;( cannot use byte because 160 is out of range for byte
                                        // byte weight = -129 also cannot use
            short weight = 160;
            short num = -129;                  // 160 and -129 is in the range of short primitives

                                                // Salary: 100000
                                                // short salary = 100000;   // cannot be used like this because 100000 is ot of this short's range
            int salary = 100_000;              // we can use int in here because 100000 is in the range of in and INT İS THE PREFERRED DATA TYPE FOR İNTEGER NUMBERS
                                               //  we are using "_" instead of "," in java to make more readable
            long asset = 3_000_000_000L;        // We are forcing compiler ot accept long by giving L at the and of count

        float tax = 0.26F;     // tax:0.26 And by adding "F" forcing compiler to accept

         double PI = 3.14;




        char ch1 = '#';     // # char dezign to decribe single character
        System.out.println("ch1 = " + ch1);
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        char grade = 'A';
        char yesOrNo = 'Y';



        boolean isEmployed = true;
                                         // using this boolean  primitives in the only true false conditions.
        boolean liar = false;
        }
}
