package day08_IfStatments;
/*
     90-100====>> Excellent
     80-89 ===>>  Great
     70-79 ====>> Good
     60-69=====>> Passed
     0-59 ====>> Failed

 */
public class GradeReport {


    public static void main(String[] args) {
/*

        System.out.println( true ==!false); // true statement
        System.out.println(!false == false); // false
        System.out.println(!false == true); // true

        System.out.println(!!false); // false
        System.out.println(!!!true); // false
 */

        int score = 85;// Score is  btw 80-90

        boolean a = score>=90 && score<=100;
        boolean b = score>=80 && score<=90; // boolean b = score>=80 && !a;
        boolean c = !a && !b && score>=70; // not a and b but greater than 70
        boolean d = score>=60 && score <=69;
        boolean f = score>=0 && score <=59;

        if(a) { // If the student made an A
            System.out.println("Excelent");
        }

        if(b) { // If the student made an B
            System.out.println("Great");
        }

        if(c){ // If the student made an C

            System.out.println("Good");
        }

        if(d){ // If the student made an D
            System.out.println("Passed");
        }

        if(f){ // If the student made an F
            System.out.println("Failed");
        }






    }
}
