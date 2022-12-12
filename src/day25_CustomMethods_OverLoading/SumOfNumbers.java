package day25_CustomMethods_OverLoading;
/*
Warmup tasks:
	Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */
public class SumOfNumbers {


    public static void main(String[] args) {


        int sumOf2Number= sumOf2Number(6,7);
        System.out.println("sumOfTwoNumber = " + sumOf2Number);

        int sumOf3Number= sumOf3Number(6,7,9);
        System.out.println("sumOf3Number = " + sumOf3Number);

        int sumOf4Number= sumOf4Number(6,7,9,10);
        System.out.println("sumOf4Number = " + sumOf4Number);

    }

    //  1. create a method that can find the sum of two numbers
    //	                    method name: sumOf2Numbers
    public static int sumOf2Number(int num1, int num2){

        return num1+num2;

    }

    // 2. create a method that can find the sum of three numbers
    //	                    method name: sumOf3Numbers
    public static int sumOf3Number(int num1, int num2,int num3){

        return num1+num2+num3;

    }

    // 3. create a method that can find the sum of four numbers
    //	                    method name: sumOf4Numbers
    public static int sumOf4Number(int num1, int num2,int num3, int num4){

        return num1+num2+num3+num4;

    }


}
