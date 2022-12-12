package day10_NestedIf;

public class GradeReport2 {


    public static void main(String[] args) {

/*

        int score = 95;
        String result = ""; // temporary

        if (0<=score && score<=100){ // If the score is valid there is 5 possibilities

            if (90<=score){ // false if score score<90
                result = "Excellent";
            } else if (80<=score) { // false if score score<80
                result="Great";
            } else if (70<=score) { // false if score score<70
                result="Good";
            } else if (60<=score) {// false if score score<60
                result="Passed";
            }else {
                result="Failed";
            }


        }else { // if the score is not valid
            result="Invalid score";
        }



*/



        /*
        // solutions 2 Only ternaries
        int score = 95;
       String result =  (0<=score && score<=100)? (90<=score)? "Excellent" :(80<=score)? "Great" :(70<=score)? "o" :(70<=score)? "Good"
               :(60<=score)? "Passed" : "Failed" : "Invalid score";

        System.out.println("result = " + result);



*/



        System.out.println("-------------------------------------------");
        // solution3:
        int s = 95;
        String result2 = "";

        if (s >= 0 && s <= 100) { // if the s is valid (0 ~ 100 )

            result2 = (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed";

        } else { // if the s is NOT valid
            result2 = "Invalid Score";
        }

        System.out.println(result2);
    }
}
