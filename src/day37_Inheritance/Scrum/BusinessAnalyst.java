package day37_Inheritance.Scrum;

public class BusinessAnalyst extends Employee {


    public BusinessAnalyst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender,"Business Analyst", id, salary, companyName);
    }


    public void analyse(){
        System.out.println(jobTitle+ " "+ name+ " is analysing documents");
    }



}
