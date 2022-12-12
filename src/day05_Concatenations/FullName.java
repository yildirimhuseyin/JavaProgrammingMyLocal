package day05_Concatenations;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Hüseyin";
        String lastName = "Yıldırım";
        int age = 26;
        String jobName = "SDET";
        String companyName = " Apple Inc.";
        double salary = 1000000.58;

        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is " + fullName);
        System.out.println(fullName + " is " + age + " years old.");
        System.out.println(fullName + " is " + jobName + ", works at " + companyName + " and "+ fullName +"'s" +" salary is $"+ salary);


    }



}
