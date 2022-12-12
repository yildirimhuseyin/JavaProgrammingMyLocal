package day08_IfStatments;

public class LogicalOperator {

    public static void main(String[] args) {
        // &&

        String name = "Daniel";
        int age =34;
        String citizen = "USA";

        boolean isEligible = age>=18 && citizen == "USA";
        //                    18>=18 && "USA" == "USA"
        //                     True  &&    true =====>>> Final result is True ( in the & boolean if one is false result is always false)

        System.out.println( name+" is eligible to vote: "+isEligible);

        System.out.println("------------------------------------------------------");

        String name2 = "Josh";

        int creditScore = 620;
        int age2 = 23;
        int income = 40000;

        boolean isEligible2 = creditScore>= 700 && age >=21 && income == 60000;

        System.out.println(name2+" is eligible for loan: " + isEligible2);

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3>= 18 && ( gender == 'M'|| gender == 'F');

        System.out.println( name3+" is eligible to register: " +isEligible3);


        System.out.println("-----------------------------------------------------------");

        String name4 = "James";

        String countryOfBirth = "USA";

        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen ==true;
//                                 True              //       False

        System.out.println(name4+ " is eligible to apply to US citizenship: "+ isEligible4);

        System.out.println("-----------------------------------------------------------");

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >=3.5 || familyIncome <=60000;

        System.out.println(student+ " is eligible for scholarship: "+isEligible5);

        System.out.println("-----------------------------------------------------------");

        boolean result2 = true;
        System.out.println("result2 = " + result2);
        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        System.out.println("-----------------------------------------------------------");

        int score = 85;
        boolean passed = score >=60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);



    }
}
