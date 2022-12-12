package day09_IfStatements;
/*
3. Write a program that can check if the person is eligible to buy alcohol
 */
public class EligibleToBuyAlcohol {


    public static void main(String[] args) {


        String name = "Osman";
        int year = 16;

        boolean eligibleToBuyAlcohol = year>18;

        if (eligibleToBuyAlcohol){

            System.out.println(name+ " is eligible to buy alcohol");
        }
        else {
            System.out.println(name+" is not eligible to buy alcohol");
        }


    }
}
