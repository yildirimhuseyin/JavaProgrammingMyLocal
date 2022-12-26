package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {


    public static void main(String[] args) {


        System.out.println("Hello");

        // sleep(2.5); // Exception handled by throws Keyword

        System.out.println("Hello world");


        System.out.println("---------------------------");


        System.out.println("Hello");


        MorningWorkOut.sleep(2.5); // Exception handled by try & catch

        System.out.println("Cydeo");

    }


    public static void sleep(double second) throws InterruptedException {

        Thread.sleep((long) (second * 1000));

    }
}