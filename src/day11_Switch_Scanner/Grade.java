package day11_Switch_Scanner;

public class Grade {


    public static void main(String[] args) {

        char point = 'D';

        String result = "";



        switch (point){
            case 'A':
              result =  "Excellent";
                break;
            case 'B':
                result = "Great job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Point is not valid";
        }

        System.out.println(result);



    }



}
