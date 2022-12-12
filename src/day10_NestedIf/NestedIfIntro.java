package day10_NestedIf;

public class NestedIfIntro {


    public static void main(String[] args) {

        int score = 95;


        if (0<score && score<100){ // if the score is valid
            if (score>=60){ // if student passed the exam
                System.out.println("Passed");
            }else { // if the student failed exam
                System.out.println("Failed");
            }
        }else{ // if the condition is not valid
            System.out.println("Invalid score");

        }


        System.out.println("--------------------------------------------------------");

        int age = 25;
        boolean hasId = true;



        if (hasId) { // if the person has ID

            if (age >= 21) { //If the person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            } else { // If the person under 21 years old
                System.out.println("Not eligible to buy alcohol");
            }
        }else { // if person does not have an ID
            System.out.println("You must have ID to buy alcohol");
        }

        System.out.println("--------------------------------------------------------");


        int number =7;


        if (1<=number&& number<=7){ // if the number is valid

            if (number==1){
                System.out.println("Monday");
            } else if (number==2) {
                System.out.println("Tuesday");
            }else if (number==3) {
                System.out.println("Wednesday");
            }else if (number==4) {
                System.out.println("Thursday");
            }else if (number==5) {
                System.out.println("Friday");
            }else if (number==6) {
                System.out.println("Saturday");
            }else {
                System.out.println("Saturday");
            }


        }else {// if the number is not valid
            System.out.println("Invalid number");
        }







    }
}
