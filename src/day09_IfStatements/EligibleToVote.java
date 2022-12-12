package day09_IfStatements;

public class EligibleToVote {


    public static void main(String[] args) {

        String name = "Jeroen";
        int year = 17;
        String citizenship = "Netherlands";

        boolean eligibleToVote = year>18 && citizenship == "Netherlands";

        if (eligibleToVote){
            System.out.println(name+" is eligible to vote");
        }
        else {
            System.out.println(name+ " is not eligible to vote");
        }



    }
}
