package day10_NestedIf;
/*
if score :
90-100 = Excellent
80-89 = Great
70-79 = Good
60-69 = Passed
0-59 = failed

 */
public class GradeReport {


    public static void main(String[] args) {


        int score = 95;
        String result = ""; // temporary

        if (0<=score && score<=100){ // If the score is valid there is 5 possibilities

            if (90<=score){ // false if score score<90
                result = "Excellent";
            } else if (80<=score) { // false if score score<80
                result="Great";
            } else if (70<=score) { // false if score score<70
                result="Great";
            } else if (60<=score) {// false if score score<60
                result="Great";
            }else {
                result="Failed";
            }


        }else { // if the score is not valid
            result="Invalid score";
        }


        System.out.println(result);

    }
}
